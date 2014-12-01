package javapractice;

public class Checkmagic {

	public static void main(String[] args) {
		
		int[][] matrix={{17,24,1,8,15},{23,5,7,14,16},{4,6,13,20,22},{10,12,19,21,3},{11,18,25,2,9}};
		checkmagic(matrix);

	}

	
	public static boolean checkmagic(int matrix[][]){
		
		int contx=0;
		int conty=0;
		int contdiaga=0;
		int contdiagb=0;
		int j=0;
		int m=0;
		int o=matrix.length-1;
		
		if(matrix.length!=matrix[0].length)return false;
		
		for(int i=0;i<matrix.length;i++){
				contx+=matrix[i][j];
				conty+=matrix[j][i];
				j++;
			
		}
		
		for(int l=0;l<matrix.length;l++){
			contdiaga+=matrix[l][m];
			m++;
		}
		
		for(int n=matrix.length-1;n!=-1;n--){
			contdiagb+=matrix[n][o];
			o--;
			
			
			if(contx!=conty)return false;			
			
			
			
			
		}
		System.out.println(contx);
		System.out.println(conty);
		System.out.println(contdiaga);
		System.out.println(contdiagb);		
		return false;
	}
	
}
