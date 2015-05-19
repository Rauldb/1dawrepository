package jdbc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JdbcTest extends JFrame implements ActionListener
{
	
	JdbcTest(){
		this.setTitle("Database Connection");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.add(panel);
		inituielements();
		
	}
	
	String[] driverlist={"oracle.jdbc.driver.OracleDriver","com.mysql.jdbc.Driver"};
	String[] urllist={"jdbc:oracle:thin:@localhost:1521:xe","jdbc:mysql://localhost:3306/"};
	String[] optionlist={"Oracle DB","MySql DB"};
	JPanel panel=new JPanel();
	String driver;
	String url;
	
	JComboBox driveroptions=new JComboBox(driverlist);
	JComboBox urloptions=new JComboBox(urllist);
	JButton test=new JButton("Test");
	
	
	
	public void inituielements(){
		driveroptions.addActionListener(this);
		urloptions.addActionListener(this);
		test.addActionListener(this);
		panel.add(driveroptions);
		panel.add(urloptions);
		panel.add(test);
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
		
		if (e.getSource()==urloptions){
			
			Jdbc connection=new Jdbc(driver,url);
			connection.openConnection();
			ArrayList<Map<String, String>> output = connection.query(
					"select * from employees where employee_id < 105");
			for (int i = 0; i < output.size(); i++)
			{
				System.out.println(output.get(i));
		}
		
		connection.closeConnection();
		
		
	}
	

	
	
	
	
	}
	
}
