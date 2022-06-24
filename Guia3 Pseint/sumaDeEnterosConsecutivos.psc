Algoritmo sumaDeEnterosConsecutivos
	
	Definir n Como Entero
	
	Leer n
	
	Escribir sumaDeNumerosEnteros(n)
	
	
FinAlgoritmo

Funcion suma <- sumaDeNumerosEnteros(n)
	
	Definir suma Como Entero
	
	si n = 0 o n = 1 Entonces
		
		suma = 1
		
	SiNo
		
		suma = n + sumaDeNumerosEnteros(n-1)
		Escribir suma
		
	FinSi
	
FinFuncion

//Escribir una función recursiva que devuelva la suma de los primeros N enteros.