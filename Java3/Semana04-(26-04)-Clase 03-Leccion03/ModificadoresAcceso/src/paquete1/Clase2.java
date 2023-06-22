
package paquete1;

 class Clase2 extends Clase1{
    String atributoDefault = "Vlor del atributo default";
    
   // Clase2(){
     //   System.out.println("Constructor Default");
    //}
    public Clase2(){
        super();
        this.atributoDefault = "MOdificado";
        System.out.println("atributodefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    void metodoDefault(){
        System.out.println("Metodo default");
    }
}
