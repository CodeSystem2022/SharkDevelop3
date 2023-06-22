
package paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDefault = "Modificamos desde la hija";
        System.out.println("atributoDefault = " + this.atributoDefault);
        this.metodoDefault();
        
        
    }
}
