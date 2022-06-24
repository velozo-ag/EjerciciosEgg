Algoritmo ValorMasGrande
	
	Definir vector, i, n Como Real
	
	Escribir 'Ingrese el tamanio del vector: '
	Leer n
	
	Dimension vector(n)
	
	Escribir 'Ingrese el valor de cada posicion: '
	Para i = 0 Hasta n - 1 Hacer
		
		Escribir 'Posicion ', i, ' -' Sin Saltar
		Leer vector(i)
		
	FinPara
	
	Escribir 'El valor mas grande ingresado es ', buscarElMayor(vector, n)
	
FinAlgoritmo

//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.

funcion mayor <- buscarElMayor(vector, n) 
	
	Definir mayor,i Como Real
	
	mayor = vector(0)
	
	Para i = 0 Hasta n - 1 Hacer
		
		si	vector(i) > mayor Entonces
			
			mayor = vector(i)
			
		FinSi
		
	FinPara
	
FinFuncion
	