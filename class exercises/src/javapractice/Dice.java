package javapractice;

public class Dice {
	
	
	public static void main(String[] args){
		
		int[] dado=new int[6];
		
		int random;
		int cont=0;
		
		while(cont<100){
			random = (int) (Math.random() * 6);
			dado[random]++;
			cont++;			
		}
		
		for(int i=0;i<dado.length;i++){
			System.out.println((i+1)+"- "+dado[i]+" times");
		}
			
		
		
	}

}
