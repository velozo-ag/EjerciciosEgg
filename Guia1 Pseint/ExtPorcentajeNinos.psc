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

//Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso
//actual. Diseñar un algoritmo para este propósito. Recuerda que para calcular el porcentaje
//puedes hacer una regla de 3 simple. El programa debe solicitar al usuario que ingrese la
//cantidad total de niños, y la cantidad total de niñas que hay en el curso.