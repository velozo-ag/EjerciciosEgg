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

//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree un
//cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
		//* * * *
		//*     *
		//*     *
		//* * * *
//Nota: Recordar el uso del escribir sin saltar en PseInt.