Algoritmo NotasDeAlumnos
	
	Definir cantAlumnos, n, aux, i, contadorDesaprobados, notasDesaprobados, notaMayorA, notaMasAlta, notaParcial Como Real
	Escribir 'Ingrese la cantidad de alumnos que tiene:'
	Leer cantAlumnos
	i = 0
	aux = 0
	contadorDesaprobados = 0
	notasDesaprobados = 1
	notaMayorA = 0
	notaMasAlta = 0
	notaParcial = 0
	
	Para i = 1 Hasta cantAlumnos Con Paso i + 1 Hacer
		
		Escribir 'ALUMNO N', i
		
		Escribir 'Nota - Trabajo practico integrador:' ///////////////////////// Nota Integrador /////////////////////////
		Leer n
		aux = aux + (n *10) * 35 / 100
		
		si n > 7.5 Entonces
			notaMayorA = notaMayorA + 1
		FinSi
		
		Escribir 'Nota - Exposicion:'               ///////////////////////// Nota Exposicion /////////////////////////
		Leer n
		aux = aux + (n *10) * 25 / 100
		
		si n > notaMasAlta Entonces
			notaMasAlta = n
		FinSi
		
		Escribir 'Nota - Parcial:'                  ///////////////////////// Nota Parcial /////////////////////////
		Leer n
		aux = aux + (n *10) * 40 / 100
		
		aux = aux / 10
		
		si n > 4 y n < 7.5 Entonces
			notaParcial = notaParcial + 1
		FinSi
		
		si aux < 6.5 Entonces
			contadorDesaprobados = contadorDesaprobados + 1
			notasDesaprobados = notasDesaprobados + aux
		FinSi
		
	Fin Para
	
	si contadorDesaprobados > 1 Entonces
		Escribir 'La nota promedio de los estudiantes que han desaprobado es: ', notasDesaprobados / contadorDesaprobados
	SiNo
		Escribir 'Todos han aprobado.'
	FinSi
	
	Escribir 'El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: ', (notaMayorA * 100) / cantAlumnos, '%'
	Escribir 'La nota mas alta de las exposiciones es: ', notaMasAlta
	Escribir 'El total de estudiantes que obtuvieron una nota entre 4 y 7.5 puntos en el parcial es de: ', notaParcial
	
FinAlgoritmo

//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves de
//sus estudiantes:

//- Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//reprueba el curso si tiene una nota final inferior a 6.5
//- Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
//- La mayor nota obtenida en las exposiciones.
//- Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.

//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.