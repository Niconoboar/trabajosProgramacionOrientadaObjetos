package CUADRADO;

public class Triangulo {

    private int lado = 0;

    public Triangulo() {
        this.lado = 5;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Triangulo(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }

    public double calcularArea() {
        double area= (Math.cbrt(3)/4)*Math.pow(this.lado, 2);
        return area;


    }

    public int calcularPerimetro() {

        return (this.lado * 3);
    }


}
