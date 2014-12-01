package javapractice;

public class Magicsquare {
	
	public static void main(String[]  args){
		
		final int size=5;
		generate(size);
	
	}
	
	
	
	public static void generate(int size){
		
		int[][] matrix=new int[size][size];
		int x=matrix[0].length/2+matrix[0].length%2-1;
		int cont=1;
		int y=0;
		
		while(cont!=matrix.length*matrix.length+1){		
		matrix[y][x]=cont;
		if(cont%size==0){
			y++;
			if(y==matrix.length) y=0;
		}
		
		else{
			if(y==0)y=matrix.length-1;
			else y--;
			if(x==matrix[0].length-1)x=0;
			else x++;			
		}
		cont++;
	}
		
		for(int i=0;i<matrix.length;i++){
			
						
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");				
			}
			
			System.out.print("\n");
			
		}
			
			
		}
		
	}


