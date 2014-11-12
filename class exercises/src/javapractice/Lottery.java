package javapractice;

import javax.swing.JOptionPane;

public class Lottery {
	
	public static void main (String[] args){
		
		String number=JOptionPane.showInputDialog(" Enter a 2 digit number, from 00 to 99 ");
						
		int num = Integer.parseInt(number);				
		int rand = (int) (Math.random() *99);
		int digit1=num / 10;
		int digit2=num % 10;
		int randigit1=rand /10;
		int randigit2=rand %10;
		
		 
		
			// Activate this loop for testing purposes
		 	/*
		 	int counter;
		 	for (counter=0;counter<10;counter++){
			
			number=JOptionPane.showInputDialog(" Enter a 2 digit number, from 00 to 99 ");
		
			num = Integer.parseInt(number);				
			rand = (int) (Math.random() *99);
			digit1=num / 10;
			digit2=num % 10;
			randigit1=rand /10;
			randigit2=rand %10;
			*/
		
			if (digit1==randigit1 && digit2==randigit2) System.out.println(" You won 10 grand , the winning number was " +randigit1 + randigit2 + " ,your input was " +digit1 +digit2);
			if (digit1==randigit2 && digit2==randigit1) System.out.println ("You won 3 grand , the winning number was " +randigit1 + randigit2 + " ,your input was " +digit1 +digit2);
			else if ( digit1==randigit1 || digit1==randigit2 || digit2==randigit1 || digit2==randigit2 ) System.out.println("You won 1 grand , the winning number was " +randigit1 + randigit2 + " ,your input was " +digit1 +digit2);
			if ( (digit1!=randigit1 && digit1!=randigit2) && (digit2!=randigit1 && digit2!=randigit2) ) System.out.println("Sorry, try again, the winning number was " +randigit1 + randigit2 + " ,your input was " +digit1 +digit2);
			
			}
		}
	// For loop closing bracket
	//}


