import pclases.Paises;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        // Capturar los valores de las variables desde teclado
        String pais = JOptionPane.showInputDialog("Ingrese el nombre del país:");
        String moneda = JOptionPane.showInputDialog("Ingrese el nombre de la moneda:");

        // Crear un objeto utilizando el constructor personalizado
        Paises miPais = new Paises(pais, moneda);

        // Obtener y mostrar el mensaje de la moneda
        String mensajeMoneda = miPais.obtenerMensajeMoneda();
        JOptionPane.showMessageDialog(null, mensajeMoneda);
    }
    
}
