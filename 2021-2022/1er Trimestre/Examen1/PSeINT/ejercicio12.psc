Algoritmo ejercicio12
	definir area Como Real
	definir base Como Real
	definir altura Como Real
	definir lado1 Como Real
	definir lado2 Como Real
	
	definir celsius Como Real
	definir fahrenheit Como Real
	
	definir metros Como Real
	definir km como Real
	
	
	
	Escribir "Selecciona una opción:"
	Escribir "1-Calcular area del triangulo"
	Escribir "2-Calcular area del rectangulo"
	Escribir "3-Pasar de grados a fahrenheit"
	Escribir "4-Pasar de pahrenheit a grados"
	Escribir "5-Pasar de metros a kilometros"
	Escribir "6-Salir"
	Leer opcion
	
	Segun opcion Hacer
		1:
			Escribir "Inserta base:"
			Leer base
			Escribir "Inserta altura"
			Leer altura
			area <- (base*altura)/2.0
			Escribir "El area vale:" area
			
		2:
			Escribir "Inserta lado 1:"
			Leer lado1
			Escribir "Inserta lado 2"
			Leer lado2
			area <- (lado1*lado2)
			Escribir "El area vale:" area
		3:
			Escribir "Inserta grados celsius:"
			Leer celsius
			fahrenheit <- celsius * 9/5 + 32
			Escribir celsius " grados celsius son " fahrenheit " fahrenheit"
		4:
			Escribir "Inserta grados fahrenheit:"
			Leer fahrenheit
			celsius <- (fahrenheit -32) * 5/9
			Escribir fahrenheit " fahrenheit son " celsius " celsius"
		5:
			Escribir "Inserta los metros:"
			Leer metros
			km <- metros / 1000
			Escribir metros " metros son " km " km."
			
		6:
			Escribir "Adios"
		De Otro Modo:
			Escribir "opción seleccionada invalida"
	Fin Segun
	
	
FinAlgoritmo