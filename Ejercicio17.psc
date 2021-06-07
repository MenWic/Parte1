proceso Ejercicio17
	Escribir "Ingrese los 3 lados de un tríangulo para determinar su tipo (Equilátero, Isósceles o Escaleno)"
	Definir a, b, c Como Real
	Escribir "*** Ingrese ña longitud de un lado ***"
	Leer a
	Escribir "*** Ingrese la longitud de otro lado ***"
	Leer b
	Escribir "*** Ingrese la longitud del último lado ***"
	Leer c
	Escribir "La longitud de sus lados del tirángulo es: " a ", " b " y " c "."
	
	Si a = b Entonces
		Si a = c Entonces
			Escribir "El triángulo es Equilátero."
		SiNo
			Escribir "El triángulo es Isósceles."
		Fin Si
	SiNo
		Si b = c Entonces
			Escribir "El triángulo es Isósceles."
		SiNo
			Escribir "El triángulo es Escaleno."
		Fin Si
	Fin Si
	
FinProceso
