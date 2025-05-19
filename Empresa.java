package EjerciciosJava.EjercicioIntegrador;
public class Empresa {
    private String nombre;
    private String razonSocial;
    private Integer cuil;


    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return  this.nombre+ "\nRazon social: "+this.razonSocial+"\nCuil: "+this.cuil;
    }
}
