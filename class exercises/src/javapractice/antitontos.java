package javapractice;
import java.util.Scanner;

public class antitontos {
	
	public static void main(String[] args){
	
		int numero;
		Scanner input=new Scanner(System.in);
		
				
		while(!input.hasNextInt() ) {
			System.out.println("Enter an integer please");
			input.next();
		}
			numero=input.nextInt();
			System.out.println("Has introducido un entero, bien hecho campeon, tu numero es el " +numero);
		
		
		
		
	input.close();
	}
		
	
	

}
