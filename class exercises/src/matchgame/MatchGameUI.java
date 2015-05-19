package matchgame;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MatchGameUI extends JFrame implements ActionListener  {
	
	 private JButton[] buttongrid;
	 private final int rows=3;
	 private final int columns=4;
	 private JPanel panel=new JPanel(new GridLayout(rows,columns));
	 private ArrayList<String> imageurl=new ArrayList<String>();
	 private final String CARDBACK="img/cardback.png";
	 protected JButton CurrentButton;
	 protected JButton PreviousButton;
	 protected ArrayList<JButton> PressedButtons=new ArrayList<JButton>();
	 private Timer timer = new Timer(1500, new FlipListener());
	 
	 MatchGameUI(){
		
		this.setTitle("Matching game");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(panel);
		initimages();
		initbuttons();
		this.setVisible(true);
	 }
	 
	 public void initimages(){
		 
		 
		 String buffer;
		 
		 for(int i=0;i<(rows*columns/2);i++){
			 buffer="img/"+i+".png";
			 imageurl.add(buffer);
			 imageurl.add(buffer);
		 }
		 Collections.shuffle(imageurl);
		 
	 }
	 
	 
	 public void initbuttons(){
		 
		 buttongrid=new JButton[rows*columns];
		 
		 for(int i=0;i<buttongrid.length;i++){
			 
			 			 
			 buttongrid[i]= new JButton(new ImageIcon(CARDBACK));
			 buttongrid[i].setName(imageurl.get(i));
			 buttongrid[i].addActionListener(this);
			 panel.add(buttongrid[i]);
			 
		 }
		 
		 
		 		 
		 
	 }
	 
	 @Override
	 public void actionPerformed(ActionEvent event) {
		 
		 CurrentButton=((JButton)event.getSource());
		 CurrentButton.setIcon(new ImageIcon(CurrentButton.getName()));
		 PressedButtons.add(CurrentButton);
		 if(PressedButtons.size()%2==0){
			 timer.start();
		 }	else{
			 PreviousButton=PressedButtons.get(PressedButtons.size()-2);
			 	if(PreviousButton.getName().equals(CurrentButton.getName())){
			 		timer.stop();
			 		CurrentButton.removeActionListener(this);
			 		PreviousButton.removeActionListener(this);
			 	}else{
			 		timer.restart();
			 	}
			 
		 }
			  
			 
		 
		 
		
		 
		  
		 
		 
		 
	 }
	 
	 
}

	class FlipListener implements ActionListener{
		
		
		@Override
		public void actionPerformed(ActionEvent event){
			
		}
		
		
	}






