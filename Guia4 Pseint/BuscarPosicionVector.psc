Algoritmo BuscarPosicionVector
	
	Definir n, vector, i, num Como Entero
	Definir bandera Como Logico
	
	bandera = Falso
	
	Escribir "Ingresar el tama�o del vector:"
	Leer n
	
	Dimension vector(n)
	
	Escribir "Ingrese los ",n, " valores para el vector:"
	Para i = 0 Hasta n - 1 Hacer
		
		Escribir "Posici�n ", i Sin Saltar, " -"
		Leer vector(i)
		
	FinPara
	
	Escribir "Ingrese un n�mero para buscarlo:"
	Leer num
	
	Para i = 0 Hasta n - 1 Hacer
		
		si vector(i) = num Entonces
			
			Escribir "N�mero encontrado en la posici�n n� ", i
			bandera = Verdadero
			
		FinSi
		
	FinPara
	
	si bandera = Falso Entonces
		
		Escribir "No se encontr� el n�mero solicitado."
		
	FinSi
	
FinAlgoritmo


// Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
// usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
// tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
// encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
// imprimir todas las posiciones donde se encuentra ese valor.
// Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
// mensaje.