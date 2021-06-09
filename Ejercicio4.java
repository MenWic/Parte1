import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que imprima el cuadrado y
	el cubo de un número ingresado por teclado
*/

public class Ejercicio4 {
	////Variables globales de clase

	public static void main(String args[]) {
		//Variables globales del algoritmo
		double n, a, b;

		Scanner scanner = new Scanner(System.in);	
		System.out.println("*** Ingrese un 'número' y se determinará al cuadrado y al cubo ***");
		n = scanner.nextDouble();
		b = n*n*n;
		a = n*n;
		System.out.println("El cuadrado de "+n+" es: "+a+", y el cubo de "+n+"es: "+b+".");
	}
}
