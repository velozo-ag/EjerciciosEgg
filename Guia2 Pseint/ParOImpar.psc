Algoritmo ParOImpar
	
	Definir num1, aux Como Entero
	
	Escribir 'Ingrese un numero:'
	Leer num1
	
	si (num1 mod 2) == 0 Entonces
		Escribir num1, ' es par.'
	SiNo
		Escribir num1, ' es impar.'
	FinSi
	
FinAlgoritmo

//Realizar un programa que pida un número y determine si ese número es par o impar.
//Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un
//número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar
//la función mod de PseInt.