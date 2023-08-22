package Empresa;

public class Empleado {
    private double sueldoBruto= 450.35;
    public void mostrar(){
        System.out.printf("El sueldo bruto es: "+this.sueldoBruto +"");
    }
    public double calSalario(){
        double descuento = this.sueldoBruto * 0.10;
        descuento = this.sueldoBruto - descuento;
        return descuento;
    }
}
