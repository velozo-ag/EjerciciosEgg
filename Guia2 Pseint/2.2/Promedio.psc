Algoritmo Promedio
	
	Definir num, suma, contador Como Real
	
	Escribir 'Ingrese numeros a promediar. Para finalizar, ingrese un numero negativo (-1).'
	Leer num
	
	suma = 0
	contador = 0
	
	Mientras num > -1 Hacer
		
		suma = suma + num
		Leer num
		contador =+ 1
		
	FinMientras
	
	Escribir 'El promedio de los numeros ingresados es: ', suma / contador
	
FinAlgoritmo

//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de los
//números ingresados. Suponemos que el usuario no insertará número negativos.
