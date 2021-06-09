import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que imprima con un cartel «Correcto» 
	según el siguiente caso: si el número N es múltiplo de 5 y se encuentra entre los 25 primeros 
	números. N debe ser obtenido aleatoriamente entre números del 1 al 1000. Primero debe mostrar N. 
	(utilizar el operador mod que retorna el residuo de la división)
*/

public class Ejercicio19 {
	//Variables globales de clase
	
	public static void main(String args[]) {
		//Variables globales del algoritmo
		double n, div;

		System.out.println("*** Se generará un número aleatorio entre 1 y 1000 (si es multiplo de 5 y menor a 25 será CORRECTO) ***");
		n = Math.floor(Math.random()*1000)+1;
		System.out.println("El numero random generado es: "+n);
		div = n%5;
		if (div==0 && n<=25) {
			System.out.println("Correcto");
		} 
		else {
			System.out.println("Incorrecto");
		}
	}
}
