
package pkginstanceof;

import pkginstanceof.TipoEscritura;
import Empresa.*;
        

public class InstanceOf {



    public static void main(String[] args) {
        
        Empleado empleado1  = new Empleado("Juan ", 10000);
        instance_of(empleado1);
        empleado1 = new Gerente("Jose ", 5000, "Sistemas");
        instance_of(empleado1);
            //DOWNCASTING
            //((Escritor)empleado).ObtenerDetalles();
            //UPCASTING
            //Escritor escritor = empleado;
            //escritor.getTipoEscritura();
    }


    public static void instance_of(Empleado empleado){
        if (empleado instanceof Gerente){
            Gerente gerente1 = (Gerente)empleado;
            System.out.println(((Gerente)empleado).seccion);
            System.out.println("Empleado es Gerente");
        }
        if (empleado instanceof Empleado){
            System.out.println("Empleado es empleado");
        }
    }

            
}
