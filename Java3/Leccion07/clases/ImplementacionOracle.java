
package clases;

import interfaces.IAccesoDB;

public class ImplementacionOracle implements IAccesoDB{

    @Override
    public void listar() {
        System.out.println("listar");
    }

    @Override
    public void insertar() {
        System.out.println("insertar");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar");
    }
    
}
