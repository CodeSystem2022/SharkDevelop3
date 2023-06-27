from ManejoArchivos import ManejoArchivos

#sintaxis simplificada que de manera automatica abre y cierra el archivo sin necesidad del try catch

#with open('prueba.txt', 'r', encoding='utf8') as archivo:
#    print(archivo.read())
#utiliza diferentes metodos: __enter__ este es el que abre
# ahora el siguiente metodo es el que cierra: __exit__

with ManejoArchivos('prueba.txt') as archivo:
    print(archivo.read())