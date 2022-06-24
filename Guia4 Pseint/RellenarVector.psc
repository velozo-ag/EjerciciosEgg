Algoritmo RellenarVector
	
	Definir vector, i Como Real
	Dimension vector[5]
	
	Escribir 'Ingrese 5 valores'
	
	Para i = 0 Hasta 4 Hacer
		
		Leer vector(i)
		
	FinPara
	
	Para i = 0 Hasta 4 Hacer
		
		si i = 4 Entonces
			
			Escribir vector(i)
			
		SiNo
			
			Escribir vector(i) , ', ' Sin Saltar
			
		FinSi
		
	FinPara
	
	Escribir ''
	
FinAlgoritmo

//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los
//muestre por pantalla.