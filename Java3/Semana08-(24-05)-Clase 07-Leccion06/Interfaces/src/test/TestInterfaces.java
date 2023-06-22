
package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMySql(); //no se puede instanciar desde la interrace sino
        //desde la clase que implementa la interface
        //datos.listar();
        imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(AccesoDatos datos){
        datos.listar();
    }
 
}
