package javapractice;

public class array {
	
	public static void main(String[] args){
	
		int[] array=new int[5];		
		
		for(int i=1;i<array.length;i++){
			
			array[i]=i+array[i-1];
			System.out.println(array[i]);
		}

	
	}
	
	
}
	
	
