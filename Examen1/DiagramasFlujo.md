# Diagramas de flujo

##  Inicio / fin de un proceso, algoritmo o función
>Proceso nombreProceso
<br><br>	
FinProceso <br>
![alt](proceso.png)

## Definir variables
>Definir variable como Entero <br>
![alt](variable.png)

## Ejecución de un proceso
>a ← b + 5 <br>
![alt](ejecucion.png)

## Escribir en la salida
>Escribir 'mensaje'<br>
![alt](salida.png)

## Leer de la entrada
>leer variable <br>
![alt](leer.png)

## Si - entonces
>Si expresion_logica Entonces<br>
acciones_por_verdadero<br>
SiNo<br>
acciones_por_falso<br>
Fin Si
<br>
![alt](si.png)

## Según sea
>Segun variable_numerica Hacer<br>
opcion_1:<br>
secuencia_de_acciones_1<br>
opcion_2:<br>
secuencia_de_acciones_2<br>
opcion_3:<br>
secuencia_de_acciones_3<br>
De Otro Modo:<br>
secuencia_de_acciones_dom<br>
Fin Segun<br>

![alt](segun.png)

## Mientras - hacer
>Mientras expresion_logica Hacer<br>
secuencia_de_acciones<br>
Fin Mientras<br>
![alt](mientras.png)

## Repetir hasta
>Repetir<br>
secuencia_d_acciones<br>
Hasta Que expresion_logica<br>
![alt](repetir.png)

## Para - hasta - hacer
>Para variable_numerica<-valor_inicial Hasta valor_final Con Paso paso Hacer
	secuencia_de_acciones<br>
Fin Para<br>
![alt](para.png)

## Definición de subprocesos (no devuelven valores)
>SubProceso NombreSubproceso (Argumentos)<br>
FinSubProceso<br>
Proceso unProceso<br>
NombreSubproceso(5)<br>
FinProceso<br>
![alt](sub1.png)

## Definición de subprocesos (si devuelven valores)
>SubProceso variable_de_retorno <- NombreSubproceso (Argumentos)<br>
	variable_de_retorno <- 5<br>
FinSubProceso<br>
Proceso unProceso<br>
	r <- NombreSubproceso(5)<br>
FinProceso<br>
![alt](sub2.png)

## Comentarios
>//comentario<br>
![alt](comen.png)
