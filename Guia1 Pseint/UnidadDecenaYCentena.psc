Algoritmo UnidadDecenaYCentena
	
	Definir uni, dec, cen, num como entero
	
	Escribir 'Ingrese un numero de tres cifras:'
	Leer num
	
	uni = num % 10
	dec = ( (num % 100) - uni) / 10 
	cen = (num - (num % 100) ) / 100
	
	Escribir 'Centena: ', cen
	Escribir 'Decena:  ', dec
	Escribir 'Unidad:  ', uni
	
FinAlgoritmo

//Ingrese un número de tres cifras y muestra la unidad, decena y la centena.
//Por ejemplo si el número ingresado por pantalla es 123 el programa debe mostrar
//CENTENA: 1
//DECENA: 2
//UNIDAD: 3

