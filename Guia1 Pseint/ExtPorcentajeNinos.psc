Algoritmo PorcentajeNinos
	
	Definir ninos, ninas, total Como Entero
	Definir porcentaje1 Como Real
	
	Escribir "Introduce la cantidad de ninos que hay: "
	Leer ninos
	
	Escribir "Introduce la cantidad de ninas que hay: "
	Leer ninas
	
	total = ninos + ninas;
	porcentaje1 = (ninos * 100) / total
	
	Escribir porcentaje1, "% son ninos y el ", 100 - porcentaje1, "% son ninas."
	
FinAlgoritmo

//Un colegio desea saber qu� porcentaje de ni�os y qu� porcentaje de ni�as hay en el curso
//actual. Dise�ar un algoritmo para este prop�sito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de ni�os, y la cantidad total de ni�as que hay en el curso.