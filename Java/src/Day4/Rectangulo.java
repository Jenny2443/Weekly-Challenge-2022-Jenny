package Day4;
// Clase rectangulo q hereda de poligono con su función area q hace overwrite
public class Rectangulo extends Poligono{
    private int base;
    private int altura;

    public Rectangulo(int base,int altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return base * altura;
    }
}
