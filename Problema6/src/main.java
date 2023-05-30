
import javax.swing.JOptionPane;
import pclases.Automovil;

public class main {

    public static void main(String[] args) {
        // Crear un objeto utilizando el constructor por omisión
        Automovil auto1 = new Automovil();

        // Solicitar los datos del automóvil al usuario
        // Crear un automovil utilizando el constructor personalizado
        JOptionPane.showMessageDialog(null, "Ingrese los datos del segundo automóvil");
        Automovil auto2 = new Automovil(
                JOptionPane.showInputDialog("Ingrese la marca del automóvil:"),
                JOptionPane.showInputDialog("Ingrese el modelo del automóvil:"),
                JOptionPane.showInputDialog("Ingrese el color del automóvil:"),
                JOptionPane.showInputDialog("Ingrese el estado del vehículo:")
        );
       
        // Crear un objeto utilizando el constructor personalizado con parametros
        JOptionPane.showMessageDialog(null, "Ingrese los datos del tercer automóvil");
        Automovil auto3 = new Automovil(
                JOptionPane.showInputDialog("Ingrese la marca del automóvil:"),
                JOptionPane.showInputDialog("Ingrese el modelo del automóvil:"),
                JOptionPane.showInputDialog("Ingrese el color del automóvil:"),
                Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad del automóvil:"))
        );

        // Realizar operaciones con el automóvil
        auto3.encender();
        auto3.acelerar();
        auto3.acelerar(10.5);
        auto3.apagar();

        // Mostrar el estado final del automóvil
        JOptionPane.showMessageDialog(null, "Estado del automóvil:\n"
                + "Marca: " + auto3.getMarca() + "\n"
                + "Modelo: " + auto3.getModelo() + "\n"
                + "Color: " + auto3.getColor() + "\n"
                + "Estado: " + auto3.getEstado() + "\n"
                + "Velocidad: " + auto3.getVelocidad());
    }
}
