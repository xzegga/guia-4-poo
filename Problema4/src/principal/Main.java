package principal;

import pclases.Division;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        
        while (continuar) {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número: "));
            
            Division division = new Division();
            division.dividir(num1, num2);
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra división?", "Continuar", JOptionPane.YES_NO_OPTION);
            
            if (opcion == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        }
    }
}
