package CLASE;

public class Empleado {
    // ATRIBUTOS
    private double sueldo_bruto;

    // MÉTODOS
    public void mostrar() {
        System.out.println("Sueldo bruto: " + sueldo_bruto);
    }

    public double calcular_salario_neto() {
        // Lógica para calcular el salario neto, por ejemplo, deducciones y retenciones
        // Supongamos que se aplica una retención del 10%
        double retencion = sueldo_bruto * 0.1;
        double salario_neto = sueldo_bruto - retencion;
        return salario_neto;
    }

    // GETTERS Y SETTERS
    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }
}
