package test;


import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class testCoversionObjetos {
    public static void main(String[] args) {
        Empleado empleado = new Escritor("Juan", 2000, TipoEscritura.CLASICO );
        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());

    }
}
