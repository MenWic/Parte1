proceso Ejercicio15
	Escribir "Ingrese un n�mero entero para ver el tipo (positivo, negativo o nulo)"
	definir n Como Entero
	Leer n
	
	Si n < 0 Entonces
		Escribir "El n�mero: " n ", es negativo."
	SiNo
		Si n > 0 Entonces
			Escribir "El n�mero: " n ", es positivo."
		SiNo
			Escribir "El n�mero: " n ", es nulo." //Por que el n�mero no es negativo ni positivo
		Fin Si
	Fin Si
FinProceso
