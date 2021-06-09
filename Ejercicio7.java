/*
Este Programa es el algoritmo de: Diseñar un algoritmo que genere un número aleatorio 
del 10 al 50, lo muestre y luego calcule y muestre el mismo número disminuido en un 15%.
*/

public class Ejercicio7{
	//Variables globales de clase

	public static void main(String[] args){
		//Variables globales de algoritmo
		double n=(Math.random()*(40))+10;
		double dismin15;

		System.out.println("*** Se generará un número aleatorio entre 10 y 50, del cuál se determinará el 85% ***");
		System.out.println("El numero aleatorio es: "+n);
		dismin15=n-(n*0.15);
		System.out.println("El numero disminuido en 15% es: "+dismin15);
	}
}
