package problema2;

import javax.swing.JOptionPane;
import pclases.Bailarin;

public class Problema2 {

    public static void main(String[] args) {

        Bailarin bln1 = new Bailarin(
                JOptionPane.showInputDialog("Ingrese el tipo de baile"),
                JOptionPane.showInputDialog("Ingrese el nombre del bailarín")
        );

        bln1.bailar();

        // Cambiar valores de los atributos de la clase por medio del método captura
        bln1.captura(
                JOptionPane.showInputDialog("Ingrese el tipo de baile"),
                JOptionPane.showInputDialog("Ingrese el nombre del bailarín")
        );
        
        bln1.bailar();
    }

}
