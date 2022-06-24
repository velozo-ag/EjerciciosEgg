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

//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el n�mero es
//primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� mismo, por ejemplo: 2,
//3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.