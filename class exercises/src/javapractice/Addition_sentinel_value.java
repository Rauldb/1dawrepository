package javapractice;

import javax.swing.JOptionPane;

public class Addition_sentinel_value {
	
		public static void main (String[] args){
			int bankaccount=0;
			int userinput=1;
			
			while(userinput!=0){
				System.out.println("You have " + bankaccount + " Euros in your bank");
				userinput=Integer.parseInt(JOptionPane.showInputDialog("Enter the ammount you want to deposit, enter zero to exit"));
				bankaccount+=userinput;				
			}
		System.out.println("Thanks for using our service, have a good day");	
		}
}
