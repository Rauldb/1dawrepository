package javapractice;

import javax.swing.JOptionPane;

/* Write a program that makes you guess a number between 1 and 100. Give the user hints (too low 
 * or too high) and keep asking until he guesses it right.
 */


public class Guessthenumber {
		
		public static void main(String[] args) {
	
			int rand=(int) (Math.random() * 100 );
			int userinput=Integer.parseInt(JOptionPane.showInputDialog("Try to guess the random number (1-100) "));
				while (rand!=userinput) {
					if (userinput<rand) System.out.println("too low");
					else System.out.println("too high");
					userinput=Integer.parseInt(JOptionPane.showInputDialog("Try to guess the random number (1-100) "));
				}
				
				System.out.println("Congratulations! You guessed it right.");
				System.out.println("The random number was " + rand);
	
		}

}
