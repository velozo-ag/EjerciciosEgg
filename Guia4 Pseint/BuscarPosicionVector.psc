Algoritmo BuscarPosicionVector
	
	Definir n, vector, i, num Como Entero
	Definir bandera Como Logico
	
	bandera = Falso
	
	Escribir "Ingresar el tamaño del vector:"
	Leer n
	
	Dimension vector(n)
	
	Escribir "Ingrese los ",n, " valores para el vector:"
	Para i = 0 Hasta n - 1 Hacer
		
		Escribir "Posición ", i Sin Saltar, " -"
		Leer vector(i)
		
	FinPara
	
	Escribir "Ingrese un número para buscarlo:"
	Leer num
	
	Para i = 0 Hasta n - 1 Hacer
		
		si vector(i) = num Entonces
			
			Escribir "Número encontrado en la posición n° ", i
			bandera = Verdadero
			
		FinSi
		
	FinPara
	
	si bandera = Falso Entonces
		
		Escribir "No se encontró el número solicitado."
		
	FinSi
	
FinAlgoritmo


// Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
// usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
// también debe ser ingresado por el usuario). El programa debe indicar la posición donde se
// encuentra el valor. En caso que el número se encuentre repetido dentro del arreglo se deben
// imprimir todas las posiciones donde se encuentra ese valor.
// Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
// mensaje.