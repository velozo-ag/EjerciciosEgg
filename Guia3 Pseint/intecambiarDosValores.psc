Algoritmo intecambiarDosValores
	
	Definir a, b Como Entero
	Escribir 'ingrese primer numero'
	leer a
	Escribir 'ingrese segundo numero'
	leer b
	
	intercambiarValores(a,b)
	
	b = a
	
	Escribir 'El valor del segundo numero ahora es ' b
	
FinAlgoritmo

SubProceso intercambiarValores(a Por Valor, b Por referencia)
	
	a = b
	
	Escribir 'El valor de el primer numero ahora es ' a
	
FinSubProceso

//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.