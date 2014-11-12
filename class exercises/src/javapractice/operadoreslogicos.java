package javapractice;

import javax.swing.JOptionPane;

public class operadoreslogicos {
	
	public static void main (String[] args){
		
		String numero=JOptionPane.showInputDialog(" Enter a number to test ");
		int num = Integer.parseInt(numero);
				
		if ( (num % 2==0) && (num %3==0 ) )	System.out.println(" It's divisible by 2 and 3 ");
		if ( (num % 2==0) || (num %3==0 ) ) System.out.println(" It's divisible by 2 or 3 ");
		if ( (num % 2==0) ^ (num %3==0 ) ) System.out.println(" It's divisible by 2 or 3 but not both ");
		if ( !(num % 2==0) && !(num %3==0 ) )	System.out.println(" It isn't divisible by 2 nor 3 ");
	}
	
	}


