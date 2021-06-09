/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que genere un número aleatorio 
	del 0 al 200, lo muestre y luego calcule y muestre el mismo número aumentado en un 30%.
(	función aleatorio(min, max) que retorna un número aleatorio entre el min y max).
*/

public class Ejercicio6{
	//Variables globales de clase

	public static void main(String[] args){
		//variables globales del algoritmo
		double n=(Math.random()*200);
		double aument30;
		
		System.out.println("*** Se generará un número aleatorio entre 0 y 200, del cuál se determinará el 70% ***");

		System.out.println("El numero random generado es: "+n);
		aument30=(n+(n*0.30));
		System.out.println("El numero aumentado en 30% es: "+aument30);
	}
}
