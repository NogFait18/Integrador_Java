package EjerciciosJava.EjercicioIntegrador;

public class Localidad {
    private String nombre;
    Provincia provincia;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "nombre: '" + nombre+
                "\n"+provincia;
    }
}
