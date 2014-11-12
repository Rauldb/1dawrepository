package javapractice;
import java.util.Scanner;

public class sumdigits {
	
	public static void main(String[] args){
	
		int number;		
		int solution;
		
		Scanner input=new Scanner(System.in);
		
		
				
		while(!input.hasNextInt() ) {
			System.out.println("Please enter an integer, and nothing else");
			input.next();
			}
		
		number=input.nextInt();
		solution=digitsum(number);
		System.out.println("The sum of the number "+number+" digits is "+solution);
		input.close();
					
	}
	
	
	public static int digitsum(int number){
		
		int buffer;
		int digitcount=0;
		int solution=0;
		
		buffer=number;
		
		while(buffer>=1){
			digitcount++;
			buffer/=10;
		}
		
		while(digitcount>0){
				int rest=0;
				solution+=number%10 - rest;
				rest+=number%10;
				number/=10;
				digitcount--;				
				}
		
		return solution;
	}
	
				
}
		
	
		
		
		
		
		
	

		
	
	


