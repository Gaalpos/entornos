Algoritmo ejercicio9
	definir max Como Entero
	definir x Como Entero
	definir band Como Logico
	definir m Como Entero
	
	Escribir "Indica hasta que numero primo quieres llegar:"
	Leer max
	
	Para x<-2 Hasta max Con Paso 1 Hacer
		m <- 2;
		band <- Verdadero;
		Mientras band == Verdadero Y m < x Hacer
			Si (x MOD m) == 0 Entonces
				band <- Falso;
			SiNo
				m <- m + 1;
			Fin Si
		Fin Mientras
		
		Si band == Verdadero Entonces
			Escribir x
		Fin Si
		
	Fin Para
FinAlgoritmo
