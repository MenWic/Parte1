import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que, dados dos números,
	muestre por pantalla su suma.
*/

public class Ejercicio1 {
	//Variables globales de clase

	public static void main(String args[]) {
		//Variables globales del algoritmo
		double num1, num2;
		double x;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese 2 números para sumar (primero un número, luego el otro)");
		System.out.print(" Ingrese el 1er numero: ");
        num1 = scanner.nextDouble();
        System.out.print(" Ingrese el 2do numero: ");
        num2 = scanner.nextDouble();
		x = num1+num2;
		System.out.println("La suma de:"+num1+" y:"+num2+", es: "+x);
	}
}
