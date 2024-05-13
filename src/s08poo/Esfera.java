package s08poo;

public class Esfera implements FiguraEspacio{
    private float radio;

    public Esfera(float radio) {
        this.radio = radio;
    }

    @Override
    public float volumen() {
        return (4/3)*PI*radio*radio*radio;
    }

    @Override
    public float area() {
        return 4*PI*radio*radio;
    }

    @Override
    public float perimetro() {
        return 0;
    }
    
}
