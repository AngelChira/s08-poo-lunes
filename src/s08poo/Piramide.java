package s08poo;

public class Piramide implements FiguraEspacio {
    private float altura, apotema, areaBase;

    @Override
    public float volumen() {
        return (areaBase*altura)/3;
    }

    @Override
    public float area() {
        return 0;
    }

    @Override
    public float perimetro() {
        return 0;    }
}
