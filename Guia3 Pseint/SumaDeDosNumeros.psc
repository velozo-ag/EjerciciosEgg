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

//Realizar una función que calcule la suma de dos números. En el algoritmo principal le
//pediremos al usuario los dos números para pasárselos a la función. Después la función
//calculará la suma y lo devolverá para imprimirlo en el algoritmo.
