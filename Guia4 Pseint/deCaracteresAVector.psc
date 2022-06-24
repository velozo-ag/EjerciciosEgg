Algoritmo deCaracteresAVector
	
    Definir vect, frase, carac como cadena
    Definir i, pos Como Entero
    Definir b Como Logico
	Dimension vect(20)
    b = falso
	
    Escribir "Ingrese un frase"
    Leer frase
    
    Para i = 0 hasta 19  Hacer
        vect(i) = Subcadena(frase,i,i)
    FinPara
    
    Para i = 0 hasta 19 Hacer
        Si i > Longitud(frase) Entonces
            vect(i) = ' '
        FinSi
    FinPara
    
	hacer
		
		Escribir "Ingresar un caracter"
		Leer carac
		Escribir "Ingresar una posicion"
		Leer pos
		
		Si vect(pos) = " " Entonces
			vect(pos) = carac
			b = Verdadero
		SiNo 
			Escribir "La posicion esta ocupada"
		FinSi
		
	Mientras Que b = falso
	
    
    Para i = 0 hasta 19 Hacer
        Escribir vect(i) Sin Saltar
    FinPara
	Escribir ''
    
    
FinAlgoritmo
