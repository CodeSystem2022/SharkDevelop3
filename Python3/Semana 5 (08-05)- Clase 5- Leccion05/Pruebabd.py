import psycopg2 # Esto es para poder conectarnos a postgret

conexion = psycopg2.connect(
    user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd'
)

#https://www.psycopg.org/docs/usage.html#with-statement
try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'SELECT * FROM persona WHERE id_persona = %s' #placeholder
            id_persona = input('Ingrese un numero para el id_persona: ')
            cursor.execute(sentencia, (id_persona)) #de esta manwera ejecutamos la sentencia
            registros = cursor.fetchone() #cupera todos los registros de la sentencia
            print(registros)#imprime como lista las tuplas
except Exception as e:
    print(f'Ocurrio un error: {e}')
finally:
    conexion.close()