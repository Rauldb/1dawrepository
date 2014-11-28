package javapractice;

public class Reversebdarray {
	
	public static void main(String[] args){
		
				int[][] array={{1,2,3,4},{5,6,7,8}};
				rotate(array);
								
			}
	
	
	public static void rotate (int[][]A){
		
		int[][] B=new int[A[0].length][A.length];
		
				
		for(int i=0;i<A.length;i++){
			
				for(int j=0;j<A[i].length;j++){
										
					B[j][i]=A[i][j];
					System.out.println(B[j][i]);
					
				}
				
				for(int k=0;i<B.length;i++){
					
					for(int l=0;l<B[0].length;l++){
						//System.out.println(B[k][l]);
					}
					
				} 
				
				
				
		}
		
		
		
	}
	
		
	

}
