package javapractice;

import javax.swing.JOptionPane;

public class maxcommondiv_methods {
	
	
	public static void main(String[] args){
		
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
		int n2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
		while (n1!=0 && n2!=0){ // && negativo funciona como ||
			System.out.println(mcd(n1,n2));
			n1=Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
			n2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
			
		}
		
		
						
	}
	
	
	public static int mcd (int n1,int n2){
		
		int divisor;
		divisor=(n1<n2)?n1:n2;
		/*if (n1<n2) divisor=n1;
		else divisor=n2;
		*/
		
		while(n1%divisor!=0 || n2%divisor!=0){  // || negativo funciona como &&
			
			divisor--;
			
		}
		
		return divisor;
		
	}
	
	
	

}
