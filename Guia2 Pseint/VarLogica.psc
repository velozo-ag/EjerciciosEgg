Algoritmo VarLogica
	
	Definir n1,n2,n3 Como Entero
	Definir log Como Logico

	Escribir 'Ingrese 3 notas, una por una:'
	Leer n1,n2,n3
	
	log = (n1 >= 1 y n1 <= 10) y (n2 >= 1 y n2 <= 10) y (n3 >= 1 y n3 <= 10)
	
	si log Entonces
		Escribir 'Las notas son correctas.'
	SiNo
		Escribir 'Las notas son incorrectas.'
	FinSi
	
FinAlgoritmo

//Escriba un programa que pida 3 notas y valide si esas notas est�n entre 1 y 10. Si est�n
//entre esos par�metros se debe poner en verdadero una variable de tipo l�gico y si no
//ponerla en falso. Al final el programa debe decir si las 3 notas son correctas usando la
//variable de tipo l�gico.