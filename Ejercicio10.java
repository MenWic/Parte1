import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que imprima el área y el
	perímetro de un rectángulo ingresando su base y altura.
*/

public class Ejercicio10{
	//Variables globales de clase


	public static void main(String[] args){
		//Variables globales del algoritmo		
		double b, h, p, a;

		System.out.println("*** Ingrese la base y altura de un rectángulo para determinar el perimetro y su área ***");
		Scanner scanner=new Scanner(System.in);
		System.out.print("Ingrese la base: ");
		b=scanner.nextDouble();
		System.out.print("Ingrese la altura: ");
		h=scanner.nextDouble();
		p=2*b+2*h;
		a=b*h;
		System.out.println("El perimetro es: "+p);
		System.out.println("El area es: "+a);
	}
}
