//una variable del tipo de la clase padre puede almacenar
//referencias de objeto de la clase hija
package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestClaseObject {
    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("juan", 5000);
       Empleado empleado2 = new Empleado("Juan", 5000);

       if (empleado1 == empleado2){
           System.out.println("Tienen la misma referencia en memoria");
       }
       else{
           System.out.println("Tienen distinta referencia en memoria");
       }

       if(empleado1.equals(empleado2)){
           System.out.println("Los objetos son iguales en contenido");
       }
       else{
           System.out.println("Los objetos son distintos en contenido");
       }

       if(empleado1.hashCode() == empleado2.hashCode()){
           System.out.println("El valor de hash code es igual");
       }
       else{
           System.out.println("El valor de hahsCode es diferente");
       }


    }
}
