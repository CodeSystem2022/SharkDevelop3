
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //bloque de inicializacion estatico
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona; //solo podemos usar atributos estaticos en este bloque
    }
    
    { //bloque de inicializacion no estatico (contexto dinamico)
        System.out.println("Ejecucion del bloque NO estatico");
        this.idPersona = Persona.contadorPersona++; //incrementamos el atributo
        
    }
    

//los bloques de inicializacion se ejecutan antes del constructor     
    public Persona(){
        System.out.println("Ejecucion del constructor");
    } 

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}

  