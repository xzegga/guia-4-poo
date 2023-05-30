package pclases;

import javax.swing.JOptionPane;

public class Vendedor {

    private String codigo; // Código del vendedor
    private String nombre; // Nombre del vendedor
    private String apellido; // Apellido del vendedor
    private double sueldoBase; // Salario base del vendedor
    private double ventas; // Total de ventas realizadas por el vendedor
    private double porcentaje; // Porcentaje de comisión

    public Vendedor() {        
        JOptionPane.showMessageDialog(null, "Capturando datos del vendedor");
    }

    public Vendedor(String codigo, String nombre, String apellido, double sueldoBase,  double ventas) {
        JOptionPane.showMessageDialog(null, "Información del vendedor");
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
        this.ventas = ventas;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido; // Retorna el nombre completo del vendedor
    }

    public void mostrarInfo() {
        
        double comision = 0.0;
        if (this.porcentaje != 0.0) {
            comision = comision(this.porcentaje);            
        } else {
            comision = comision();
        }
        
        // Calcula la comisión
        JOptionPane.showMessageDialog(null, "Código: " + codigo
                + "\nNombre: " + nombreCompleto()
                + "\nSalario base: $" + sueldoBase
                + "\nVentas realizadas: $" + ventas
                + "\nComisión por ventas: $" + comision); // Muestra la información del vendedor usando una ventana emergente
    }

    public void capturar() {
        codigo = JOptionPane.showInputDialog("Ingrese el código del vendedor:"); // Captura el código del vendedor desde una ventana emergente
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor:"); // Captura el nombre del vendedor desde una ventana emergente
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del vendedor:"); // Captura el apellido del vendedor desde una ventana emergente
        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario base del vendedor:")); // Captura el salario base del vendedor desde una ventana emergente
        ventas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de las ventas del vendedor:")); // Captura el valor de las ventas del vendedor desde una ventana emergente
        porcentaje = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de comisión:")); // Captura el porcentaje de comisión desde una ventana emergente
    }

    public double comision() {
        return ventas * 0.25; // Calcula la comisión utilizando el porcentaje establecido
    }

    public double comision(double porcentaje) {
        return ventas * (porcentaje / 100); // Calcula la comisión utilizando el porcentaje proporcionado
    }
}
