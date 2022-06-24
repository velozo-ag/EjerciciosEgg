Algoritmo Ejer7_G4
	Definir vec1, vec2, n, i Como Real
	Definir iguales Como Logico
	Escribir "Ingrese tamaño de vectores: "
	Leer n
	
	Dimension vec1(n)
	Dimension vec2(n)
	
	rellenarAleatorio(vec1,vec2,n)
	
	Escribir 'Los valores del vector 1 son: '
	Para i = 0 Hasta n -1 Hacer
		Escribir vec1(i) " " Sin Saltar
	FinPara
	
	Escribir " "
	
	Escribir 'Los valores del vector 2 son:'
	Para i = 0 Hasta n -1 Hacer
		Escribir vec2(i) " " Sin Saltar
	FinPara
	
	Escribir " "
	
	iguales = sonIguales(vec1,vec2,n)
	
	Si iguales Entonces
		Escribir "Son iguales."
	SiNo
		Escribir "No son iguales."
	FinSi
	
FinAlgoritmo

SubProceso rellenarAleatorio (vec1 Por Referencia, vec2 Por Referencia, n Por Referencia)
	
	Definir i Como Entero
	
	Para i = 0 Hasta n - 1 Hacer
		vec1(i) = Aleatorio(-50,50)
		vec2(i) = Aleatorio(-50,50)
	FinPara
	
FinSubProceso

Funcion retorno = sonIguales (vec1, vec2,n)
	
	Definir retorno Como Logico
	Definir i Como Entero
	Para i = 0 Hasta n - 1 Hacer
		Si vec1(i) <> vec2(i) Entonces
			retorno = Falso
			i = n - 1
		SiNo
			retorno = Verdadero
		FinSi
	FinPara
	
FinFuncion


