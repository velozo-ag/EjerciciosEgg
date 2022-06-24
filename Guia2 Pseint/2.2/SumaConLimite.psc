Algoritmo SumaConLimite
	
	Definir limite, num, suma Como Entero
	
	Escribir 'Ingrese una cantidad limite:'
	leer limite
	
	suma = 0
	
	Mientras suma < limite Hacer
		
		Escribir 'Ingrese los numeros que desea sumar:'
		Leer num
		suma = suma + num
		
	FinMientras
	
	Escribir 'La cantidad de la suma es: ', suma;
	
FinAlgoritmo

//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.