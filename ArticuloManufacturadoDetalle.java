package EjerciciosJava.EjercicioIntegrador;

import java.util.ArrayList;

public class ArticuloManufacturadoDetalle extends Articulo {
    Integer cantidad;
    ArrayList<ArticuloManufacturado>articuloManufacturados;

    public ArticuloManufacturadoDetalle(String denominacion, Double precioVenta, Integer cantidad, ArrayList<ArticuloManufacturado> articuloManufacturados) {
        super(denominacion, precioVenta);
        this.cantidad = cantidad;
        this.articuloManufacturados = articuloManufacturados;
    }
}
