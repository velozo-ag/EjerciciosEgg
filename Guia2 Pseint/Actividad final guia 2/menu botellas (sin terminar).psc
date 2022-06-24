Algoritmo sin_titulo
	
	Definir usuario, contrasena, aux, siOno Como Caracter
	Definir saldo, botellas, i, seleccion, numAleatorio Como Real
	Definir login Como Logico
	
	login = falso
	usuario = 'Albus_D'
	contrasena = 'caramelosDeLimon'
	i = 0
	saldo = 0
	
	Escribir 'Ingrese su usuario: '
	Leer aux
	
	si aux = usuario Entonces                                                              //Login 
		
		Mientras i < 3 y aux <> contrasena Hacer  
			Escribir 'Ingrese su contrasena: '
			Leer aux
			i = i + 1
		Fin Mientras
		
		si aux = contrasena Entonces
			Escribir '-------------------------'
			Escribir 'Ingreso correctamente'
			login = Verdadero
			
			Hacer
				
				Escribir '----------Menu-----------'
				Escribir 'Escriba el numero segun precise: '
				Escribir '1- Ingresar botellas.'
				Escribir '2- Consultar saldo.'
				Escribir '3- Salir.'
				Leer seleccion
				
				Segun seleccion Hacer
					1:
						Escribir '----Ingresar Botellas----'                                   //SELECCION INGRESAR BOTELLAS
						Escribir ''
						
						Escribir 'Ingrese la cantidad de botellas que va a ingresar: '
						Leer botellas
						
						Para i = 1 Hasta botellas Con Paso 1 Hacer
							Escribir ''
							Escribir '-------Botella N' i '--------'
							Escribir ''
							
							numAleatorio = Aleatorio(100,3000)
							
							Escribir 'Esta botella pesa ', numAleatorio, 'g.'
							
							si numAleatorio <= 500 Entonces
								
								Escribir 'El valor de su botella es $50.'
								Escribir 'Ingrese S para aceptar, N para declinar.'
								Leer siOno
								
								si siOno = 's' o siOno = 'S' Entonces
									saldo = saldo + 50
									Escribir 'Se han acreditado $50 a su saldo.'
								SiNo
									Escribir 'Devolviendo material...'
								FinSi
								
							SiNo
								si numAleatorio > 500 y numAleatorio <=1500 Entonces
									
									Escribir 'El valor de su botella es $125.'
									Escribir 'Ingrese S para aceptar, N para declinar.'
									Leer siOno
									
									si siOno = 's' o siOno = 'S' Entonces
										saldo = saldo + 125
										Escribir 'Se han acreditado $125 a su saldo.'
									SiNo
										Escribir 'Devolviendo material...'
									FinSi
									
								SiNo
									si numAleatorio > 1500 Entonces
										
										Escribir 'El valor de su botella es $200.'
										Escribir 'Ingrese S para aceptar, N para declinar.'
										Leer siOno
										
										si siOno = 's' o siOno = 'S' Entonces
											saldo = saldo + 200
											Escribir 'Se han acreditado $200 a su saldo.'
										SiNo
											Escribir 'Devolviendo material...'
										FinSi
										
									FinSi
								FinSi
							FinSi
							
						Fin Para
						
						Escribir '--Fin Ingresar Botellas--'
						Escribir ''
						
					2:
						Escribir 'Consultar saldo'                                          //SELECCION CONSULTAR SALDO
					3:
						Escribir 'Saliendo...'                                              //SELECCION SALIR
					De Otro Modo:
						Escribir 'Ingrese un valor valido'
				Fin Segun
				
			Mientras Que login
			
		SiNo
			Escribir 'Ha exedido el limita de intentos, intentelo mas tarde.'
		FinSi
		
	SiNo
		
		Escribir 'Usuario incorrecto.'
		
	FinSi
	
	
	
	
FinAlgoritmo

//Necesitamos crear un sistema para una m�quina de reciclaje de botellas autom�tica. Dicha
//m�quina nos pagar� dinero por la cantidad de pl�stico reciclado. Tenemos que ingresar nuestro
//usuario y contrase�a para que se nos cargue el saldo por sistema a nuestra cuenta.

//- Condici�n simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//verdadero, validaremos si la contrase�a es "caramelosDeLimon". Si la contrase�a es correcta
//haremos que una variable llamada Login sea verdadera.

//- Bucle Mientras: Este bloque de validaci�n de la contrase�a lo encerraremos en un bucle
// Mientras para darle al usuario s�lo 3 intentos para poner la contrase�a.

//- Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al men� de
// opciones: "Ingresar botellas", "Consultar saldo" y "Salir"

//- Ingresar Botellas: Primero preguntaremos cu�ntas botellas se va a ingresar al sistema. Una vez
// que tenemos el n�mero vamos a usar un bucle para, a fin de ir ingresando cada botella. En
// cada ciclo del bucle se debe generar un n�mero aleatorio entre 100 y 3000 gr, que va a ser el
// peso de las botellas a reciclar (simulando que el usuario est� ingresando botellas en la
// m�quina). Una vez generado, seg�n el peso del material, usaremos un condicional m�ltiple
// para asignarle un valor monetario:

//- Si es menos de 500 gr, corresponden $50

//- Si es entre 501 gr y 1500 gr, corresponden $125

//- Si es m�s de 1501 gr, corresponden $200

//- Hecho esto, el programa debe informar al usuario por pantalla el valor que se le ofrece. Si el
// usuario acepta, lo acreditamos a su saldo, sino se debe devolver el material (s�lo mostrar en
// pantalla "Devolviendo material"). Para esto usaremos un condicional doble.

//- Consultar saldo: revisaremos el valor monetario que tiene asignada la variable "saldo".

//- Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al men� principal.