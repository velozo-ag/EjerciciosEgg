Algoritmo EncontrarValorEnMatriz
	
	Definir val, vector, i, j Como Real
	Definir b Como Logico
	Dimension vector(5,5)
	b = falso
	
	Para i = 0 Hasta 4 Hacer
		
		Para j = 0 Hasta 4 Hacer
			
			vector(i,j) = Aleatorio(-20,20)
			Escribir vector(i,j) ' |' Sin Saltar
			
		FinPara
		
		Escribir ''
		
	FinPara
	
	Escribir ''
	Escribir 'Ingrese un valor entre -20 y 20 para buscar dentro de una matriz: '
	Leer val
	
	
	Para i = 0 Hasta 4 Hacer
		
		Para j = 0 Hasta 4 Hacer
			
			si vector(i,j) = val Entonces
				
				Escribir 'Se encontro el numero en las coordenadas (' j ', ', i , ')'
				b = Verdadero
				
			FinSi
			
		FinPara
		
	FinPara
	
	si !b Entonces
		Escribir 'No se encontro el valor ', val, ' en ninguna posicion'
	FinSi
	
FinAlgoritmo

//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.