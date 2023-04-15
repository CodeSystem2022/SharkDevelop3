from EqualNumbersException import EqualNumbersException #importamos
resultado = None #variable global fuera del bloque

try:
    a = int(input('Digite un primer número: '))
    b = int(input('Digite un segundo número: '))
    if a == b:
        raise EqualNumbersException ('Son números iguales') #raise lanza una excepción2 y llama a la clase Exception
    resultado = a / b
except TypeError as e:
    print(f'Type error - Ocurrió un error: {type(e)}')
except ZeroDivisionError as e:
    print (f'Zero Division Error - Ocurrió un error: {type(e)}')
except Exception as e:
    print (f'Exception - Ocurrió un error: {type(e)}')
else:
    print('No se arrojó ninguna excepción') #bloque opcional en caso de que no haya ninguna excepcion
finally: #Siempre se va a ejecutar
    print('Ejecución de este bloque finalizada')


print(f'El resultado es: {resultado}')
print('Seguimos ...')

