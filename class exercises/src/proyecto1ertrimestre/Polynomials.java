package proyecto1ertrimestre;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;



public class Polynomials {

	public static void main(String[] args) {

		// int[] testing = { 4, 0, 2, 0, 5 };
		// System.out.println(display(testing));
		
		int option;
		boolean polyinit = false;
		ArrayList<int[]> list=new ArrayList<int[]>();

		do {
			option = menu();
			switch (option) {
			case 1:
				int[] buffer=enterpolynomial();
				list.add(buffer);
				polyinit = true;
				break;

			case 2:
				if (!polyinit) {
					System.out.println("You didn't enter any polynomials yet");
					break;		
					}
				if(list.size()<2){
					System.out.println("You need to introduce at least 2 polynomials so you can sum them");
					break;
				}
				for(int i=0;i<list.size();i++){
					int[] buffer2=(int[])list.get(i);
					System.out.println((i+1)+" - "+display(buffer2));
					}
				System.out.println("Select 2 polynomials to sum");
				System.out.println("Select polynomial 1");
				int option1=integerinput();
				System.out.println("Select polynomial 2");
				int option2=integerinput();
				int[] buffera=list.get(option1);
				int[] bufferb=list.get(option2);
				
				
				
				break;
			case 3:
				break;
			case 4:
				if (!polyinit) {
					System.out.println("You didn't enter any polynomials yet");
					break;		
					}
				for(int i=0;i<list.size();i++){
					int[] buffer2=(int[])list.get(i);
					System.out.println((i+1)+" - "+display(buffer2));
					}								
				break;

			}

		} while (option != 0);

	}

	public static int menu() {

		Scanner input = new Scanner(System.in);
		System.out.println("POLYNOMIALS");
		System.out.println("-----------------------------");
		System.out.println("1 - Enter a polynomial");
		System.out.println("2 - Sum polynomials");
		System.out.println("3 - Multiply polynomials");
		System.out.println("4 - Display polynomial");
		System.out.println("0 - Exit ");

		int option = input.nextInt();
		return option;
	}

	public static int[] enterpolynomial() {

		Scanner input = new Scanner(System.in);
		int grade;
		int monomial;
		System.out.println("Enter the grade of the polynomial");
		grade = input.nextInt();
		int[] polynomial = new int[grade+1];
		for (int i = 0; i < polynomial.length; i++) {
			System.out.println("Enter the grade " + i
					+ " monomial of the polynomial");
			monomial = input.nextInt();
			polynomial[i] = monomial;
		}
		return polynomial;

	}

	public static int[] sum(int a[], int b[]) {

		if (a.length > b.length) {
			for (int i = 0; i < b.length; i++)
				a[i] += b[i];
			return a;
		}
		for (int i = 0; i < a.length; i++)
			b[i] += a[i];
		return b;

	}

	public static int evaluate(int[] polynomial, int xvalue) {

		int result = 0;
		for (int i = 0; i < polynomial.length; i++)
			result += polynomial[i] * Math.pow(xvalue, i);
		return result;

	}

	public static String display(int[] polynomial) {

		String display = "";
		for (int i = polynomial.length - 1; i >= 0; i--) {

			if (polynomial[i] != 0) {
				if (i == 0)
					display += "+ " + polynomial[i];
				else
					display += " " + polynomial[i] + "X" + "^" + i + " ";
			}
		}
		return display;

	}
	
	public static int integerinput(){
		Scanner input=new Scanner(System.in);
		while(!input.hasNextInt() ) {
			System.out.println("Enter an integer please");
			input.next();
		}
		
		return input.nextInt();
		
	}

}