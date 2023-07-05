from logger_base import log
from conexion import Conexion


class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None

    def __enter__(self):
        log.debug('Inicio del metodo with y __enter__')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor

    def __exit__(self, tipo_exception, valor_excepcion, detalle_excepcion): #estos parametros no se cambian pero los traduje
        log.debug('Se ejecuta el metodo exit')
        if valor_excepcion:
            self._conexion.rollback()
            log.debug(f'Ocurrio una excepcion: {valor_excepcion}')
        else:
            self._conexion.commit()
            log.debug('Commit de la transaccion')
        self._cursor.close()
        Conexion.liberarConexion(self._conexion)


        

