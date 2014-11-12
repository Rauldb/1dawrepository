package javapractice;

import javax.swing.JOptionPane;

public class palindrome {
	
	
	public static void main(String[] args){
		
		int reverseinput;
		int userinput=Integer.parseInt(JOptionPane.showInputDialog("Enter a number to test, i'll tell you if it's a palindrome"));
		reverseinput=reverse(userinput);
		System.out.println("Userinput : " +userinput + "      Reverse input: " + reverseinput);
		if (userinput==reverseinput) System.out.println("It's a palindrome");
		else System.out.println("It isn't a palindrome");
		
		
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
	
	

}
