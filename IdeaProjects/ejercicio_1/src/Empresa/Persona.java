package Empresa;

public class Persona {
    //atributos

    public String nombre = "persona";
    private int edad=25;
    //metodo
    public void mostrar(){
        System.out.printf(
                "nombre:"+ this.nombre + "\n" +
                "edad:"+ this.edad + "\n"

        );
    }
}

