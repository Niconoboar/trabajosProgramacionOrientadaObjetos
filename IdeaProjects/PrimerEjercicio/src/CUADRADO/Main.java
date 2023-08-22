package CUADRADO;

import CUADRADO.Cuadrado;

public class Main {
    public static void main(String[] args) {
        Cuadrado cua1 = new Cuadrado();
        cua1.setLado(6);

        System.out.println("El Area del cuadrado es: " + cua1.calcularArea() );
        System.out.println("El Perimetro del cuadrado es: " + cua1.calcularPerimetro() );
    }
}
