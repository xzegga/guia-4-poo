package pclases;

import javax.swing.JOptionPane;

public class Operaciones {

    public Operaciones() {
        Numeros nms = new Numeros();
                
        nms.captura(
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número")), 
                Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"))
        );
        
        JOptionPane.showMessageDialog(null, nms.sumar());
    }
    
}
