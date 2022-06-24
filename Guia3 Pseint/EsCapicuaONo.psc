Algoritmo EsCapicuaONo
	Definir capi Como Caracter
	definir i,cifras, cond, test,n, test2, test3,devolucion,noSonIguales Como real
	
	Escribir 'Ingrese un numero para identificar si es capicua o no.'
	
	Leer n
	
	cond = 0
	i = 1
	Hacer
		test = trunc(n/(10^i))
		si test >= 1 y test < 10
			cifras = i + 1
			cond = 1
		SiNo
			i = i + 1
		FinSi
	Mientras Que cond <> 1
	
	sacarExtremidades(n, cifras, noSonIguales)
	
	si noSonIguales > 0 Entonces
		Escribir 'El numero no es capicua'
	SiNo
		Escribir 'El numero es capicua'
	FinSi
	
FinAlgoritmo

SubProceso sacarExtremidades(n Por Valor, cifras Por	Valor, noSonIguales Por Referencia)
	
	Definir test,test2,test3,i Como Real
	noSonIguales = 0
	
	Para i = cifras Hasta 2 Con Paso -2 Hacer
		
		test= (n/10^(cifras - 1))
		test2 = n - (trunc(test) * (10^(cifras-1)))
		test3 = trunc(test2 / 10)
		Escribir '////////////////////////'
		Escribir test
		Escribir test2
		Escribir test3	
		Escribir '////////////////////////'
		Escribir ''

		si (trunc(test) = n % 10) Entonces
			
			Escribir 'Son iguales'
			Escribir ''
			
		SiNo
			
			Escribir 'No son iguales'
			Escribir ''
			noSonIguales = noSonIguales + 1
			
		FinSi
		
		n = test3
		cifras = cifras - 2
		
	Fin Para
	
FinSubProceso
	