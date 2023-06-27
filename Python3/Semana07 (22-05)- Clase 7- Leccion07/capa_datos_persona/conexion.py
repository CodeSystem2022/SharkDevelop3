from psycopg2 import pool
from logger_base import log
import sys


class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres' #cambiar por datos propios
    _PASSWORD = 'admin' #cambiar por datos propios
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON = 1
    _MAX_CON = 5
    _pool = None

    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn()
        log.debug(f'Conexion obtenida del pool: {conexion}')
        return conexion

    @classmethod
    def obtenerCursor(cls):
       pass

    @classmethod
    def obtenerPool(cls):
        if cls._pool is None:
            try:
                cls._pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                      cls._MAX_CON,
                                                      host=cls._HOST,
                                                      user=cls._USERNAME,
                                                      password=cls._PASSWORD,
                                                      port=cls._DB_PORT,
                                                      database=cls._DATABASE)
                log.debug(f'creacion del pool exitosa: {cls._pool}')
                return cls._pool
            except Exception as e:
                log.error(f'Ocurrio un error al obtener el pool: {e}')
                sys.exit()
        else:
            return cls._pool


if __name__ == '__main__':
    conexio1 = Conexion.obtenerConexion()
    conexio2 = Conexion.obtenerConexion()
    conexio3 = Conexion.obtenerConexion()
    conexio4 = Conexion.obtenerConexion()
    conexio5 = Conexion.obtenerConexion()
