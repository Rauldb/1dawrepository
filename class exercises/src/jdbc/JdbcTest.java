package jdbc;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JdbcTest extends JFrame implements ActionListener
{
	
	JdbcTest(){
		this.setTitle("Database Connection");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(640,480);
		this.add(leftpanel,BorderLayout.WEST);
		this.add(rightpanel,BorderLayout.CENTER);
		inituielements();
		
	}
	
	String[] driverlist={"oracle.jdbc.driver.OracleDriver","com.mysql.jdbc.Driver"};
	String[] urllist={"jdbc:oracle:thin:@localhost:1521:xe","jdbc:mysql://localhost:3306/"};
	String[] optionlist={"Oracle DB","MySql DB"};
	JPanel leftpanel=new JPanel();
	JPanel rightpanel=new JPanel();
	String driver;
	String url;
	String userst;
	String passwordst;
	
	JComboBox driveroptions=new JComboBox(driverlist);
	JComboBox urloptions=new JComboBox(urllist);
	JButton test=new JButton("Connect to DB");
	JTextField user=new JTextField(20);
	JTextField password=new JTextField(20);
	JLabel driverlab=new JLabel("JDBC Driver\n");
	JLabel urllab=new JLabel("Database URL");
	JLabel userlab=new JLabel("Username");
	JLabel passlab=new JLabel("Password");
	JLabel status=new JLabel("No connection");
	
	
	
	public void inituielements(){
		driveroptions.addActionListener(this);
		urloptions.addActionListener(this);
		test.addActionListener(this);
		user.addActionListener(this);
		password.addActionListener(this);
		leftpanel.setLayout(new GridLayout(6, 1));
		leftpanel.add(driverlab);
		leftpanel.add(urllab);
		leftpanel.add(userlab);
		leftpanel.add(passlab);
		rightpanel.setLayout(new GridLayout(6,1));
		rightpanel.add(driveroptions);
		rightpanel.add(urloptions);
		rightpanel.add(user);
		rightpanel.add(password);
		rightpanel.add(test);
		rightpanel.add(status);
		this.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==driveroptions){
			driver=driverlist[driveroptions.getSelectedIndex()];
		}
		if (e.getSource()==urloptions){
			url=urllist[driveroptions.getSelectedIndex()];
		}	
		
		if (e.getSource()==user){
			userst=user.getText();
		}
		
		if (e.getSource()==password){
			passwordst=password.getText();
		}
		
		if (e.getSource()==test){
			
			if(driver!=null && url!=null && userst!=null && passwordst!=null){
			
			Jdbc connection=new Jdbc(driver,url,passwordst,userst);
			if(connection.openConnection()==true)	status.setText("Connected to "
			+driverlist[driveroptions.getSelectedIndex()]);
			connection.closeConnection();			
			}
		
		
	}
	

	
	
	
	
	}
	
}
