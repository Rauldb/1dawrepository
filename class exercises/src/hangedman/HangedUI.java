package hangedman;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HangedUI extends JFrame implements ActionListener {
	
	
	private JPanel textpanel;
	private DrawPanel drawp;
	private JTextField userinput;
	private JLabel inst;
	private JTextArea gamestate;
	private HangedMan game=new HangedMan();	
	private Graphics head;
	
	
	
	
	public	HangedUI(){
		this.setLayout(new BorderLayout());
		initiate();
	}
	
	
	public void initiate(){
		
		this.setTitle("Hangedman Game");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		textpanel=new JPanel();
		textpanel.setSize(400, 600);
		textpanel.setBackground(Color.GRAY);
		drawp = new DrawPanel(0);
		drawp.setSize(400, 600);
		drawp.setBackground(Color.WHITE);
		
		
		
		inst=new JLabel("Try to guess the word, enter a letter");
		userinput=new JTextField(10);
		userinput.addActionListener(this);		
		gamestate=new JTextArea(5,10);
		gamestate.setEditable(false);		
		textpanel.add(inst);
		textpanel.add(userinput);
		textpanel.add(gamestate);
		textpanel.setVisible(true);		
		this.add(textpanel,BorderLayout.WEST);
		this.add(drawp,BorderLayout.CENTER);		
		this.setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent event){
		String input=userinput.getText();
		if(game.youlose() || game.youwin()){
			if(game.youwin()) JOptionPane.showMessageDialog(textpanel, "YOU WIN");
			else		JOptionPane.showMessageDialog(textpanel, "GAME OVER");
		}
		else	{			
		game.checkLetter(input.charAt(0));
		gamestate.append(game.getMaskWord()+"\n");
		userinput.selectAll();
		drawp.setmistakes(game.getMistakes());
		drawp.repaint();
		
		}
			
	}
		
		
				
	
	
	
	
	
	

}
