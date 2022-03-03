Algoritmo loteria
	Definir cantidad Como Entero
	Definir precio Como real
	Definir premios Como Entero
	Definir valor1 como Real
	Definir esperanza Como Real
	Definir contador como entero
	Definir auxiliar como Real
	definir prob Como real

	Escribir 'introduce numero boletos'
	Leer cantidad
	Escribir '¿Cuanto cuesta cada boleto?'
	Leer precio
	Escribir '¿Cuantos premios hay'
	Leer premios
	contador <- premios
	prob <- 1/cantidad
	Repetir
		Escribir 'valor premio' , premios
		leer valor1
		esperanza<-prob*valor1
		//esperanza <-esperanza+auxiliar
		premios<-premios-1
		contador <- contador-1
	Hasta Que contador <=0
	
	esperanza<-esperanza-precio
	Escribir 'La esperanza matematica de este sorteo es', esperanza
	
FinAlgoritmo
