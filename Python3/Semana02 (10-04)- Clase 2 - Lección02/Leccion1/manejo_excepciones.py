from NumerosIgualesException import NumerosIgualesException

resultado = None

try:
    a = int(input('Digite el primer numero: '))
    b = int(input('Digite el segundo numero: '))
    if a == b:
        raise NumerosIgualesException('Son iguales') #raise es para lanzar una excepcion,con esto llamamos a la clase de la excepcion
    resultado = a/b
except ZeroDivisionError as e:
    print(f'Ocurrio un error: {type(e)}')
except TypeError as e:
    print(f'Problema de tipos: {type(e)}')
except Exception as e:
    print(f'Excepcion - Ocurrio un error: {type(e)}')
else:
    print(f'No se arrojo ninguna excepcion') #se usa cuando no se entra al try catch
finally:
    print("Ejecucion de finally")

print(f'El resultado es: {resultado}') #esto es para ver que el resultado sigue igual si hay un error
print('Seguimos...')
