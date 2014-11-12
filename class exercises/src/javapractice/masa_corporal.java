package javapractice;

import javax.swing.JOptionPane;

public class masa_corporal {
	
	public static void main (String[] args) {
		
		String altura = JOptionPane.showInputDialog(" Introduce tu altura ");
		String peso = JOptionPane.showInputDialog(" Introduce peso ");
		double intaltura = Double.parseDouble(altura);
		double intpeso = Double.parseDouble(peso);
		double masa = intpeso / (intaltura*intaltura);
		
				
		if (masa >=30) System.out.println( "Obese ");
		else if (masa >=25) System.out.println( "Overweight");
		else if (masa >=18.5)System.out.println( "Normal");
		else System.out.println( "Underweight");
		
		System.out.println("Your body mass is " + masa);
		
		
	

}
	
}
