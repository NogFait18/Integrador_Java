package EjerciciosJava.EjercicioIntegrador;

public class Provincia {
    private String nombre;
    Pais pais;

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Provincia: " +
                nombre+"\n"+pais;
    }
}
