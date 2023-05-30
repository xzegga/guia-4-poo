package principal;

import javax.swing.JOptionPane;
import pclases.Operaciones;

public class Main {

    public static void main(String[] args) {
        String cadena1 = JOptionPane.showInputDialog("Ingrese la primera cadena:");
        String cadena2 = JOptionPane.showInputDialog("Ingrese la segunda cadena:");

        String resultadoConcatenacion = Operaciones.concatenarCadenas(cadena1, cadena2);
        JOptionPane.showMessageDialog(null, "La concatenación de las cadenas es: " + resultadoConcatenacion);

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número:"));

        double resultadoOperaciones = Operaciones.operarNumeros(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de las operaciones es: " + resultadoOperaciones);
    }
}
