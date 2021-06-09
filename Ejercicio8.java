import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que, dados tres números
	enteros, calcule e imprima el promedio entre ellos.
*/

public class Ejercicio8{
	//Variables globales de clase

	public static void main(String[] args){
		//Variables globales del algoritmo		
		int num1, num2, num3, prom;

		Scanner scanner = new Scanner(System.in);
		System.out.println("*** Ingrese 3 números para determinar el promedio de estos ***");
		System.out.print("Ingrese el primer numero: ");
		num1=scanner.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		num2=scanner.nextInt();
		System.out.print("Ingrese el tercer numero: ");
		num3=scanner.nextInt();
		prom=(num1+num2+num3)/3;
		System.out.println("El promedio es: "+prom);		
	}
}
