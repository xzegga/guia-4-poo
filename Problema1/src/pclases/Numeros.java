package pclases;

public class Numeros {
    private int num1, num2;
    
    public Numeros() {
        Algebra alg = new Algebra();        
    }
    
    public void captura(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }    
    
    public String sumar(){
    
        int suma = this.num1 + this.num2;        
        return "La suma es: " + suma;
    }
    
    
}
