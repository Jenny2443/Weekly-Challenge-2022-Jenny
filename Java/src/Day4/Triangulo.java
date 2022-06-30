package Day4;
// Clase triangulo q hereda de poligono con su función area q hace overwrite
public class Triangulo extends Poligono{
    private int base;
    private int altura;
    public Triangulo(int base, int altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return (base * altura) / 2;
    }
}
