Algoritmo EsImpar
	
	Definir num Como Real
	Definir esImp Como Logico
	
	Escribir 'Ingrese un numero:'
	Leer num
	
	esImp = !saberSiEsPar(num)
	
	Escribir esImp
	
FinAlgoritmo

Funcion ParImpar <- saberSiEsPar(num1)
	Definir ParImpar Como Logico
	
	ParImpar = (num1 mod 2 = 0)
	
FinFuncion

//Realizar una función que valide si un número es impar o no. Si es impar la función debe
//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener
//mensajes que digan si es par o no, eso debe pasar en el Algoritmo.
