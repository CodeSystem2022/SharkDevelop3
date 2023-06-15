import logging as log
import sys
import mysql.connector as bd

log.basicConfig(level = log.DEBUG,
                format='%(asctime)s:%(levelname)s [%(filename)s:%(lineno)s] %(meesage)s',
                datefmt='%I:%M:%S%p',
                handlers=[
                    log.FileHandler('capa_datos.log'),
                    log.StreamHandler()
                ])





class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'root'
    _PASSWORD = 'Todo1ev@'
    _DB_PORT = '3306'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
    
        try:
            cls._conexion = bd.connect(host=cls._HOST,
                                        user=cls._USERNAME,
                                        password=cls._PASSWORD,
                                        port=cls._DB_PORT,
                                        database=cls._DATABASE)
            log.debug('Conexión exitosa: {cls._conexion}')
            return cls._conexion
        except Exception as e:
            log.error(f'Ocurrió un error {e}')
            sys.exit()


    @classmethod
    def obtenerCursor(cls):
        
        try:
            cls._cursor= cls._conexion.cursor(dictionary=True)
            log.debug(f'Se abrió correctamente el cursor: {cls._cursor}')
            return cls._cursor
        except Exception as e:
            log.error(f'Ocurrió un error {e}')
            sys.exit()
        
        


class Persona:

    id_Persona = 0

    def __init__(self, nombre, apellido, email):
        Persona.id_Persona+=1
        self._id_persona = Persona.id_Persona
        self._nombre = nombre
        self._apellido = apellido
        self._email = email

    def __str__(self):
        return f'''
        Id Persona: {self._id_persona},
        Nombre:     {self._nombre},
        Apellido:   {self._apellido},
        Email:      {self._email}
        '''
    
    # Getter and Setters
    @property
    def idpersona(self):
        return self._id_persona

    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def id_persona(self, nombre):
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido
    
    @property
    def email(self):
        return self._email
    
    @email.setter
    def email(self, email):
        self._email = email



class PersonaDAO:
    """
    DAO significa: Data Acces Object
    CRUD:
        -Create: Insertar,
        -Read: Seleccionar,
        -Update: Actualizar,
        -Delete: Eliminar.
    """
    _SELECCIONAR = "SELECT * FROM persona ORDER BY idpersona"
    _INSERTAR = "INSERT INTO persona(idpersona, nombre, apellido, email) VALUES(%s, %s, %s, %s)"
    _ACTUALIZAR = "UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE idpersona=%s"
    _ELIMINAR = "DELETE FROM persona WHERE idpersona=%s" #Sin hacer

#Definimos los metodos de clase
    @classmethod
    def seleccionar(cls):
        try:
            with Conexion.obtenerConexion() :
                with Conexion.obtenerCursor() as cursor:
                    cursor.execute(cls._SELECCIONAR)
                    return cursor.fetchall()
                
        except Exception as e:
            print(f'Ocurrio un error: {e}')
            
    @classmethod
    def actualizar(cls, id_persona, nombre, apellido, email):
        try:
            with Conexion.obtenerConexion() as conexion:
                with Conexion.obtenerCursor() as cursor:
                    valores = (nombre, apellido, email, id_persona)
                    cursor.execute(cls._ACTUALIZAR, valores, True)
                    conexion.commit()
                    log.debug(f'Persona actualizada: {nombre}')
                    
                    return cursor.close()
                
        except Exception as e:
            print(f'Ocurrio un error: {e}')



    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion() as conexion:
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.idpersona, persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                conexion.commit()
                log.debug(f'Persona Insertada: {persona}')
                
                return cursor.rowcount
            




if __name__ == '__main__':
    persona2 = Persona(nombre='Roxana', apellido='Romero', email='romer1@mail.com')
    personas_insertadas = PersonaDAO.insertar(persona2)
    
    # Insertar un registro
    '''
    persona1 = Persona('Juan Jose', 'Pena', 'jjpena@email.com')
    
    
    log.debug(f'Personas insertadas: {personas_insertadas}')

    # Actualizar un registro
    
    personas_actualizadas = PersonaDAO.actualizar(persona1.id_Persona, nombre='Perseo',apellido='Crustaceo',email='mimaligriego@persico.com')
    log.debug(f'Personas actualizadas: {personas_actualizadas}')

   
    # Seleccionar objetos
    lista_diccionarios = PersonaDAO.seleccionar()
    print(lista_diccionarios)
    registros=[]
    for i in range(len(lista_diccionarios)):
        registros.append((lista_diccionarios[i]["idpersona"],lista_diccionarios[i]['nombre'],lista_diccionarios[i]['apellido'],lista_diccionarios[i]['email']))
        log.debug(registros[i])
    
    '''
