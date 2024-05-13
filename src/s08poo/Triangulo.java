package s08poo;

public class Triangulo implements Figura {
    private float lado1, lado2, lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    @Override
    public float area() {
        float s = (lado1 + lado2 + lado3)/2;
        return (float) Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    
    public float area(float lado1, float lado2, float lado3) {
        float s = (lado1 + lado2 + lado3)/2;
        return (float) Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }
    
    @Override
    public float perimetro() {
     return +lado1 + lado2 + lado3;   
    }
}
