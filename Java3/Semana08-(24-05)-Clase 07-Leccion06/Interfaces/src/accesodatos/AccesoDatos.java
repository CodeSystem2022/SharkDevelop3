
package accesodatos;

public interface AccesoDatos {
   int MAX_REGISTRO = 10; //ES PUBLIC FINAL Y STATIC 
//hay que asignar un valor si o si pq una interface no tiene constructores, solo metodos abstractos
//cualquier metodo va a ser publico y abstracto, sin cuerpo
   
void insertar();
void listar();
void actualizar();
void eliminar();

   
   
}
