package utilities;

public class Numeric_utilities {
	
	public static int numberofdigits (int n){
		
		int digitcount=0;
		
		while(n>=1) {
			digitcount++;
			n/=10;
		}
		
		return digitcount;
	}
	
	public static boolean isprime(int n){
		
		boolean isprime=true;
		
		for(int i=2;i<n/2;i++){
			
			if (n%i==0) isprime=false;
		}
		
		return isprime;
		
	}
	
	public static int gcd(int n1,int n2){
		
		int less;
		
		
		less=(n1>n2)?n2:n1;
				
		while(n1%less!=0 || n2%less!=0){
			less--;
			
		}
		
		return less;
				
		
	}
	
	public static boolean ispalindrome(int n){
		
		int digitcount=0;
		int nbuffer=n;
		int nbuffer2=n;
		int result=0;
		
		while (nbuffer>=1){
			
			nbuffer/=10;
			digitcount++;
		}
		
		while(n>=1){
			
			result+=n%10 * (Math.pow(10, digitcount-1));
			n/=10;
			digitcount--;
						
		}
		
		if (nbuffer2==result) return true; 
		else return false;
		
	}
		
public static int reverse(int userinput){
		
		int digitcount=0;
		int buffer=userinput;
		int result=0;
		
		while (buffer>=1){
			
			buffer/=10;
			digitcount++;
		}
		
		while(userinput>=1){
			
			result+=userinput%10 * (Math.pow(10, digitcount-1));
			userinput/=10;
			digitcount--;
						
		}
		
		return result;
		
	}


public static int sumdigit(int number){
	
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
