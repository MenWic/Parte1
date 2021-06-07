Proceso Ejercicio16
	Escribir "Ingrese 3 números para determinar quién es el mayor (No pude repetir ningún número)"
	Definir a, b, c Como Real
	Escribir "*** Ingrese el primer Número ***"
	Leer  a
	Escribir "*** Ingrese el segundo Número ***"
	Leer  b
	Escribir "*** Ingrese el tercer Número ***"
	Leer  c
	Escribir  "-- Los números ingresador fueron: " a ", " b " y " c ". --"
	
	Si a > b Entonces
		Si a > c Entonces
			Escribir a " es el número mayor de los 3 ingresados."
		SiNo
			Escribir c " es el número mayor de los 3 ingresados."
		Fin Si
	SiNo
		Si b > c Entonces
			Escribir b " es el número mayor de los 3 ingresados."
		SiNo
			Escribir c " es el número mayor de los 3 ingresados."
		Fin Si
	Fin Si
FinProceso
