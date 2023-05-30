package pclases;

import javax.swing.JOptionPane;

public class Automovil {
    // Atributos de la clase Automovil
    private String marca;
    private String modelo;
    private String color;
    private String estado;
    private double velocidad;

    // Métodos de acceso para los atributos
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getEstado() {
        return estado;
    }

    public double getVelocidad() {
        return velocidad;
    }

    // Constructor por omisión
    public Automovil() {
        JOptionPane.showMessageDialog(null, "Ingrese los datos del automóvil");
    }
    
    // Constructor personalizado que asigna valores a los atributos
    public Automovil(String marca, String modelo, String color, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.estado = estado;
        this.velocidad = 0;
        
        JOptionPane.showMessageDialog(null, "Ingrese los datos del automóvil");
    }
    
    // Constructor personalizado que asigna valores a los atributos
    public Automovil(String marca, String modelo, String color, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    // Método para encender el automóvil
    public void encender() {
        estado = "Encendido";
    }

    // Método para apagar el automóvil y reiniciar la velocidad a 0
    public void apagar() {
        estado = "Apagado";
        velocidad = 0.0;
    }

    // Método para acelerar el automóvil en una unidad
    public void acelerar() {
        velocidad++;
    }

    // Método para acelerar el automóvil con un incremento específico
    public void acelerar(double incremento) {
        velocidad += incremento;
    }
}
