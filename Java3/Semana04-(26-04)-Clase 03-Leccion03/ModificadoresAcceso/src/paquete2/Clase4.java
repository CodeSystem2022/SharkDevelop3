
package paquete2;

public class Clase4 {
    private String atributoPrivado = "AtributoPrivado";
    
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    //creamos un constructor public para poder crear objetos
    public Clase4(String argumento){ //aquui se puede llamar al constructor vacio
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }

    @Override
    public String toString() {
        return "Clase4{" + "atributoPrivado=" + atributoPrivado + '}';
    }
    
    
}
