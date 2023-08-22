package CUADRADO;

 public class Cuadrado {
    private int lado = 0;

    public Cuadrado() {
        this.lado = 5;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return this.lado;
    }

    public double calcularArea() {
        return Math.pow(this.lado, 2);

    }

    public int calcularPerimetro() {

        return (this.lado * 4);
    }
}
