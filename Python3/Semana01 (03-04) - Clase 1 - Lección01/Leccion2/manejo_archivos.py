# Declaramos una variable
try:
    archivo = open('prueba.txt', 'w', encoding='utf8')  # la w es de write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt\n')
    archivo.write('Los acentos son importantes en las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Las letras son: \nr read leer, \na append anexa, \nw write escribe, \nx crea un archivo')
    archivo.write('\nt esta para texto o text, \nb archivos binarios, \nw+ lee y escribe son iguales r+ \n')
    archivo.write('Con esto terminamos')
# el metodo open puede arrojar una excepcion por lo que debe estar entre un try catch
except Exception as e:
    print(e)
finally:  # siempre se ejecuta
    archivo.close()  # con este metodo se debe cerrar.
#archivo.write('todo quedo perfecto') # esta linea de codigo no puede ejecutarse porque el arxhivo no se puede usar cuando cerro