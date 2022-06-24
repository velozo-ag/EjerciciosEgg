Algoritmo GenerarMatrizSinNumerosRepetidos
	
	Definir matriz, col, fil, i, j, pos, numUsados, cantidadNumeros, cont, vez Como Entero
	pos = 0
	cont = 0
	vez = 0
	
	Hacer
		
		Escribir 'Ingrese el tamanio de su matriz:'
		leer col
		fil = col
		Dimension matriz(fil,col)
		
	Mientras Que col > 10 
	
	cantidadNumeros = col * col
	Dimension numUsados(cantidadNumeros)
	
	para i = 0 Hasta cantidadNumeros - 1 Hacer
		
		numUsados(i) = 0
		
	FinPara
	
	Para j = 0 Hasta col - 1 Hacer
		
		Escribir '| ' Sin Saltar
		
		Para i = 0 Hasta fil - 1 Hacer
			
			matriz(j,i) = verificarExistencia(cantidadNumeros,numUsados, cont, vez)
			vez = vez + 1
			Escribir matriz(j,i) ' | 'Sin Saltar
			
		FinPara
		
		Escribir ''
		
	FinPara
	
FinAlgoritmo



SubProceso num <- verificarExistencia(cantidadNumeros,numUsados, cont, vez)
	
	Definir j, i, num, aux Como Entero
	Definir b, a Como Logico
	b = Falso
	
	hacer
		
		num = Aleatorio(1, cantidadNumeros)
		cont = 0
		
		Para i = 0 hasta cantidadNumeros - 1 Hacer
			
			si num = numUsados(i) entonces
				
				cont = cont + 1
				
			FinSi
			
		FinPara
		
		si cont = 0 Entonces
			
			numUsados(vez) = num
			j = cantidadNumeros
			b = Verdadero
			
		FinSi
		
	Mientras Que !b
	
FinSubProceso