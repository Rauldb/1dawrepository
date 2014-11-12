package javapractice;

import javax.swing.JOptionPane;

public class leap_year {

	public static void main (String[] args){
		
		String userinput=JOptionPane.showInputDialog(" Enter a year to test " );
		int year = Integer.parseInt(userinput);
		
		if ( (year % 4 ==0 && year % 100 !=0) || (year % 400 == 0) ) System.out.println("It's a leap year");
		else System.out.println(" It isn't a leap year ");
		
		
		
	}
	
}
