package javapractice;
import java.util.Scanner;
import utilities.Numeric_utilities;
import utilities.Display;

public class utilstest {
	
	public static void main(String[] args){
	
		int number=0;
		int number2=0;
		Scanner input=new Scanner(System.in);		
		int menu;
		boolean menuloop=true;
						

				
						
			while(menuloop) {
				
				System.out.println("Choose one of the options below");
				System.out.println("----------------------------------------------------");
				System.out.println("1 - Prime number test");
				System.out.println("2 - How many digits does the number have?");
				System.out.println("3 - Greatest common divisor of 2 numbers");
				System.out.println("4 - Palindrome number test");
				System.out.println("5 - Reverse an integer");
				System.out.println("6 - Sum the digits of an integer");
				System.out.println("0 - Exit this program");
				System.out.println("----------------------------------------------------");
				
				while(!input.hasNextInt()) {
					System.out.println("Enter a number between 1 and 6 please");
					input.next();
				}
				menu=input.nextInt();
				
				switch(menu){
						case 0:
							menuloop=false;
							break;
						
			
						case 1:	
							
							System.out.println("------------ PRIME NUMBER TEST ------------");
							System.out.println("Enter a number");
								while(!input.hasNextInt() ) {
								System.out.println("Enter an integer and nothing else please");
								input.next();
							}
							number=input.nextInt();							
							Display.clear();
							if (Numeric_utilities.isprime(number))System.out.println(number + " is prime");
							else System.out.println(number + " is not prime") ;
							System.out.println("Enter any value and press enter to return to the menu");
							input.next();							
							Display.clear();							
							break;
							
						case 2:
							
							System.out.println("------------ DIGIT SUM ------------");
							System.out.println("Enter a number");
								while(!input.hasNextInt() ) {
								System.out.println("Enter an integer and nothing else please");
								input.next();
							}
							number=input.nextInt();
							Display.clear();
							System.out.println(+number+" has "+Numeric_utilities.numberofdigits(number)+ " digits");
							System.out.println("Enter any value and press enter to return to the menu");
							input.next();							
							Display.clear();
							break;
							
						case 3:
							System.out.println("------------ GREATEST COMMON DIVISOR ------------");
							System.out.println("Enter the first number");
							int count=0;
							while(count<2){
								while(!input.hasNextInt() ) {
									System.out.println("Enter an integer and nothing else please");
									input.next();
								}
								count++;
								switch(count){
								case 1: number=input.nextInt(); System.out.println("Enter the second number"); break;
								case 2: number2=input.nextInt(); break;
								}
							}
							Display.clear();
							System.out.println(number+" and "+number2 +" GCD is "+utilities.Numeric_utilities.gcd(number, number2));
							System.out.println("Enter any value and press enter to return to the menu");
							input.next();							
							Display.clear();
							break;

						case 4:
							System.out.println("------------ PALINDROME TEST ------------");
							System.out.println("Enter a number");
								while(!input.hasNextInt() ) {
								System.out.println("Enter an integer and nothing else please");
								input.next();
							}
							number=input.nextInt();
							Display.clear();
							if (utilities.Numeric_utilities.ispalindrome(number)==true) System.out.println(number+" is a palindrome");
							else System.out.println(number+" isn't a palindrome");
							System.out.println("Enter any value and press enter to return to the menu");
							input.next();							
							Display.clear();
							break;
							
						case 5:
							System.out.println("------------ REVERSE AN INTEGER ------------");
							System.out.println("Enter a number");
								while(!input.hasNextInt() ) {
								System.out.println("Enter an integer and nothing else please");
								input.next();
							}
							number=input.nextInt();
							Display.clear();
							System.out.println(number+" ---REVERSE--- "+utilities.Numeric_utilities.reverse(number));
							System.out.println("Enter any value and press enter to return to the menu");
							input.next();							
							Display.clear();
							break;
							
						case 6:
							System.out.println("------------ SUM DIGITS ------------");
							System.out.println("Enter a number");
								while(!input.hasNextInt() ) {
								System.out.println("Enter an integer and nothing else please");
								input.next();
							}
							number=input.nextInt();
							Display.clear();
							System.out.println("The sum of the digits of "+number+" is "+utilities.Numeric_utilities.sumdigit(number));
							System.out.println("Enter any value and press enter to return to the menu");
							input.next();							
							Display.clear();
							break;
			
				}
			
			}
		
		
		
	input.close();	
	
	}
		
	
}
