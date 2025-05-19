package EjerciciosJava.EjercicioIntegrador;

public class main{
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("Chirino SA","OSEP",2046849);
        Pais pais1 = new Pais("Argentina");
        Provincia prov1 = new Provincia("Mendoza",pais1);
        Localidad loc1 = new Localidad("QSYO",prov1);
        Domiciolio dom1 = new Domiciolio(2001,"Adolfo Calle",12,loc1);
        Sucursal suc1 = new Sucursal("Pepitos SA",emp1,dom1);

        System.out.println(suc1);
    }

}

