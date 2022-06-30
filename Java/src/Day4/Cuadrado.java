package Day4;
// Clase cuadrado q hereda de poligono con su función area q hace overwrite
public class Cuadrado extends Poligono{
    private int lado;

    public Cuadrado(int lado){
        super();
        this.lado = lado;
    }

    public double area(){
        return lado * lado;
    }
}
