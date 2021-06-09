import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñe un algoritmo para ingresar dos palabras (A, B) 
	y luego realice el intercambio de susvalores. Finalmente mostrar el contenido de A y de B.
*/

public class Ejercicio9{
//Variables globales de clase

	public static void main(String[] args){
		//Variables globales del algoritmo
		String A;
		String B;

		System.out.println("*** Ingrese 2 palabras y se cambiará el orden de su valor ***");
		Scanner scanner =new Scanner(System.in);
		System.out.print("Ingrese la primera palabra:");
		A=scanner.nextLine();
		System.out.print("Ingrese la segunda palabra: ");
		B=scanner.nextLine();
		System.out.println("Primera palabra: "+B);
		System.out.println("Segunda palabra: "+A);
	}
}
