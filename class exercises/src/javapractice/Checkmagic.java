package javapractice;

public class Checkmagic {

	public static void main(String[] args) {

		int[][] magicsquare = Magicsquare.generate(5); // Dependant on Magicsquare class, will throw an error if you don't have it on the package.
		int[][] nonmagicsquare = { { 17, 14, 1, 8, 15 }, { 23, 5, 7, 14, 16 },
				{ 4, 6, 13, 20, 22 }, { 10, 45, 21, 94, 3 },
				{ 11, 18, 25, 2, 9 } };
		int[][] notasquare = new int[3][2];
		System.out.println("A square generated using our own method, the result is : "+checkmagic(magicsquare));
		System.out.println("A manual input square, change to test if needed, result : "+checkmagic(nonmagicsquare));
		System.out.println("An array with diferent values for axis X and y, not square, result :"+checkmagic(notasquare));

	}

	public static boolean checkmagic(int matrix[][]) {

		int[] counters = new int[4];
		boolean ismagic = true;
		int sumcounter=0;
		counters[0] = 0;
		counters[1] = 0;
		counters[2] = 0;
		counters[3] = 0;		
		int m = 0;
		int o = 0;

		if (matrix.length != matrix[0].length) return false; // return value directly to avoid exceptions due to out of bounds calls to an array, since this method only works on square matrixes.
		
		for (int i = 0; i < matrix.length; i++) { // checks rows and columns
					
			counters[0] += matrix[i][0];
			counters[1] += matrix[0][i];

		}

		for (int l = 0; l < matrix.length; l++) { // checks upper left diagonal
			counters[2] += matrix[l][m];			
			m++;
			
		}

		for (int n =matrix.length-1;n>-1;n--) { // checks bottom left
														// diagonal
			counters[3] += matrix[n][o];			
			o++;

		}
		
		for(int p=0;p<counters.length;p++){		// Sum counters	
			sumcounter+=counters[p];			
		}
		
		if(sumcounter!=(counters[0]*counters.length)) ismagic=false; // Compare counters sum to the product of any counter by the lenght of the array to check if all of the counters are the same. 
		
		return ismagic;
		
	}

}
