Algoritmo PromedioDeTemperaturas
	
	Definir i, m, dias, maxima, minima, sumaDeTemperaturas, media Como Real
	media = 0
	sumaDeTemperaturas = 0
	
	Escribir 'Ingrese la cantidad de dias a registrar:'
	Leer dias
	
	Para i = 1 Hasta dias Con Paso 1 Hacer
		Escribir '-------------------------------------------------'
		Escribir 'Ingresar la temperatura maxima y minima del dia ', i
		Escribir ''
		Leer maxima
		Leer minima
		
		sumaDeTemperaturas = (maxima + minima)
		
		obtenerMedia(sumaDeTemperaturas,media)
		Escribir ''
		Escribir 'La temperatura media del dia ' i ' fue: ' media
		Escribir '-------------------------------------------------'
		Escribir ''
		
	Fin Para
	
FinAlgoritmo

SubProceso obtenerMedia(sumaDeTemperaturas Por valor, media Por Referencia)
	media = 0
	media = (sumaDeTemperaturas / 2)
	
FinFuncion

//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.