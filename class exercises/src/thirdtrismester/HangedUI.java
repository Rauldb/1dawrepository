package thirdtrismester;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangedUI extends JFrame {
	
	HangedUI(){
		initiate();
	}
	
	
	public void initiate(){
		this.setTitle("Hangedman Game");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
				
		JPanel textpanel=new JPanel();
		JTextField userinput=new JTextField(10);
		JLabel test=new JLabel("Try to guess the word");
		textpanel.add(test);
		textpanel.add(userinput);
		textpanel.setVisible(true);
		this.add(textpanel,BorderLayout.WEST);
		
		this.setVisible(true);
		
		
	}
	
	
	
	
	

}
