#from capa_datos_persona.Persona import Persona
#from capa_datos_persona.conexion import Conexion
#from capa_datos_persona.cursor_del_pool import CursorDelPool
#from logger_base import log


class PersonaDAO:
    """
    DAO significa: Data Access Object
    CRUD:
        -Create: Insertar,
        -Read: Seleccionar,
        -Update: Actualizar,
        -Delete: Eliminar.
    """
    new = new_var = _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_persona'
    print(new)
    print(new_var)
    print(_SELECCIONAR)
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES(%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

#Definimos los metodos de clase
    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            personas = [] #Creamos una lista
            for registro in registros:
                persona = Persona(registro[0], registro[1], registro[2],registro[3])
                personas.append(persona)
            return personas

    @classmethod
    def insertar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._INSERTAR, valores)
            log.debug(f'Persona Insertada: {persona}')
            return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
            cursor.execute(cls._ACTUALIZAR, valores)
            log.debug(f'Persona actualizada: {persona}')
            return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.id_persona,)
            cursor.execute(cls._ELIMINAR, valores)
            log.debug(f'Los valores eliminados son: {persona}')
            return cursor.rowcount



    

