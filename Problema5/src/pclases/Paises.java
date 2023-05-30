package pclases;

import javax.swing.JOptionPane;

public class Paises {
    private String pais;
    private String moneda;

    // Constructor por omisión
    public Paises() {
        JOptionPane.showMessageDialog(null, "Países del mundo");        
    }

    // Constructor personalizado
    public Paises(String pais, String moneda) {
        this();
        this.pais = pais;
        this.moneda = moneda;        
    }

    // Método para obtener el mensaje de la moneda
    public String obtenerMensajeMoneda() {
        return "La moneda de curso legal de " + pais + " es " + moneda;
    }
}

