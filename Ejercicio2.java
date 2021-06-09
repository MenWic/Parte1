import java.util.*;

/*
	Este Programa es el algoritmo de: Realice un algoritmo que solicite dos datos: país y capital. Y luego muestre la capital del país. El
	cartel debe ser como lo indica el siguiente ejemplo: Katmandú es la capital de Nepal.
*/

public class Ejercicio2 {
	//Variables globales de clase

	public static void main(String args[]) {
		//Variables globales del algoritmo
		String cap, pais;
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("*** Ingrese un pais y su capital (primero la capital, luego el país) ***");
		System.out.print(" Ingrese la capital: ");
        cap = scanner.next();
        System.out.print(" Ingrese el país: ");
        pais = scanner.next();
		System.out.println(cap+", es la capital de: "+pais+".");
	}
}
