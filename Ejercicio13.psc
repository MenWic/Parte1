proceso Ejercicio13
	Escribir "Caluclar el volumen de un cilindro sabiendo su radio y altura"
	Escribir "*** Ingrese el radio ***"
	Definir r Como Entero
	Leer r
	
	Si r > 0 Entonces 
		Escribir "Dato aceptado"
	SiNo 
		Escribir "Dato no aceptado (deben ser reales positivos)" 
	FinSi
	
	Escribir "*** Ingrese la altura ***"
	Definir h Como Entero
	Leer h
	Si h > 0 Entonces 
		Escribir "Dato aceptado"
	SiNo 
		Escribir "Dato no aceptado (deben ser reales positivos)" 
	FinSi	
	
	//Volumen de un cilindro
	v = (Pi) * (r * r) * h
	Escribir "El cilindro de radio: " r " y altura: " h ", tiene un volumen de: " v
	
FinProceso
