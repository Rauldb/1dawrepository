package mymath;
import java.util.Scanner;

public class TestQuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a,b,c;
		System.out.println("Value for a");
		a=input.nextInt();
		System.out.println("Value for b");
		b=input.nextInt();
		System.out.println("Value for c");
		c=input.nextInt();		
		QuadraticEquation equation=new QuadraticEquation(a,b,c);
		
		if (equation.getDiscriminant()<0){
			System.out.println("There's no solution");
			}else {
				if (equation.getDiscriminant() == 0 ) System.out.println("Only one solution: "+ equation.getRoot1());
					else{
						System.out.println("Two solutions");
						System.out.println("Root1: "+equation.getRoot1());
						System.out.println("Root2: "+equation.getRoot2());
						}
			}
		input.close();
	}

}
