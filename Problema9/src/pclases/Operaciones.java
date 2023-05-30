package pclases;

public class Operaciones {

    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    public static double operarNumeros(double num1, double num2) {
        if (num2 < 0) {
            return num1 * num2;
        } else if (num1 > num2) {
            return num1 - num2;
        } else if (num2 > num1) {
            return num1 / num2;
        } else {
            return num1 + num2;
        }
    }
}
