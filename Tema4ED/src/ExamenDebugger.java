 import java.util.*;

 public class ExamenDebugger {
	static int[] Arreglo = { 2, 8, 12, 32, 15, 1, 3, 23, 7, 1, -2, 6 };
	static int aux;
	static int i, j;

	public static void main(String[] args) {
		System.out.print("\t\tBURBUJA : ");
		// ordena los elementos, método de la Burbuja
		for (i = 0; i < Arreglo.length - 1; i++)
			for (j = i + 1; j < Arreglo.length; j++)
				if (Arreglo[j] < Arreglo[i]) {
					// Intercambiar los valores
					aux = Arreglo[j];
					Arreglo[j] = Arreglo[i];
					Arreglo[i] = aux;
				}
		// Mostra el arreglo ordenado
		for (int k = 0; k < Arreglo.length; k++)
			System.out.print(Arreglo[k] + " ");
	}
 }