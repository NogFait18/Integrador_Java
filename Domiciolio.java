package EjerciciosJava.EjercicioIntegrador;

public class Domiciolio {
    private String calle;
    private int numero;
    private int cp;
    Localidad localidad;

    public Domiciolio(int cp, String calle, int numero, Localidad localidad) {
        this.cp = cp;
        this.calle = calle;
        this.numero = numero;
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return calle + '\'' +
                ", numero: " + numero +
                ", cp: " + cp+
                "\nLocalidad: "+localidad;
    }
}
