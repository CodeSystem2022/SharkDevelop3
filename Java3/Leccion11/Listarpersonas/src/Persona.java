public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numero_Personas=0;

    private Persona(){
        this.id = ++Persona.numero_Personas;
    }
    private Persona( String nombre, String tel, String email) {
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero_Personas() {
        return numero_Personas;
    }

    public void setNumero_Personas(int numero_Personas) {
        this.numero_Personas = numero_Personas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel=" + tel +
                ", email='" + email + '\''+
                '}';
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan Perez", "2345889900", "jperez@email.com");
        System.out.println("persona = " + persona);
    }
}