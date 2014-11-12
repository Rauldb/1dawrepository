package javapractice;
import java.util.Scanner;

public class quadratic_equation {
	
	public static void main (String[] args){
		
		double x1=0;
		double x2=0;
		double a;
		double b;
		double c;
		double square;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the value for the variabe a");
		a=input.nextDouble();
		System.out.println(" Enter the value for the variabe b");
		b=input.nextDouble();
		System.out.println(" Enter the value for the variabe c");
		c=input.nextDouble();
		
		square = (b*b-(4*a*c));
				
		if ( square < 0 ) System.out.println("The equation has no solution");
		else {
			x1= ( (-b + Math.sqrt(square)/(2*a) ) ) ;
			x2= ( (-b - Math.sqrt(square)/(2*a) ) ) ;
			}
			if (x1==x2)	System.out.println("The equation has 1 solution: " +x1 );
			else System.out.println("The equation has 2 solutions: " +x1 +"and " +x2 );
			input.close();
			
		
	

										}
	

								}

