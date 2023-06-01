package test;


import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan", 2000);
        Empleado empleado2 = new Empleado("Juan", 5000);

        if (empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else {
            System.out.println("No tienen la misma referencia en memoria");
        }

        if (empleado1.equals(empleado2)){
            System.out.println("Los obj son iguales en contenido");
        }else {
            System.out.println("Los obj no son iguales en contenido");
        }

        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("el valor en hashcode es igual");
        }else {
            System.out.println("el valor en hashcode no es igual");
        }
    }
}
