Algoritmo saberSiEsPrimo
	
	Definir num Como Entero
	
	Escribir 'Ingrese un numero'
	Leer num
	
	si esPrimoOno(num) Entonces
		Escribir 'El numero ', num, ' es primo.'
	SiNo
		Escribir 'El numero ', num, ' no es primo.'
	FinSi
	
FinAlgoritmo

Funcion primo <- esPrimoOno(num)
	
	Definir primo Como Logico
	Definir cont, i, resto Como Entero
	cont = 0
	
	Para i = 1 Hasta num Con Paso 1 Hacer
		
		resto = num mod i
		
		si resto = 0 Entonces
			
			cont = cont + 1
			
		FinSi
		
	Fin Para
	
	si cont = 2 Entonces
		
		primo = Verdadero
		
	SiNo
		
		primo = Falso
		
	FinSi
	
FinFuncion

//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es
//primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.