
package test;

import interfaces.*;
import clases.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDB datos = new ImplementacionOracle();
        //datos.listar();
        datos = new ImplementacionMySQL();
        imprimir(datos);
    }
    public static void imprimir(IAccesoDB data){
        data.listar();
    }
}
