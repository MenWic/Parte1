import java.util.*;

/*
	Este Programa es el algoritmo de: Ingresar tres números y mostrar el mayor (asuma que
	todos son distintos entre sí).
*/

public class Ejercicio16 {
	//Variables globales de clase

	public static void main(String args[]) {
		//variables globales de algoritmo
		double a, b, c;

		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Ingrese 3 números para determinar quién es el mayor (No pude repetir ningún número) ***");
		System.out.print("Ingrese el primer Número: ");
		a = scanner.nextDouble();
		System.out.print("Ingrese el segundo Número: ");
		b = scanner.nextDouble();
		System.out.print("Ingrese el tercer Número: ");
		c = scanner.nextDouble();
		System.out.println("-- Los números ingresador fueron: "+a+", "+b+" y "+c+". --");

		//Variables locales de cilo si... entonces...
		if (a>b) {
			if (a>c) {
				System.out.println(a+" es el número mayor de los 3 ingresados.");
			} 
			else {
				System.out.println(c+" es el número mayor de los 3 ingresados.");
			}
		} 
		else {
			if (b>c) {
				System.out.println(b+" es el número mayor de los 3 ingresados.");
			} 
			else {
				System.out.println(c+" es el número mayor de los 3 ingresados.");
			}
		}
	}
}
