package s08poo;

public class Rombo implements Figura {
    private float lado, diagonalE, diagonalI;

    public Rombo(float lado, float diagonalE, float diagonalI) {
        this.lado = lado;
        this.diagonalE = diagonalE;
        this.diagonalI = diagonalI;
    }

    @Override
    public float area() {
        return (diagonalI * diagonalE)/2;
    }

    @Override
    public float perimetro() {
        return lado+lado+lado+lado;
    }
    
}
