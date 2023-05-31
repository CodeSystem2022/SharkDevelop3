
package interfaces;


public interface IAccesoDB {
    int MAX_REGISTROS = 10; // Las variables en las interfaces son siempre estáticas y finales, y hay que asignarles el valor en el momento de crearlas
    void listar();
    void insertar();
    void eliminar();
    void actualizar();
}
