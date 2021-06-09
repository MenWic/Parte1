import java.util.*;

/*
	Este Programa es el algoritmo de: Crear un algoritmo que convierta y muestre un
	valor ingresado en centímetros a yardas, metros, pies y pulgadas.
*/

public class Ejercicio11 {
	//Variables globales de clase

	public static void main(String args[]) {
		//Variables globales del algoritmo
		double a, b, c, d, n;
		double x1, x2, x3, x4;
		// 1 yd = 91.44 cm
		a = 91.44;
		// 1 m = 100 cm
		b = 100;
		// 1 ft = 30.48 cm
		c = 30.48;
		// 1 plg = 2.54 cm
		d = 2.54;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Ingrese en cm, una cifra numérica que se converitrá a yardas, metros, pies y pulgadas ***");
		n = scanner.nextDouble();
		// cm -> yd
		x1 = n/a;
		// cm -> m
		x2 = n/b;
		// cm -> ft
		x3 = n/c;
		// cm -> plg
		x4 = n/d;
		System.out.println("Ingresó: "+n+" cm que equivale a: "+x1+" yd, "+x2+" m, "+x3+" ft y "+x4+" plg.");
	}
}
