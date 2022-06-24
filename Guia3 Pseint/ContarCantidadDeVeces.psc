Algoritmo ContarCantidadDeVeces
	
	Definir contador Como Entero
	Definir frase, letra Como Caracter
	
	Escribir 'Ingrese una frase:'
	Leer frase
	Escribir 'Ingrese la letra que desee contar:'
	Leer letra
	
	contador = buscarLetra(letra, frase)
	
	Escribir contador
	
FinAlgoritmo

Funcion cont <- buscarLetra(let, frase)
	
	Definir cont, i Como Entero
	cont = 0
	
	Para i = 0 Hasta Longitud(frase) Con Paso 1 Hacer
		
		si Subcadena(frase, i, i) = let Entonces
			
			cont = cont + 1
			
		FinSi
		
	Fin Para
	
FinFuncion

//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//función Subcadena().