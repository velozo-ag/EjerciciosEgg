Algoritmo sin_titulo
	
	Definir palabra, matriz Como Caracter
	Definir i, n Como Real
	i = 0
	
	Hacer
		
		Escribir 'Ingrese una palabra que solo contenga las letras A B C o D y de un largo de 9, 16, 25, 36, etc...'
		Escribir ''
		leer palabra
		
		n = raiz(Longitud(palabra))
		
		Escribir ''
		
	Mientras Que !verificarCadenaDeCaracteres(palabra,i)
	
	Dimension matriz(n,n)
	
	rellenarMatriz(palabra, n, matriz)
	
	compararPrimerDiagonal(palabra, n, matriz)
	
	compararSegundaDiagonal(palabra, n, matriz)

	
	
	
FinAlgoritmo

Funcion correcto <- verificarCadenaDeCaracteres(palabra, I)										// verificar si la cadena contiene solo A B C y D
	
	Definir letra Como Caracter
	Definir correcto Como Logico
	
	correcto = Verdadero
	
	para i = 0 Hasta Longitud(palabra) - 1 Hacer
		
		letra = Subcadena(palabra,i,i)
		
		si letra <> 'A' y letra <> 'B' y letra <> 'C' y letra <> 'D' Entonces
			
			correcto = Falso
			i = Longitud(palabra)
			
		FinSi
		
	FinPara
	
FinFuncion

SubProceso rellenarMatriz(palabra, n, matriz)													// rellena la matriz de la cadena de caracteres
	
	Definir i, j, cont Como Real
	
	cont = 0
	
	para i = 0 Hasta n - 1 Hacer
		
		para j = 0 Hasta n -1 Hacer
			
			matriz(i,j) = Subcadena(palabra, cont, cont)
			
			cont = cont + 1
			
			Escribir matriz(i,j) ' |' Sin Saltar
			
		FinPara
		
		Escribir ''
		
	FinPara
	
	Escribir ''
	
FinSubProceso

SubProceso compararPrimerDiagonal(palabra, n, matriz)											// compara si la primer diagonal verifica
	
	Definir i, j Como Real
	Definir letra como caracter
	Definir verifica Como Logico
	verifica = Verdadero
	letra = matriz(0,0)
	
	para i = 0 Hasta n - 1 Hacer
		
		para j = 0 Hasta n - 1 Hacer
			
			si (i = j) y matriz(i,j) <> letra Entonces
				
				Escribir 'Muestra invalida'
				Escribir '(', i, ', ' j, ') ', matriz(i,j), ' no verifica...'
				j = n
				i = n
				verifica = falso
				
			SiNo
				
				si (i = j) entonces
					
					Escribir '(', i, ', ' j, ') ', matriz(i,j), ' verifica...'
					
				finsi
				
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir ''
	
	si verifica Entonces
		
		Escribir '----------------------'
		Escribir 'Primer diagonal valida'
		Escribir '----------------------'
		
		Escribir ''
		
	FinSi
	
FinSubProceso

SubProceso compararSegundaDiagonal(palabra, n, matriz)											// compara si la segunda diagonal verifica
	
	Definir i, j Como Real
	Definir letra como caracter
	Definir verifica Como Logico
	verifica = Verdadero
	letra = matriz(0,n-1)
	
	para i = 0 Hasta n - 1 Hacer
		
		para j = 0 Hasta n - 1 Hacer
			
			si j = (n-1) - i  y matriz(i,j) <> letra Entonces
				
				Escribir 'Muestra invalida'
				Escribir '(', i, ', ' j, ') ', matriz(i,j), ' no verifica...'
				j = n
				i = n
				verifica = falso
				
			SiNo
				
				si j = (n-1) - i entonces
					
					Escribir '(', i, ', ' j, ') ', matriz(i,j), ' verifica...'
					
				finsi
				
			FinSi
			
		FinPara
		
	FinPara
	
	Escribir ''
	
	si verifica Entonces
		
		Escribir '----------------------'
		Escribir 'Segunda diagonal valida'
		Escribir '----------------------'
		
		Escribir ''
		
	FinSi
	
FinSubProceso

// El apocalipsis Zombie se ha desatado, pero aún hay esperanza. El Dr. Galard ha conseguido aislar el gen Z analizando
// muestras genéticas codificadas. Una muestra se corresponde con una secuencia de caracteres compuesta de cuatro
// posibles bases (A,B,C,D), por ejemplo: "ACDDCADBCDABDBBA". Para poder detectar el gen Z, se representa la
// muestra como una matriz cuadrada (MxM) y se busca en las dos diagonales principales que todas las bases sean
// iguales . Siguiendo el ejemplo de la muestra anterior la matriz resultante es
//		A C D D
//		C A D B
//		C D A B
//		D B B A
// Galard aclara que para que la muestra sea válida el orden de la matriz (el valor de M) debe ser 3x3, 4x4 o 37x37
// (según la muestra). Por desgracia, de antemano no es posible saber el orden de la matriz y el mismo debe ser
// inferido de la muestra ingresada.
// Tu misión: hacer un programa que permita ingresar una muestra completa, detectar si es válida, y de ser así,
// que imprima la matriz y muestre un mensaje que indique si se ha detectado o no el gen Z.
