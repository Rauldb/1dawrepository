package javapractice;

public class BinarySearch {
	
	public static void main(String[] args){
		
		int key=15;
		if(search(key)==-1) System.out.println("The key was not found in the array");
		System.out.println("La clave es "+search(key));
		
		
		
	}
	
	
	public static int search(int key){
		
		int[] array=new int[100];
		for(int i=0;i<array.length;i++) array[i]=i;
		int middle=array.length/2;
		int firstindex=0;
		int secondindex=0;
		if(key>middle){
			firstindex=array.length/2;
			secondindex=array.length;
		}else secondindex=array.length/2;
		
		for(int i=firstindex;i<=secondindex;i++){
			
			if(i==key)return array[i];
			if (secondindex==key) return array[secondindex];
			secondindex--;			
		}
		return -1;
		
		
	}

}
