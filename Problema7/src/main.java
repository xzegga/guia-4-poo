
import pclases.Empleado;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        // Crear instancias de la clase Empleado
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();

        // Solicitar valores de los atributos al usuario para el empleado 1
        JOptionPane.showMessageDialog(null, "Ingrese los datos del primer empleado");
        empleado1.setCodigo(JOptionPane.showInputDialog("Ingrese el código:"));
        empleado1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
        empleado1.setApellido(JOptionPane.showInputDialog("Ingrese el apellido:"));
        empleado1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:")));

        // Solicitar valores de los atributos al usuario para el empleado 2
        JOptionPane.showMessageDialog(null, "Ingrese los datos del segundo empleado");
        empleado2.setCodigo(JOptionPane.showInputDialog("Ingrese el código:"));
        empleado2.setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
        empleado2.setApellido(JOptionPane.showInputDialog("Ingrese el apellido:"));
        empleado2.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario:")));

        // Mostrar información de los empleados
        empleado1.mostrar();
        empleado2.mostrar();
    }
}
