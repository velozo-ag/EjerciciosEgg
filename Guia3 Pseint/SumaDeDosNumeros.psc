Algoritmo Suma_de_dos_numeros
	
	Definir n1, n2, resultado Como Real
	Escribir 'Ingrese dos numeros para sumar'
	Leer n1,n2
	
	resultado = sumaDeDosNumeros(n1,n2)
	Escribir resultado
	
FinAlgoritmo

Funcion suma <- sumaDeDosNumeros(num1,num2)
	Definir suma Como Real
	suma = num1 + num2
FinFuncion

//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le
//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n
//calcular� la suma y lo devolver� para imprimirlo en el algoritmo.
