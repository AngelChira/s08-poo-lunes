package s08poo;

public class Cubo implements FiguraEspacio{
    float arista;

    public Cubo(float arista) {
        this.arista = arista;
    }
    
    @Override
    public float volumen() {
        return (float) Math.pow(arista, 3);
    }

    @Override
    public float area() {
        return 6*arista*arista;
    }

    @Override
    public float perimetro() {
        return 12*arista;
    }
    
}
