Algoritmo MatrizMagica
	
	Definir matriz, col, fil, i, j, cont, sumasF, sumasC Como Entero
	cont = 0
	
	Hacer
		
		Escribir 'Ingrese el tamanio de su matriz:'
		leer col
		fil = col
		Dimension matriz(fil,col)
		Dimension sumasF(col)
		Dimension sumasC(col)
		
	Mientras Que col > 10 
	
	Escribir ''
	
	//Ingresa los elementos de la matriz // Comprobar si estan entre el 1 y 9
	Para j = 0 Hasta col - 1 Hacer
		
		Para i = 0 Hasta fil - 1 Hacer
			
			Escribir 'Ingrese el elemento en la posicion (', j , ', ', i, ') ' Sin Saltar
			Leer matriz(j,i)
			Escribir ''
			
			si matriz(j,i) < 1 y matriz(j,i) > 9 Entonces
				
				cont = cont + 1
				
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir ''
	
	//Dibuja Matriz
	Para j = 0 Hasta col - 1 Hacer
		Escribir '| ' Sin Saltar
		Para i = 0 Hasta fil - 1 Hacer
			Escribir matriz(j,i) ' | 'Sin Saltar
		FinPara
		Escribir ''
	FinPara
	
	Escribir ''
	
	Escribir sumaFila(matriz, i, j, sumasF, col, fil)
	Escribir sumarColumna(matriz, i, j, sumasC, col, fil)
	
	

FinAlgoritmo

// SUBPROCESOS

SubProceso filasIguales <- sumaFila(matriz, i, j, sumasF, col, fil)							//Sumar Filas
	
	Definir filasIguales como logico
	Definir sumaF como entero
	filasIguales = Verdadero
	
	Para j = 0 Hasta col - 1 Hacer
		
		sumaF = 0
		
		Para i = 0 Hasta fil - 1 Hacer
			
			sumaF = sumaF + matriz(j,i)
			
		FinPara
		
		sumasF(j) = sumaF
		
	FinPara
	
	Para i = 0 hasta col - 1 Hacer
		
		si i < col - 1 Entonces
			si sumasF(i) <> sumasF(i+1) Entonces
				filasIguales = falso
				i = col
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso


SubProceso filasIguales <- sumarColumna(matriz, i, j, sumasC, col, fil)						//Sumar Columnas
	
	Definir filasIguales como logico
	Definir sumaC como entero
	filasIguales = Verdadero
	
	Para j = 0 Hasta col - 1 Hacer
		
		sumaC = 0
		
		Para i = 0 Hasta fil - 1 Hacer
			
			sumaC = sumaC + matriz(j,i)
			
		FinPara
		
		sumasC(j) = sumaC
		
	FinPara
	
	Para i = 0 hasta col - 1 Hacer
		
		si i < col - 1 Entonces
			si sumasC(i) <> sumasC(i+1) Entonces
				filasIguales = falso
				i = col
			FinSi
		FinSi
		
	FinPara
	
FinSubProceso


SubProceso sumaD <- sumarFilaHorizontal(matriz, i, j, col, fil)
	
	
	
FinSubProceso


//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas) que
//tiene como propiedad especial que la suma de las filas, las columnas y las diagonales es igual.
//Por ejemplo:
//	2 7 6
//	9 5 1
//	4 3 8
//	En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir un
//	algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso de que
//	sea mágica escribir la suma. Además, el programa deberá comprobar que los números
//	introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el tamaño de la
//	matriz que no debe superar orden igual a 10.
