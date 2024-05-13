package s08poo;

public class Cono implements FiguraEspacio{
    private float altura, radio, alturaInclinada; 

    public Cono(float altura, float radio, float alturaInclinada) {
        this.altura = altura;
        this.radio = radio;
        this.alturaInclinada = alturaInclinada;
    }
    
    @Override
    public float volumen() {
        return(PI*radio*radio*altura)/3;
    }

    @Override
    public float area() {
        return PI*radio*(radio*alturaInclinada);
    }

    @Override
    public float perimetro() {
        return 0;
    }
    
}
