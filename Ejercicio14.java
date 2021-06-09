import java.util.*;

/*
	Este Programa es el algoritmo de: Crear un algoritmo que calcule si dos números son
	divisibles. Para ello, se piden un primer número y un segundo número, entonces mostrar
	un cartel que diga "es divisible" si el segundo número es divisible al primero.
*/

public class Ejercicio14{
	//Variables globales de clase

	public static void main(String[] args){
		//Variables globales de clase
		int dividendo;
		int divisor;

		Scanner scanner=new Scanner(System.in);
		System.out.println("*** Ingrese 2 números y se determinara si el 2do es divisible entre el 1ro ***");
		System.out.print("Ingrese el primer numero: ");
		divisor=scanner.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		dividendo=scanner.nextInt();

		//Variables de ciclo: si... entonces...
		if((dividendo%divisor)==0){
			System.out.println(" *** Es divisble *** ");
		} 
		else {
			System.out.println(" *** No es divisble *** ");
		}
	}
}
