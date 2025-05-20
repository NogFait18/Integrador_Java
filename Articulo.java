package EjerciciosJava.EjercicioIntegrador;
import java.util.ArrayList;
import java.util.List;

public class Articulo {
    protected String denominacion;
    protected Double precioVenta;
    private List<Imagen> imagenes = new ArrayList<>();

    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }
}
