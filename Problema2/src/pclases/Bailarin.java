package pclases;

import javax.swing.JOptionPane;


public class Bailarin {
    String tipoBaile, nombreBailarin;

    public Bailarin(String tipoBaile, String nombreBailarin) {
        this.tipoBaile = tipoBaile;
        this.nombreBailarin = nombreBailarin;
    }
        
    public void bailar(){
        JOptionPane.showMessageDialog(null, 
                "El bailarín " + this.nombreBailarin + " baila " + this.tipoBaile);
    }
    
    public void captura(String tipoBaile, String nombreBailarin) {
        this.tipoBaile = tipoBaile;
        this.nombreBailarin = nombreBailarin;
    }    
}
