package EjerciciosJava.EjercicioIntegrador;
import java.time.LocalTime;

public class Sucursal {
    String nombre;
    LocalTime horarioApertura;
    LocalTime horarioCierre;
    Empresa empresa;
    Domiciolio domiciolio;

    public Sucursal(String nombre, Empresa empresa,Domiciolio domiciolio) {
        this.nombre = nombre;
        this.horarioApertura = LocalTime.of(8,30);
        this.horarioCierre = LocalTime.of(16,00);
        this.empresa = empresa;
        this.domiciolio = domiciolio;
    }

    @Override
    public String toString() {
        return "Sucursal: " +
                "nombre: '" + nombre + '\'' +
                ", horarioApertura: " + horarioApertura +
                ", horarioCierre: " + horarioCierre +
                "\nEmpresa: " + empresa+
                "\nDomicilio: "+domiciolio;
    }
}
