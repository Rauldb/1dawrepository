package javapractice;

public class BinarySearch {
	
	public static void main(String[] args){
		
		int key=15;
		if(search(key)==-1) System.out.println("The key was not found in the array");
		System.out.println("The key is "+search(key));
		
		
		
	}
	
	
	
	// Reescribir hallando el centro en cada iteracion hasta que se encuentre la clave
	
	/*public static int search(int key){
		
		int[] array=new int[100];
		for(int i=0;i<array.length;i++) array[i]=i;
		int initialindex=0;
		int finalindex=array.length-1;
		
		while(initialindex<=finalindex){
			
			int center=(initialindex+finalindex)/2;
			
			
		}
		
	}
	
	*/
	
	
	// No es optimo, reduce los ciclos pero hay que calcular en cada iteracion el centro
	// para que sea escalable cuando sea un array mas grande
	
	public static int search(int key){
		
		int[] array=new int[100];
		for(int i=0;i<array.length;i++) array[i]=i;
		int middle=array.length/2;
		if (array[middle]==key) return array[middle];
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


