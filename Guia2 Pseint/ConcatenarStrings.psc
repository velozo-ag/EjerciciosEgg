Algoritmo ConcatenarStrings
	
	Definir frase Como Caracter
	
	Escribir 'Ingrese una frase de 4 o mas caracteres'
	Leer frase
	
	si Longitud(frase) == 4 Entonces
		frase = Concatenar(frase,'!')
		Escribir frase
	SiNo
		
		si Longitud(frase) > 4 Entonces
			frase = Concatenar(frase,'?')
			Escribir frase
		FinSi
		
	FinSi
	
	
FinAlgoritmo

//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
//Concatenar() de PseInt.
