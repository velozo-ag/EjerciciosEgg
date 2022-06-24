Algoritmo IngresarClave
	
	Definir clave, aux Como Caracter
	Definir i Como Entero
	
	Escribir 'Ingrese la clave, tiene tres intentos'
	
	i = 0
	aux = 'eureka'
	
	repetir
		
		Leer clave
		
		i = i + 1
		
		si clave <> aux Entonces
			Escribir 'Incorrecto'
		FinSi
		
	hasta Que (clave = aux) O i = 3
	
	si	clave = aux Entonces
		Escribir 'Ha ingresado al sistema correctamente.' 
	SiNo
		Escribir 'Se han agotado los intentos.'
	FinSi
	
	
	
FinAlgoritmo

//Teniendo en cuenta que la clave es "eureka", escribir un programa que nos pida ingresar
//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
//correctamente.
