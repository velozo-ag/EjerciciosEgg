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

//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario, validando
//que el primer n�mero m�ltiplo del segundo y devuelva verdadero si el primer n�mero es
//m�ltiplo del segundo, sino es m�ltiplo, que devuelva falso.
