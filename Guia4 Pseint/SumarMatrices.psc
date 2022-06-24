Algoritmo SumarMatrices
	
	Definir n, m, vector, i, j, suma Como Entero
	
	Escribir "Ingrese un número"
	leer m
	
	Escribir "Ingrese un otro número"
	leer n
	
	Dimension vector(n,m)
	
	i=0
	j=0
	suma=0
	
	
	v(n,m,vector)
	v1(i, j, vector, suma, n, m)
	
FinAlgoritmo

SubProceso v(n,m,vector)
	
	Definir i, j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		
		Para j = 0 Hasta m-1 Hacer
			
			vector(i,j) = Aleatorio(-10,10)
			
			Escribir vector(i,j) ' |' Sin Saltar
			
		FinPara
		
		Escribir ''
		
	FinPara
	
FinSubProceso

SubProceso v1(i, j, vector, suma, n, m)
	
	suma=0
	
	Para i = 0 Hasta n-1 Hacer
		
		Para j = 0 Hasta m-1 Hacer
			
			suma=suma+vector(i,j)
			
		FinPara
		
	FinPara
	
	Escribir "La suma de todos los números ingresados dentro de la matriz es: ", suma
	
FinSubProceso
