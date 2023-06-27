import psycopg2 as bd

conexion = bd.connect(user='postgres', password='admin', host='127.0.0.1', port='5432', database='test_bd')
#formato automatico sin el with
try:
  #  conexion.autocommit = False #este codigo no debria estar
    cursor = conexion.cursor()
    sentencia = 'INSERT INTO persona(nombre, apellido, email)VALUES(%s, %s, %s)'
    valores = ('Maria', 'Esparza', 'mesparza@mail.com')
    cursor.execute(sentencia, valores)
    conexion.commit() #hacemos el commmit manualmente
    print('Termina la transaccion')
except Exception as e:
    conexion.rollback()
    print(f'Ocurrio un error, se hizo un rollback: {e}')
finally:
    conexion.close()

    #esto podria no ser necesario ya que se puede hacer con el with o con el
    #roollback