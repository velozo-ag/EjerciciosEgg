Algoritmo MatrizDeCadena3x3
	
	Definir i, j, cont Como Entero
	Definir vector, palabra Como Caracter
	Dimension vector(3,3)
	cont = 0
	
	Hacer
		
		Escribir 'Ingrese una palabra de no mas de 9 caracteres de longitud:'
		Leer palabra
		
		si Longitud(palabra) > 9 Entonces
			
			Escribir '============================================================'
			Escribir ''
			Escribir ''
			Escribir '============================================================'
			Escribir 'La palabra es demasiado larga.'
			Escribir ''
			
		SiNo
			
			Para i = 0 Hasta 2 Hacer
				
				Para j = 0 Hasta 2 Hacer
					
					vector(j,i) = Subcadena(palabra,cont,cont)
					cont = cont + 1
					
				FinPara
				
			FinPara
			
		FinSi
		
	Mientras Que Longitud(palabra) > 9
	
	si Longitud(palabra) <= 9 Entonces
		
		Para i = 0 Hasta 2 Hacer
			
			Escribir '| ' Sin Saltar
			
			Para j = 0 Hasta 2 Hacer
				
				si j = 2 Entonces
					
					Escribir vector(j,i) ' | ' Sin Saltar
					
				SiNo
					
					Escribir vector(j,i), ' | ' Sin Saltar
					
				FinSi
				
			FinPara
			
			Escribir ''
			
		FinPara
		
	FinSi
	
	
	
FinAlgoritmo

//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.
//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
//		H A B
//		I L I
//		D A D
//	Nota: recordar el uso de la función Subcadena().