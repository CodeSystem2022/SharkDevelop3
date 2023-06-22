package domain;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "tipo escritura: " + this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor {" + " tipo escritura" + tipoEscritura + "}" + super.toString();
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
