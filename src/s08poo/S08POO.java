package s08poo;

import java.util.Scanner;

public class S08POO {

    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 10);
        Figura circulo = new Circulo(3);
        Figura triangulo = new Triangulo(3, 4, 5);
        Figura cubo = new Cubo(3);
        Figura cuadrado = new Cuadrado(5);
        mostrarResultados(cuadrado);
        mostrarResultados(rectangulo);
        mostrarResultados(triangulo);
        mostrarResultados(cubo);
        System.out.println("Calculo de figuras");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectangulo");
        System.out.println("3. Circulo");
        System.out.println("4. Cubo");
        System.out.println("Ingrese una opcion: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese ");
        switch (fg) {
            case 1, 4:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static void mostrarResultados(Figura figura) {
        System.out.println("Area "+ figura.area());
        System.out.println("Perimetro "+ figura.perimetro());
        if(figura instanceof FiguraEspacio) {
            System.out.println("Volumen: "+ ((FiguraEspacio) figura).volumen());
        }
    }
    
}
