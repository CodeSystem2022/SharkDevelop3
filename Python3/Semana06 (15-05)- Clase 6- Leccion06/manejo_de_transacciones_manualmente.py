import psycopg2 as bd

conexion = bd.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')

try:
    conexion.autocommit= False
    cursor = conexion.cursor()
    
    sentencia = 'INSERT INTO persona(nombre, apellido, email) VALUES(%s,%s,%s)'
    valores = ("Juan","Velasquez","pepitofacha@gmail.com")
    
    cursor.execute(sentencia, valores)

    conexion.commit()
    print('fin transaccion')
except Exception as e:
    print('---Rollback--- \n Ocurrió un error: {e} ')
    conexion.rollback()
finally:
    conexion.close()