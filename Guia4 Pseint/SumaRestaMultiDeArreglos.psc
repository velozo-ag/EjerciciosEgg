Algoritmo SumaRestaMultiDeArreglos
	
	Definir i, vector, n, suma, resta, multi Como Real
	Dimension vector[10]
	suma = 0
	resta = 0
	multi = 0
	
	Escribir 'Ingrese 10 numeros reales:'
	
	Para i = 0 Hasta 9 Hacer
		
		vector(i) = i + 1
		//Leer vector(i)
		
	FinPara
	
	Para i = 0 Hasta 9 Hacer
		
		si i = 9 Entonces
			
			Escribir vector(i)
			
		SiNo
			
			Escribir vector(i) , ', ' Sin Saltar
			
		FinSi
		
	FinPara
	
	Para i = 0 Hasta 9 Hacer
		
		suma = suma + vector(i)
		
	FinPara
	Escribir suma
	
	resta = vector(0)
	Para i = 0 Hasta 9 Hacer
		
		resta = resta - vector(i)
		
	FinPara
	Escribir resta
	
	multi = vector(0)
	Para i = 0 Hasta 9 Hacer
		
		multi = multi * vector(i)
		
	FinPara
	Escribir  multi
	
FinAlgoritmo

//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.