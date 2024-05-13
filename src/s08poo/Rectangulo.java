package s08poo;

public class Rectangulo implements Figura {
    private float a, b;

    public Rectangulo(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float area() {
        return a*b;
    }

    @Override
    public float perimetro() {
        return 2*a+2*b;
    }
    
}
