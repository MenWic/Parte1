import java.util.*;

/*
	Este Programa es el algoritmo de: Realice un algoritmo para mostrar un cartel que indique 
	si un triángulo es «escaleno», «equilátero» o «isósceles» ingresando sus lados.
*/

public class Ejercicio17 {
		//Variables globales de clase
		
	public static void main(String args[]) {
		//Variables globales del algoritmo
		double a, b, c;

		Scanner scanner=new Scanner(System.in);
		System.out.println("*** Ingrese los 3 lados de un tráangulo para determinar su tipo (Equilátero, Isásceles o Escaleno ***");
		System.out.print("Ingrese el primer lado: ");
		a=scanner.nextDouble();
		System.out.print("Ingrese el segundo lado: ");
		b=scanner.nextDouble();
		System.out.print("Ingrese el tercer lado: ");
		c=scanner.nextDouble();

		if (a==b) {
			if (a==c) {
				System.out.println("El triángulo es Equilátero.");
			} 
			else {
				System.out.println("El triángulo es Isósceles.");
			}
		} 
		else {
			if (b==c) {
				System.out.println("El triángulo es Isósceles.");
			} 
			else {
				System.out.println("El triángulo es Escaleno.");
			}
		}
	}
}
