#Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8') #w = write / open es un método que puede largar una excepcion
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt. \n')
    archivo.write('Los acentos son importantes para las palabras ')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Con esto terminamos.\n')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() #con esto se cierra el archivo

#archivo.write('Todo quedó perfecto!')
