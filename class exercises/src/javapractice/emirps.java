package javapractice;
import utilities.Numeric_utilities;
import java.util.Scanner;

public class emirps {
	
	public static void main(String[] args){
	
		Scanner input=new Scanner(System.in);
		int number=10;
		int reversenumber=0;
		int emirpcount=0;
		String emirptable="";
		
		
		
		
		
		while(emirpcount<50){
		
			reversenumber=Numeric_utilities.reverse(number);
			
			if(Numeric_utilities.isprime(number) && Numeric_utilities.isprime(reversenumber)) {
				 if(!Numeric_utilities.ispalindrome(number)){
					 emirptable+=number+" ";
					 emirpcount++;
					 if (emirpcount%10==0 && number!=10)emirptable+="\n";
				 }
								
				
			}
			number++;
			
		}
		
		System.out.println("EMIRP TABLE (50 FIRST NUMBERS)");
		System.out.println("------------------------------------------------------------");
		System.out.println(emirptable);
		input.close();
				
			
	}
		
}
	
	
	


