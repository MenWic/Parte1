import java.util.*;

/*
	Este Programa es el algoritmo de: Crear un algoritmo que muestre por pantalla el doble y 
	el triple de un número ingresado por teclado.
*/

public class Ejercicio3 {
	////Variables globales de clase

	public static void main(String args[]) {
		//Variables globales del algoritmo
		double n, a, b;

		Scanner scanner = new Scanner(System.in);	
		System.out.println("*** Ingrese un 'número' y se determinará al doble y el triple ***");
		n = scanner.nextDouble();
		a = n*2;
		b = n*3;
		System.out.println("El doble de "+n+" es: "+a+", y el triple de "+n+"es: "+b+".");
	}
}
