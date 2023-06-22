
package paquete1;


public class Clase1 {
      public String atributoPublic = "Valor de atributo Public";
      protected String atributoProtected = "Valor del atributo protected";
      public Clase1(){
          System.out.println("Constructor publico");
      }
      
      protected Clase1(String atributoPublic){
          System.out.println("Constructor protected");
      }
      
      public void metodoPublico(){
          System.out.println("Metodo publico");
          
      }
      
      protected void metodoProtected(){
          System.out.println("Metodo protected");
      }
}
