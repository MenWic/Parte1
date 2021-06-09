import java.util.Scanner;

/*
	Este Programa es el algoritmo de: Crear un algoritmo que muestre cada uno de los dígitos de un número 
	ingresado por el usuario. El máximo permitido es de 4 dígitos. Al final debe mostrar la suma de los dígitos. 
	Por ejemplo: si se ingresa el número 187,  entonces debe mostrar en un único cartel lo siguiente: 
	“d1 = 0, d2 = 1, d3 = 8 y d4 =7. suma= 16". (Utilice la función substr(string, inicio, cantidad) básicamente
	recibe un string, seleccionan la posición de inicio y la cantidad de caracteres a retornar, ejemplo
	substr("hola mundo",5,5) retornaría "mundo")
*/

public class Ejercicio18{
	//Variables globales de clase

	public static void main(String[] args){
		//Variables globales del algoritmo
		int num, suma;
		int d1, d2, d3, d4;

		Scanner scanner=new Scanner(System.in);
		System.out.println(" *** Ingresar una cifra numérica para relaizar la suma de su dígitos (4 dígitos máximo) *** ");
		System.out.print("Ingrese el numero: ");
		num=scanner.nextInt();

		//Variables locales de ciclo: si... entonces
		if(num<=9999 && num>=1000){
			String cadena=Integer.toString(num);
			String a=cadena.substring(0,1);
			d1=Integer.valueOf(a);
			String b=cadena.substring(1,2);
			d2=Integer.valueOf(b);
			String c=cadena.substring(2,3);
			d3=Integer.valueOf(c);
			String d=cadena.substring(3,4);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+", D2: "+d2+", D3: "+d3+", D4: "+d4+"\nSuma: "+suma);
		} 
		else if(num<=999 && num>=100){
			String cadena=Integer.toString(num);
			d1=0;
			String b=cadena.substring(0,1);
			d2=Integer.valueOf(b);
			String c=cadena.substring(1,2);
			d3=Integer.valueOf(c);
			String d=cadena.substring(2,3);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+", D2: "+d2+", D3: "+d3+", D4: "+d4+"\nSuma: "+suma);
		} else if(num<=99 && num>=10){
			String cadena=Integer.toString(num);
			d1=0;
			d2=0;
			String c=cadena.substring(0,1);
			d3=Integer.valueOf(c);
			String d=cadena.substring(1,2);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+", D2: "+d2+", D3: "+d3+", D4: "+d4+"\nSuma: "+suma);
		} else if (num<=9 && num>=0){
			String cadena=Integer.toString(num);
			d1=0;
			d2=0;
			d3=0;
			String d=cadena.substring(1,2);
			d4=Integer.valueOf(d);
			suma=d1+d2+d3+d4;
			System.out.println("D1: "+d1+", D2: "+d2+", D3: "+d3+", D4: "+d4+"\nSuma: "+suma);
		} 
	}
}
