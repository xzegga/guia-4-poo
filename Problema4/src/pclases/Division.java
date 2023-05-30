package pclases;

import javax.swing.JOptionPane;

public class Division {

    private double numero1;
    private double numero2;

    public Division() {
        JOptionPane.showMessageDialog(null, "Dividiendo dos números");
    }

    public void dividir(double numero1, double numero2) {

        if (numero2 != 0) {
            double resultado = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "Resultado de dividir "
                    + numero1 + " entre " + numero2 + " es: " + resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Error: División entre cero no permitida");
        }
    }
}
