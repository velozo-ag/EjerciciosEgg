Algoritmo sin_titulo
	
	Definir largo, i, a, l, k Como entero
	
	Repetir
		
		Escribir 'Ingrese el largo de su cuadrado'
		Leer largo
		
	Mientras Que largo > 20 o largo < 3
	
	Escribir ''
	
	Para i = 1 Hasta largo Con Paso 1 Hacer
		
		si i = 1 o i = largo Entonces
			
			Para a<-1 Hasta largo Con Paso 1 Hacer
				Escribir Sin Saltar  ' * '
			Fin Para
			Escribir ''
			
		sino
			
			Para l = 1 hasta 2 con paso 1 Hacer
				Escribir Sin Saltar ' * '
				
				Para k = 1 Hasta largo Con Paso 1 Hacer
					Escribir Sin Saltar ' '
				Fin Para
				
			FinPara
			Escribir ''
			
		FinSi
		
	Fin Para
	
	Escribir ''
	Escribir 'No se que hice pero funciono :D'
	Escribir ''
	
FinAlgoritmo

//Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree un
//cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
		//* * * *
		//*     *
		//*     *
		//* * * *
//Nota: Recordar el uso del escribir sin saltar en PseInt.