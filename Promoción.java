package EjerciciosJava.EjercicioIntegrador;
import java.time.LocalDate;


public class Promoción {
    private String denominacion;
    private LocalDate FechaDesde;
    private LocalDate FechaHasta;
    private LocalDate HoraDesde;
    private LocalDate HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;

    public Promoción(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalDate horaDesde, LocalDate horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        FechaDesde = fechaDesde;
        FechaHasta = fechaHasta;
        HoraDesde = horaDesde;
        HoraHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }
}


