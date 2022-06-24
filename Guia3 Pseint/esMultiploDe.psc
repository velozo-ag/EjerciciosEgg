Algoritmo esMultiploDe
	
	definir num1,num2 como real
	escribir "ingrese 2 numeros"
	leer num1
	leer num2
	escribir ESMULTIPLO( num1,num2 )
	
FinAlgoritmo

funcion multiplo <- esMultiplo(num1,num2)
	
	Definir multiplo Como Logico
	
	multiplo = (num1 mod num2 = 0)
	
	
FinFuncion

//Crea una función EsMultiplo que reciba los dos números pasados por el usuario, validando
//que el primer número múltiplo del segundo y devuelva verdadero si el primer número es
//múltiplo del segundo, sino es múltiplo, que devuelva falso.
