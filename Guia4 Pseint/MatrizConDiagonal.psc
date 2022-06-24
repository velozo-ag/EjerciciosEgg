Algoritmo MatrizConDiagonal
	
	Definir vector, i, j, n Como Entero	
	i = 0
	j = 0
	
	
	Escribir 'Ingrese el tamanio de una matriz:'
	Leer n
	
	Dimension vector(n, n)
	
	generarMatriz(vector, i, j, n)
	
	mostrarMatriz(vector, i, j, n)
	
FinAlgoritmo

SubProceso generarMatriz(vector, i, j, n)
	
	Para i = 0 Hasta n - 1 Hacer
		
		Para j = 0 Hasta n - 1 Hacer
			
			si i = j Entonces
				
				vector(i, j) = 0
				
			SiNo
				
				vector(i, j) = Aleatorio(1, 9)
				
			FinSi
			
		FinPara
		
	FinPara
	
FinSubProceso

SubProceso mostrarMatriz(vector, i, j, n)
	
	Para i = 0 Hasta n - 1 Hacer
		
		Escribir '| ' Sin Saltar
		
		Para j = 0 Hasta n - 1 Hacer
			
			si j = n-1 Entonces
				
				Escribir vector(i,j) ' | ' Sin Saltar
				
			SiNo
				
				Escribir vector(i,j), ' | ' Sin Saltar
				
			FinSi
			
		FinPara
		
		Escribir ''
		
	FinPara
	
FinSubProceso

//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//subproceso para imprimir la matriz.