import java.util.*;

/*
	Este Programa es el algoritmo de: Diseñar un algoritmo que ingresando un número
	de 5 dígitos detecte si es capicúa y muestre un cartel «Es capicúa» o «No es capicúa
*/

public class Ejercicio20{
	//Variables globales de clase

	public static void main(String[] args){
		//Variables globales de clase
		int num;
		int d1, d2, d4, d5;

		Scanner scanner=new Scanner(System.in);
		System.out.print(" Ingrese una cifra numérica para determinar si es Capicúa: ");
		num=scanner.nextInt();

		//Variables locales de ciclo: Si... (Si... Entonces)... Entonces...
		if(num>=10000 && num<=99999){
			String cadena=Integer.toString(num);
			String a=cadena.substring(0,1);
			d1=Integer.valueOf(a);
			String b=cadena.substring(1,2);
			d2=Integer.valueOf(b);
			String d=cadena.substring(3,4);
			d4=Integer.valueOf(d);
			String e=cadena.substring(4,5);
			d5=Integer.valueOf(e);
			if(d1==d5 && d2==d4){
				System.out.println(" *** Es Capicúa *** ");
			} 
			else {
				System.out.println(" *** No es Capicúa *** ");
			}
		} else {
			System.out.println(" El cantidad de dígitos de la cifra ingresada, no es válida para ser capicúa");
		}
	}
}
