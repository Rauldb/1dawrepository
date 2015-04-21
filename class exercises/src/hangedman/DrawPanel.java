package hangedman;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class DrawPanel extends JPanel { // Panel where we draw the HangedMan doodle
	
	private int mistakes=0;
	
	public DrawPanel(int mistakes){
		
		this.mistakes=mistakes;
		
	}
	
	public void setmistakes(int mistakes){
		
		this.mistakes=mistakes;
}
	
	private void drawnoose(Graphics g){
		
		Graphics g2d = (Graphics2D) g;
		g2d.drawLine(100, 20 , 200, 20);
		g2d.drawLine(150, 20, 150, 40);
		
	}
	
	
	private void drawhead (Graphics g){
		
		Graphics g2d = (Graphics2D) g;
		g2d.drawOval(140, 40, 20, 20);
		
	}
	
	private void drawtorso(Graphics g){
		Graphics g2d = (Graphics2D) g;
		g2d.drawLine(150, 60, 150, 90);
	}
	
	private void drawarms(Graphics g){
		
		Graphics g2d = (Graphics2D) g;
		g2d.drawLine(135, 70, 165, 70);
	}
	
	private void drawleftleg(Graphics g){
		
		Graphics g2d = (Graphics2D) g;
		g2d.drawLine(140, 105, 150, 90);
	}
	
	private void drawrightleg(Graphics g){
		
		Graphics g2d = (Graphics2D) g;
		g2d.drawLine(160, 105, 150, 90);
	}
	
@Override

public void paintComponent(Graphics g){
	super.paintComponent(g);
	
	switch(mistakes){
	case 0:
		break;
	case 1:
		drawnoose(g);
		break;
	case 2:
		drawnoose(g);
		drawhead(g);
		break;
	case 3:
		drawnoose(g);
		drawhead(g);
		drawtorso(g);
		break;
	case 4:
		drawnoose(g);
		drawhead(g);
		drawtorso(g);
		drawarms(g);
		break;
	case 5:
		drawnoose(g);
		drawhead(g);
		drawtorso(g);
		drawarms(g);
		drawleftleg(g);
		break;
	case 6:
		drawnoose(g);
		drawhead(g);
		drawtorso(g);
		drawarms(g);
		drawleftleg(g);
		drawrightleg(g);
		break;
	case 7:
		drawnoose(g);
		drawhead(g);
		drawtorso(g);
		drawarms(g);
		drawleftleg(g);
		drawrightleg(g);
		break;
	}
	
}


	
	

}
