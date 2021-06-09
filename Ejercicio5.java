import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que pida un número por
	teclado y luego imprima el número siguiente al ingresado.
*/

public class Ejercicio5 {
	//Variables globales de clase
	public static void main(String args[]) {
		//Variables globales del algoritmo
		double n, i;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Ingrese un número y se le devolverá el consecuente a este ***");
		n = scanner.nextDouble();
		i = n+1;
		System.out.println("Número ingresado: "+n+", consecuente: "+ i);
	}
}
