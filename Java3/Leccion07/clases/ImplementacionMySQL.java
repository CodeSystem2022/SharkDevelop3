/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import interfaces.IAccesoDB;

/**
 *
 * @author Lucas
 */
public class ImplementacionMySQL implements IAccesoDB{
    
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
