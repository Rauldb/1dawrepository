package paquete1;

import java.util.Scanner;

public class SumamayorMenor {
	public SumamayorMenor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
int tamaño = 3;
String[] nombre = new String[tamaño];
int[] sueldo = new int[tamaño];
Scanner leernombre = new Scanner(System.in);
Scanner leersueldo = new Scanner(System.in);
// leemos los datos
for (int i = 0; i < nombre.length; i++) {
System.out.println("Introduce el nombre ");
nombre[i] = leernombre.next();
System.out.println("Introduce el sueldo ");
sueldo[i] = leersueldo.nextInt();
}
// visualizamos los datos
System.out.println("Los datos de salida son ");
for (int i = 0; i < nombre.length; i++) {
System.out.println("Nombre " + nombre[i] + ", Sueldo "
+ sueldo[i]);
}
// calculamos la posicion.
int posicionmayor = 0;
int posicionmenor = 0;
int mayor = sueldo[0];
int menor = sueldo[0];
// bucle para el calculo del mayor
for (int f = 1; f < nombre.length; f++) {
if (sueldo[f] > mayor) {
// mayor = sueldo[f];
posicionmayor = f;
}
}
// bulce para el calculo del menor
for (int f = 1; f < nombre.length; f++) {
if (sueldo[f] < menor) {
//menor = sueldo[f];
posicionmenor = f;
}
}
System.out.println(" ");
System.out.println(" ");
System.out.println("La persona con el sueldo mayor es ");
System.out.println("Nombre " + nombre[posicionmayor]
+ ", Sueldo mayor " + sueldo[posicionmayor]);
System.out.println(" ");
System.out.println(" ");
System.out.println("La persona con el sueldo menor es ");
System.out.println("Nombre " + nombre[posicionmenor]
+ ", Sueldo mayor " + sueldo[posicionmenor]);
}
}