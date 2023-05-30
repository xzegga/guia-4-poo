
import javax.swing.JOptionPane;
import pclases.Vendedor;

public class main {

    public static void main(String[] args) {

        // Creamos un objeto vendedor1 utilizando el constructor por omisión
        Vendedor vendedor1 = new Vendedor();
        vendedor1.capturar(); // Capturamos los datos del vendedor1
        vendedor1.mostrarInfo(); // Mostramos la información del vendedor1

        // Creamos un objeto vendedor2 utilizando el constructor personalizado
        Vendedor vendedor2 = new Vendedor(
                JOptionPane.showInputDialog("Ingrese el código del vendedor:"),
                JOptionPane.showInputDialog("Ingrese el nombre del vendedor:"),
                JOptionPane.showInputDialog("Ingrese el apellido del vendedor:"),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del vendedor:")),
                Double.parseDouble(JOptionPane.showInputDialog("Total de ventas vendedor:"))
        );

        vendedor2.mostrarInfo(); // Mostramos la información del vendedor2
    }
}
