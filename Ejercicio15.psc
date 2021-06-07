proceso Ejercicio15
	Escribir "Ingrese un número entero para ver el tipo (positivo, negativo o nulo)"
	definir n Como Entero
	Leer n
	
	Si n < 0 Entonces
		Escribir "El número: " n ", es negativo."
	SiNo
		Si n > 0 Entonces
			Escribir "El número: " n ", es positivo."
		SiNo
			Escribir "El número: " n ", es nulo." //Por que el número no es negativo ni positivo
		Fin Si
	Fin Si
FinProceso
