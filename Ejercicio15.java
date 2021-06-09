import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que indique con carteles si el
	número ingresado es negativo, positivo o nulo.
*/

public class Ejercicio15 {
			//Variables globales de clase

	public static void main(String args[]) {
		//Variables globales del algoritmo
		int n;

		System.out.println("*** Ingrese un número entero para ver el tipo (positivo, negativo o nulo ***)");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();

		if (n<0) {
			System.out.println("El número: "+n+", es negativo.");
		} 
		else {
			if (n>0) {
				System.out.println("El número: "+n+", es positivo.");
			} 
			else {
				// Por que el n�mero no es negativo ni positivo
				System.out.println("El número: "+n+", es nulo.");
			}
		}
	}
}
