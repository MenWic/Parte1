proceso Ejercicio17
	Escribir "Ingrese los 3 lados de un tr�angulo para determinar su tipo (Equil�tero, Is�sceles o Escaleno)"
	Definir a, b, c Como Real
	Escribir "*** Ingrese �a longitud de un lado ***"
	Leer a
	Escribir "*** Ingrese la longitud de otro lado ***"
	Leer b
	Escribir "*** Ingrese la longitud del �ltimo lado ***"
	Leer c
	Escribir "La longitud de sus lados del tir�ngulo es: " a ", " b " y " c "."
	
	Si a = b Entonces
		Si a = c Entonces
			Escribir "El tri�ngulo es Equil�tero."
		SiNo
			Escribir "El tri�ngulo es Is�sceles."
		Fin Si
	SiNo
		Si b = c Entonces
			Escribir "El tri�ngulo es Is�sceles."
		SiNo
			Escribir "El tri�ngulo es Escaleno."
		Fin Si
	Fin Si
	
FinProceso
