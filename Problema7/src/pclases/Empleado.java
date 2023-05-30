package pclases;

import javax.swing.JOptionPane;

public class Empleado {

    private String codigo; // Código del empleado
    private String nombre; // Nombre del empleado
    private String apellido; // Apellido del empleado
    private double salario; // Salario del empleado

    public void setCodigo(String codigo) {
        this.codigo = codigo; // Establecer el código del empleado
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Establecer el nombre del empleado
    }

    public void setApellido(String apellido) {
        this.apellido = apellido; // Establecer el apellido del empleado
    }

    public void setSalario(double salario) {
        this.salario = salario; // Establecer el salario del empleado
    }

    public double descIsss() {
        if (salario >= 0.01 && salario <= 685.71) {
            return salario * 0.03; // Calcular el descuento del ISSS (3% del salario) si el salario está en el rango adecuado
        } else {
            return 20.57; // Descuento constante del ISSS si el salario supera el límite establecido
        }
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null, "Código: " + codigo
                + "\nNombre: " + nombre
                + "\nApellido: " + apellido
                + "\nSalario: $" + salario
                + "\nDescuento ISSS: $" + descIsss()); // Mostrar información del empleado y el descuento del ISSS
    }
}
