Proceso Ejercicio16
	Escribir "Ingrese 3 n�meros para determinar qui�n es el mayor (No pude repetir ning�n n�mero)"
	Definir a, b, c Como Real
	Escribir "*** Ingrese el primer N�mero ***"
	Leer  a
	Escribir "*** Ingrese el segundo N�mero ***"
	Leer  b
	Escribir "*** Ingrese el tercer N�mero ***"
	Leer  c
	Escribir  "-- Los n�meros ingresador fueron: " a ", " b " y " c ". --"
	
	Si a > b Entonces
		Si a > c Entonces
			Escribir a " es el n�mero mayor de los 3 ingresados."
		SiNo
			Escribir c " es el n�mero mayor de los 3 ingresados."
		Fin Si
	SiNo
		Si b > c Entonces
			Escribir b " es el n�mero mayor de los 3 ingresados."
		SiNo
			Escribir c " es el n�mero mayor de los 3 ingresados."
		Fin Si
	Fin Si
FinProceso
