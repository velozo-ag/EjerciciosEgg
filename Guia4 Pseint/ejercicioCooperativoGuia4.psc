Algoritmo ejercicioCooperativoGuia4
	
	Definir tablero como Cadena
	
	Dimension tablero[9, 12]
	
	Escribir ''
	
	inicializarMatriz(tablero, 9, 12)
	agregarPalabra(tablero, "VECTOR", 0)
	agregarPalabra(tablero, "MATRIX", 1)
	agregarPalabra(tablero, "PROGRAMA", 2)
	agregarPalabra(tablero, "SUBPROGRAMA", 3)
	agregarPalabra(tablero, "SUBPROCESO", 4)
	agregarPalabra(tablero, "VARIABLE", 5)
	agregarPalabra(tablero, "ENTERO", 6)
	agregarPalabra(tablero, "PARA", 7)
	agregarPalabra(tablero, "MIENTRAS", 8)
	
	imprimirMatriz(tablero, 9, 12)
	
	Escribir ''
	
	acomodarPalabras(tablero)
	
	imprimirMatriz(tablero, 9, 12)
	
	Escribir ''
	
FinAlgoritmo

SubProceso inicializarMatriz(tablero, 9, 12)					// Inicializa matriz, dandole el valor '*' a cada posicion
	
	Definir i, j Como Real
	
	Para i = 0 Hasta 8 Hacer
		
		Para j = 0 Hasta 11 Hacer
			
			tablero(i,j) = '*'
			
		FinPara
		
	FinPara
	
FinSubProceso

SubProceso agregarPalabra(tablero, palabra, fila)				// Agrega palabra dada por argumento a la Matriz
	
	Definir i, j, cont Como Real
	cont = 0
	
	Para j = 0 Hasta 11 Hacer
		
		si j >= Longitud(palabra) Entonces						// Escribe un ESPACIO en las posiciones donde no hayan letras
			
			tablero(fila,j) = ' '
			
		SiNo
			
			tablero(fila,j) = Subcadena(palabra, j, j)			// Escribe cada una de las letras
			
		FinSi
		
	FinPara
	
FinSubProceso

SubProceso pos <- buscarR(tablero, fila)						// Busca la posicion de la primer R en cada fila
	
	Definir i,j,pos como real
	
	para j <- 0 hasta 11 Hacer
		
		si tablero(fila,j) = "R" Entonces
			
			pos = j
			j = 11	// Se corta el bucle
			
		FinSi
		
	FinPara
	
FinSubProceso

SubProceso acomodarPalabras(tablero)
	
	Definir i, j, pos, x Como Real
	
	Para i = 0 Hasta 8 Hacer
		
		pos = buscarR(tablero, i)
		x = 5 - pos			// Inicializar posicion en donde deberia comenzar a escribirse la palabra de modo a que la letra R quede en la posicion (x, 5)
		
		para j <- 11 hasta x con paso -1 Hacer
			
			si x <> 0 Entonces						// rellena de atras para adelante la fila, hasta x (5 - posicion de R)
				
				tablero(i,j) = tablero(i,j-x)
				
			FinSi
			
		FinPara
		
		si j >= 0 Entonces
			
			Para j = 0 Hasta x-1 Hacer 		// Rellena los valores anteriores a la palabra,
				
				tablero(i,j) = ' '
				
			FinPara
			
		FinSi
		
	FinPara
	
	
FinSubProceso

SubProceso imprimirMatriz(tablero, 9, 12)
	
	Definir i, j Como Real
	
	Para i = 0 Hasta 8 Hacer
		
		Escribir '| ' Sin Saltar
		
		Para j = 0 Hasta 11 Hacer
			
			Escribir tablero(i,j), ' | ' Sin Saltar
			
		FinPara
		
		Escribir ''
		
	FinPara
	
FinSubProceso

// Se debe crear una matriz con las siguientes palabras como se muestra a
// continuación. Luego de eso debemos acomodar las palabras para que la primera
// letra ?R? de cada una quede en la posición 5, alineándose.