package pclases;

public class Paises {

    private String pais;
    private static String moneda;

    public static String getMoneda() {
        return moneda;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static void setMoneda(String aMoneda) {
        moneda = aMoneda;
    }

    public static String mensaje() {
        return ("la moneda de curso legal es el " + moneda);
    }

}
