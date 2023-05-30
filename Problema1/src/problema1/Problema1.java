package problema1;

import javax.swing.JOptionPane;
import pclases.Operaciones;

public class Problema1 {

    public static void main(String[] args) {
        Operaciones ops = new Operaciones();
        
        
        // Explicación del como funcionan los constructores.
        String explanation = "En este ejercicio se crea un objeto de tipo Operaciones. \n"
                + "Al crearse el objeto por medio de su constructor, Este crea una instancia  \n"
                + "de la Clase Numeros, con el objeto creado, se ejecutan los metodos para \n"
                + "ingresar los atributos de la instancia como para mostrar la suma de los  \n"
                + "mismos. Previo a esto se muestra el mensaje de bienvenida, este es mostrado \n"
                + "a través del constructor de la Clase Algebra, el cual se ejecuta debido \n"
                + "a que el constructor de Numeros crea un objeto de tipo Algebra el cual muestra \n"
                + "el mensaje desde su constructor.";
        
        JOptionPane.showMessageDialog(null, explanation);
    }
    
}
