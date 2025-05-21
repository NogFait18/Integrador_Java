package EjerciciosJava.EjercicioIntegrador;

public class UnidadMedida extends Articulo {
    private String denominacion;

    public UnidadMedida(String denominacion, Double precioVenta, String denominacion1) {
        super(denominacion, precioVenta);
        this.denominacion = denominacion1;
    }
}
