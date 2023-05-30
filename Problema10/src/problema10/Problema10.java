package problema10;

import javax.swing.JOptionPane;
import pclases.Paises;

public class Problema10 {

    public static void main(String[] args) {
        Paises pais1 = new Paises();

        pais1.setPais(JOptionPane.showInputDialog("Escriba el nombre del país"));
        
        // Seteamos la moneda a través del setter del atributo estático.
        Paises.setMoneda(JOptionPane.showInputDialog("Escriba el nombre de la moneda"));

        JOptionPane.showMessageDialog(null, "En " + pais1.getPais() + " " + Paises.mensaje());

    }

}
