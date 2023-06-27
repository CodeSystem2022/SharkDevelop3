import psycopg2 as bd

conexion = bd.connect(user='postgres',password='*****',host=127.0.0.1, port=5432,dadabase='test_db')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'INSERT INTO personas(nombre,apellido,email) VALUES(%s,%s,%s)'
            valores = ['Lucía,Perez,luci@gmail.com']
            cursor.execute(sentencia,valores) 
            #conexion.commit() #Esto lo hace el with
except Exception as e:
    #conexion.rollback() # Esto lo hace el with
    print(f"Ocurrió un error: {e}")
finally:
    #cursor.close() esto ya lo hace el with
    conexion.close() # pero esto no

print("Fin transaccion")
