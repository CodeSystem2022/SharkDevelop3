#from psycopg2 import pool
import sys

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'root'
    _PASSWORD = 'Todo1ev@'
    _DB_PORT = '3306'
    _HOST = '127.0.0.1'
    _MIN_OBJ = 1
    _MAX_OBJ = 5
    _pool = None

    @classmethod
    def obtenerConexion(cls):
        pass


    @classmethod
    def obtenerCursor(cls):
        pass
    
    @classmethod
    def this_fails():
        f = 1/0

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                #cls._pool = SimpleConectionPool(cls._MIN_OBJ,
                #                                cls._MAX_OBJ,
                #                                cls._HOST,
                #                                cls._USERNAME,
                #                                cls._PASSWORD,
                #                                cls._DB_PORT,
                #                                cls._DATABASE)
                cls.this_fails()
            except Exception as e:
                #log.error(f'Ocurrió un error {e}')
                sys.exit("Disculpe las molestias")
        else:
            return cls._pool
        
Conexion.obtenerPool()
