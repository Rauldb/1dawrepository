package javapractice;

import javax.swing.JOptionPane;

public class addition_quiz {

	public static void main(String[] args){
		
		/* Write a program that prompts the user to enter the solution to 10
		 * consecutive addition operations then tells him how many times he
		 * got it right, if he scored 7/10 or more he passes.
		 */
		
		int a=0;
		int b=0;
		int solution=0;
		int answer=0;
		int cont=0;
		int points=0;
		
			while(cont<10){
		
				a=(int) (Math.random() *10);
				b=(int) (Math.random() *10);
				solution=a+b;
				answer = Integer.parseInt(JOptionPane.showInputDialog("What's the solution to " +a +" + " +b));
				if (answer==solution)points++;
				cont++;
			
			
			}
		
		System.out.println("You scored " +points +" out of 10");
		if (points>=7) System.out.println("You pass");
		else System.out.println("You failed the test, try again");
		
		
		}
	
}
