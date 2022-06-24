Algoritmo ExtPorcentajeDeAumento
	
	Definir precio1, precio2, aumento Como Real
	Escribir 'Ingrese el precio de un producto al comenzar el anio y luego, el precio del mismo producto al finalizarlo'
	Leer precio1, precio2
	
	aumento = ((precio2 - precio1) / 100) * precio1
	
	Escribir 'El producto aumento en un ', aumento, '% en un anio.'
	
FinAlgoritmo
