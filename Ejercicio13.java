import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que calcule el volumen de un cilindro 
	dados su radio y altura (primero el programa deberá verificar si son positivas).
*/

public class Ejercicio13{
	//Variables globales de clase


	public static void main(String[] args){
		//Variables globales del algoritmo		
		double r, h , v;

		Scanner scanner=new Scanner(System.in);
		System.out.println("*** Ingrese el radio y altura de un cilindro para determinar su volumen ***");
		System.out.print("Ingrese el radio: ");
		r=scanner.nextDouble();
		System.out.print("Ingrese la altura: ");
		h=scanner.nextDouble();
		//Variables de ciclo: si...entonces...
		if(r>0 && h>0){
			v=Math.PI*r*h;
			System.out.println("El volumen del clindro es: "+v+" u³");
		} 
		else {
			System.out.println("Sus datos son negativos, debe ingresar datos positivos");
		}
	}
}
