package principal;

import javax.swing.JOptionPane;
import pclases.Operaciones;


public class Main {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        // ************* Multiplicación de 2 números enteros **************
        JOptionPane.showMessageDialog(null, "Multiplicación de 2 números enteros");
        
        int resultadoMultiplicarEnteros = operaciones.multiplicar(
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero:"))
        );
        
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación de los enteros es: " + resultadoMultiplicarEnteros);

        
        // ************* Multiplicación de 3 números Reales **************
        JOptionPane.showMessageDialog(null, "Multiplicación de 3 números reales");
        
        double resultadoMultiplicarReales = operaciones.multiplicar(
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número real:")),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número real:")),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número real:"))
        );

        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación de los reales es: " + resultadoMultiplicarReales);


        // ************* Suma de 2 números enteros **************
        JOptionPane.showMessageDialog(null, "Suma de 2 números enteros");
        int resultadoSumarEnteros = operaciones.sumar(
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número entero:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número entero:")),
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número entero:"))
        );

        JOptionPane.showMessageDialog(null, "El resultado de la suma de los enteros es: " + resultadoSumarEnteros);

        
        // ************* Suma de 3 números reales **************
        JOptionPane.showMessageDialog(null, " Suma de 3 números reales");
        
        double resultadoSumarReales = operaciones.sumar(
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número real:")),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número real:")),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer número real:"))
        );
        JOptionPane.showMessageDialog(null, "El resultado de la suma de los reales es: " + resultadoSumarReales);
    }
}
