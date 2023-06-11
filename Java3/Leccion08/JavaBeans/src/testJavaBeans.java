import domain.Persona;

public class testJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("juan");
        persona.setApellido("Cruz");
        System.out.println("persona = " + persona);

        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("persona.getApellido() = " + persona.getApellido());
        
    }



}
