package proyecto1ertrimestre;

import java.util.Scanner;
import java.util.ArrayList;

public class Polynomials {

	public static void main(String[] args) {

		int option;
		boolean polyinit = false;
		ArrayList<int[]> list = new ArrayList<int[]>();

		do {
			option = menu();
			switch (option) {
			case 1:
				int[] buffer = enterpolynomial();
				list.add(buffer);
				polyinit = true;
				break;
			case 2:
				if (!polyinit) {
					System.out.println("You didn't enter any polynomials yet");
					break;
				}
				System.out.println("Choose a polynomial to evaluate");
				for (int i = 0; i < list.size(); i++) {
					int[] buffer2 = (int[]) list.get(i);
					System.out.println((i + 1) + " - " + display(buffer2));
				}
				int evaloption = -1;
				do {
					evaloption = integerinput();
					if (evaloption < 0 || evaloption > list.size())
						System.out
								.println("That polinomy doesn't exist, please select one from the list");
				} while (evaloption < 0 || evaloption > list.size());
				System.out.println("Choose a value for X");
				int xvalue = integerinput();
				System.out.println(display(list.get(evaloption - 1)));
				System.out.println("The Sum of the polinomy is "
						+ evaluate(list.get(evaloption - 1), xvalue) + "\n");
				break;

			case 3:
				if (!polyinit) {
					System.out.println("You didn't enter any polynomials yet");
					break;
				}
				if (list.size() < 2) {
					System.out
							.println("You need to introduce at least 2 polynomials so you can sum them");
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					int[] buffer2 = (int[]) list.get(i);
					System.out.println((i + 1) + " - " + display(buffer2));
				}
				int sumoption1 = -1;
				int sumoption2 = -1;
				System.out.println("Select 2 polynomials to sum");
				System.out.println("Select polynomial 1");
				while (sumoption1 < 0 || sumoption1 > list.size())
					sumoption1 = integerinput();
				System.out.println("Select polynomial 2");
				while (sumoption2 < 0 || sumoption2 > list.size())
					sumoption2 = integerinput();
				int[] buffersuma = list.get(sumoption1 - 1);
				int[] buffersumb = list.get(sumoption2 - 1);
				System.out.println(display(buffersuma));
				System.out.println(display(buffersumb));
				System.out.println("----------------------------------------");
				System.out.println(display(sum(buffersuma, buffersumb)) + "\n");

				break;
			case 4:
				if (!polyinit) {
					System.out.println("You didn't enter any polynomials yet");
					break;
				}
				if (list.size() < 2) {
					System.out
							.println("You need to introduce at least 2 polynomials so you can sum them");
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					int[] buffer2 = (int[]) list.get(i);
					System.out.println((i + 1) + " - " + display(buffer2));
				}
				int multoption1 = -1;
				int multoption2 = -1;
				System.out.println("Select 2 polynomials to multiply");
				System.out.println("Select polynomial 1");
				while (multoption1 < 0 || multoption1 > list.size())
					multoption1 = integerinput();
				System.out.println("Select polynomial 2");
				while (multoption2 < 0 || multoption2 > list.size())
					multoption2 = integerinput();
				int[] buffermulta = list.get(multoption1 - 1);
				int[] buffermultb = list.get(multoption2 - 1);
				System.out.println(display(buffermulta));
				System.out.println(display(buffermultb));
				System.out.println("----------------------------------------");
				System.out.println(display(multiply(buffermulta, buffermultb)) + "\n");
				break;
			case 5:
				if (!polyinit) {
					System.out.println("You didn't enter any polynomials yet");
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					int[] buffer2 = (int[]) list.get(i);
					System.out.println((i + 1) + " - " + display(buffer2));
				}
				break;

			}

		} while (option != 0);

	}

	public static int menu() { // Menu method

		System.out.println("POLYNOMIALS");
		System.out.println("-----------------------------");
		System.out.println("1 - Enter a polynomial");
		System.out.println("2 - Evaluate a polynomial");
		System.out.println("3 - Sum polynomials");
		System.out.println("4 - Multiply polynomials");
		System.out.println("5 - Display polynomial");
		System.out.println("0 - Exit ");

		int option = integerinput();
		return option;
	}

	public static int[] enterpolynomial() { // Prompts the user to enter a
											// polynomial , grade by grade.

		int grade;
		int monomial;
		System.out.println("Enter the grade of the polynomial");
		grade = integerinput();
		int[] polynomial = new int[grade + 1];
		for (int i = 0; i < polynomial.length; i++) {
			System.out.println("Enter the coefficient of the grade " + i
					+ " monomial (Enter a 0 to skip a grade) ");
			monomial = integerinput();
			polynomial[i] = monomial;
		}
		return polynomial;

	}

	public static int[] sum(int a[], int b[]) { // This method sums 2
												// polynomials

		if (a.length > b.length) {
			for (int i = 0; i < b.length; i++)
				a[i] += b[i];
			return a;
		}
		for (int i = 0; i < a.length; i++)
			b[i] += a[i];
		return b;

	}
	
	
	public static int[] multiply(int a[], int[] b){
		
		int[] resultmult=new int[a.length*b.length];
		
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]!=0){
				for(int j=0;j<b.length;j++){
					
				  if(b[j]!=0)resultmult[i+j]+=(a[i]*b[j]);
				}
			}
			
		}
		return resultmult;
	}

	public static int evaluate(int[] polynomial, int xvalue) { // This method
																// evaluates a
																// polynomial

		int resulteva = 0;
		for (int i = 0; i < polynomial.length; i++)
			resulteva += polynomial[i] * Math.pow(xvalue, i);
		return resulteva;

	}

	public static String display(int[] polynomial) {	// This method displays a polynomial as closely as possible to how we write it on paper

		String display = "";
		for (int i = polynomial.length - 1; i >= 0; i--) {

			if (polynomial[i] != 0) {
				
				if(polynomial[i]>=0){
					if (i == 0)	display += "+" + polynomial[i];
					else display +="+"+polynomial[i] + "X^" + i;
					}
				else{
					if (i == 0)	display +=polynomial[i];
					else display +=polynomial[i] + "X" + "^" + i;
					}
		}
		display+=" ";
			
	   }
		return display;
	}

	public static int integerinput() { // This method doesn't let you introduce
										// anything that isn't a int value, it
										// solves most user generated
										// exceptions.
		Scanner input = new Scanner(System.in);
		while (!input.hasNextInt()) {
			System.out.println("Enter an integer please");
			input.next();
		}

		return input.nextInt();

	}

}