package javapractice;

import javax.swing.JOptionPane;

public class num_aleat {
	
	public static void main (String[] args) {
		
		int a = (int)(Math.random()*9);
		int b = (int)(Math.random()*9);
		int resint;
		
		String resultado = JOptionPane.showInputDialog("What's the result for the operation " + a +" minus " + b + " ?" );
		resint = Integer.parseInt(resultado);
		if (resint == a-b) System.out.println(" Right answer ");
		else System.out.println("Wrong answer");	
		
		
		
		
		
		
	}

}
