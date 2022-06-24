Algoritmo sin_titulo
	
	Definir a, b, c, d, vecA, vecB, vecC, vecD, aux Como Caracter
	Definir i, long Como Entero
	i =0
	
	a = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
	Dimension vecA(Longitud(a))
	
	rellenar(vecA,a,i)
	
	b = 'abcdefghijklmopqrstuvwxyz'
	Dimension vecB(Longitud(b))
	
	rellenar(vecB,b,i)
	
	c = '0123456789'
	Dimension vecC(Longitud(c))
	
	rellenar(vecC,c,i)
	
	d = '!@#$'
	Dimension vecD(Longitud(d))
	
	rellenar(vecD,d,i)
	
	long = 8
	
	Escribir 'Generate eight digits password...'
	leer aux
	
	generarPasswd(vecA,vecB,vecC,vecD,long,i,a,b,c,d)
	
FinAlgoritmo

SubProceso rellenar(vector,cad,i)
	
	para i = 0 Hasta Longitud(cad)-1 Hacer
		
		vector(i) = SubCadena(cad,i,i)
		
	FinPara
	
FinSubProceso

SubProceso generarPasswd(vecA,vecB,vecC,vecD,long,i,a,b,c,d)
	
	Definir password, char Como Caracter
	Definir random,pos Como Entero
	
	password = ''
	
	Para i = 0 Hasta long -1 Hacer
		
		random = Aleatorio(1,4)
		
		Segun random Hacer
			1: pos = Aleatorio(1, Longitud(a)-1)
				
				char = vecA(pos)
				
			2: pos = Aleatorio(1, Longitud(b)-1)
				
				char = vecB(pos)
				
			3: pos = Aleatorio(1, Longitud(c)-1)
				
				char = vecC(pos)
				
			4: pos = Aleatorio(1, Longitud(d)-1)
				
				char = vecD(pos)
				
		FinSegun
		
		password = password + char
		
	FinPara
	
	Escribir password
	
FinSubProceso
	