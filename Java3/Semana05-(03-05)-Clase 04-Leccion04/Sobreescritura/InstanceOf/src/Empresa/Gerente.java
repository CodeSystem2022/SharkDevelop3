
package Empresa;

public class Gerente extends Empleado {
    //public String nombre;
    //public int numero;
    public String seccion;
    
    
    public Gerente(String nombre, int numero, String seccion) {
       super(nombre,numero); //super siempre va primero
       this.seccion = seccion;
        
    }
}
