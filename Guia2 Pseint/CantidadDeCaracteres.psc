Algoritmo CantidadDeCaracteres
	
	Definir palabra Como Caracter
	Definir aux Como Entero
	
	Escribir 'Ingrese una palabra de 6 caracteres:'
	Leer palabra
	
	aux = 6
	
	si Longitud(palabra) == aux Entonces
		Escribir 'Correcto'
		
	SiNo
		Escribir 'Incorrecto'
		
	FinSi
	
FinAlgoritmo

//Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
//usuario ingresa una frase o palabra de 6 caracteres se deberá de imprimir un mensaje por
//pantalla que diga "CORRECTO", en caso contrario, se deberá imprimir "INCORRECTO".
//Nota: investigar la función Longitud() de PseInt.