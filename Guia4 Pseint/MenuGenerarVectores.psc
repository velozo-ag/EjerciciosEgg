Algoritmo MenuGenerarVectores
	
	Definir i, vecA, vecB, vecC, n Como Real
	Definir aux1, aux2, aux3 Como Logico
	Definir opElegida, opElegida2 Como Caracter
	
	aux1 = Falso
	aux2 = Falso
	aux3 = Falso
	
	Escribir 'Ingrese el tamanio de los vectores: ' Sin Saltar
	Leer n
	
	Hacer
		
		Escribir ''
		Escribir 'Que quiere hacer? '
		Escribir 'Opcion A - Llenar vector A'
		Escribir 'Opcion B - Llenar vector B'
		Escribir 'Opcion C - Llenar vector C con A + B'
		Escribir 'Opcion D - Llenar vector C con B - A'
		Escribir 'Opcion E - Mostrar vector'
		Escribir 'Opcion F - Salir'
		Escribir ''
		
		Leer opElegida
		
		Escribir ''
		
		Segun opElegida Hacer
			
			'A':
				Dimension vecA(n)
				aux1 = Verdadero
				
				Para i = 0 Hasta n - 1 Hacer
					
					vecA(i) = Aleatorio(-100, 100)
					
				FinPara
				
				Escribir 'Vector A generado...'
				
			'B':
				Dimension vecB(n)
				aux2 = Verdadero
				
				Para i = 0 Hasta n - 1 Hacer
					
					vecB(i) = Aleatorio(-100, 100)
					
				FinPara
				
				Escribir 'Vector B generado...'
				
			'C':
				Dimension vecC(n)
				aux3 = Verdadero
				
				Para i = 0 Hasta n - 1 Hacer
					
					vecC(i) = vecA(i) + vecB(i)
					
				FinPara
				
				Escribir 'Vector C generado...'
				
			'D':
				Dimension vecC(n)
				aux3 = Verdadero
				
				Para i = 0 Hasta n - 1 Hacer
					
					vecC(i) = vecB(i) - vecA(i)
					
				FinPara
				
				Escribir 'Vector C generado...'
			'E':
				Hacer
					
					Escribir 'Que vector desea ver: A - B - C || Ingrese F para salir'
					Leer opElegida2
					Escribir ''
					Segun opElegida2 Hacer
						'A':
							
							Si aux1 Entonces
								
								Escribir '[' Sin Saltar
								
								Para i = 0 Hasta n - 1 Hacer
									
									
									si i = 0 Entonces
										Escribir vecA(i) Sin Saltar
									SiNo
										Escribir ', ' Sin Saltar
										Escribir vecA(i) Sin Saltar
									FinSi
									
								FinPara
								
								Escribir ']'
								
							SiNo
								
								Escribir 'El vector A no esta definido'
								
							FinSi
							
						'B':
							
							Si aux2 Entonces
								
								Escribir '[' Sin Saltar
								
								Para i = 0 Hasta n - 1 Hacer
									
									si i = 0 Entonces
										Escribir vecB(i) Sin Saltar
									SiNo
										Escribir ', ' Sin Saltar
										Escribir vecB(i) Sin Saltar
									FinSi
									
								FinPara
								
								Escribir ']'
								
							SiNo
								
								Escribir 'El vector B no esta definido'
								
							FinSi
							
						'C':
							
							Si aux3 Entonces
								
								Escribir '[' Sin Saltar
								
								Para i = 0 Hasta n - 1 Hacer
									
									si i = 0 Entonces
										Escribir vecC(i) Sin Saltar
									SiNo
										Escribir ', ' Sin Saltar
										Escribir vecC(i) Sin Saltar
									FinSi
									
								FinPara
								
								Escribir ']'
								
							SiNo
								
								Escribir 'El vector C no esta definido'
								
							FinSi
							
						'F':
							Escribir 'Saliendo...'
						De Otro Modo:
							Escribir 'Opcion incorrecta'
					Fin Segun
					
				Mientras Que opElegida2 <> 'F'
				
				
			'F':
				
			De Otro Modo:
				Escribir 'Opcion incorrecta'
				Escribir ''
		Fin Segun
		
	Mientras Que opElegida <> 'F'
	
	Escribir ''
	Escribir 'Saliendo del programa...'
	
FinAlgoritmo


// Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
// que ingrese la opción Salir:
//	 A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
//	    usando la función Aleatorio(valorMin, valorMax) de PseInt.
//	 B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
//	 C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//      a elemento. Ejemplo: C = A + B
//	 D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//     elemento. Ejemplo: C = B - A
//   E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
//	    A, B, o C.
//	 F. Salir.
//   NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//		  para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//        vez.
