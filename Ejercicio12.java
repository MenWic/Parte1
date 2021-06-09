import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que convierta y muestre la
	temperatura en Fahrenheit ingresando la temperatura en Celsius.
*/

public class Ejercicio12 {
	//Variables globales de clase

	public static void main(String args[]) {
		//Variables globales de algoritmo
		double t, x;

		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Ingrese una tempertaura en °C para convertirla a °F ***");
		t = scanner.nextDouble();
		// Fórmula de °C -> °F
		x = (9/5*t)+32;
		System.out.println("La temp. ingresada: "+t+"°C, equivale a: "+x+"°F.");
	}
}
