
archivo = open('prueba.txt','r', encoding='utf8') #r de read
#print(archivo.read())
'''
print(archivo.read(15))
print(archivo.read(11)) #se continua desde la linea anterior
print(archivo.readline()) #tambien continua desde el anterior si no le pasamos parametros
#archivo = open('prueba.txt','a') #a de append, abre un archivo para anexar informacion y crear un archivo nuevo en caso de que no exista

#archivo = open('prueba.txt','x') #x crea un archivo'''


# for in. vamos a iterar el archivo, cada una de las lineas
'''for linea in archivo: #iteramos todos los elementos del archivo
    print(archivo.readline()[11])'''


#Anexamos la informacion, copiamos a otro
archivo2 = open('copia.txt', 'a', encoding='utf8')
archivo2.write(archivo.read())
archivo.close()
archivo2.close()
#se copia lo que se agrega la cantidad de veces que se ejecute. Si cambiamos la a por la w se quita el exceso de codigo y deja solo uno
print('Se ha terminado el proceso de leer y copiar archivos')

