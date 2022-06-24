Algoritmo sin_titulo
	
	Definir n, max, min, cont, acum Como Real
	
	n = 0
	max = 0
	cont = 0
	acum = 0
	min = 9999
	
	Hacer
		
		Escribir 'Ingrese numeros. Para finalizar, ingrese 0.'
		Leer n
		
		si n <> 0 Entonces
			
			acum = acum + n
			
			si n < min Entonces
				min = n
			SiNo
				si n > max Entonces
					max = n
				FinSi
			FinSi
			
			cont = cont + 1
			
		FinSi
		
		
	Mientras Que n <> 0
	
	Escribir 'Numero maximo ingresado: ', max
	Escribir 'Numero minimo ingresado: ', min
	Escribir 'Promedio ', acum / cont
	
	
	
FinAlgoritmo

//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
//todos ellos.