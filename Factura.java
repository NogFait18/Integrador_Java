package EjerciciosJava.EjercicioIntegrador;

import java.time.LocalDate;

public class Factura {
    private LocalDate fechaFacturacion;
    private  Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPrefenceId;
    private FormaPago formaPago;
    Double totalVenta;

    public Factura(LocalDate fechaFacturacion, Integer mpPaymentId, Integer mpMerchantOrderId, String mpPrefenceId, FormaPago formaPago, Double totalVenta) {
        this.fechaFacturacion = fechaFacturacion;
        this.mpPaymentId = mpPaymentId;
        this.mpMerchantOrderId = mpMerchantOrderId;
        this.mpPrefenceId = mpPrefenceId;
        this.formaPago = formaPago;
        this.totalVenta = totalVenta;
    }
}
