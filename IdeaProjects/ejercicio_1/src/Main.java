import Empresa.Empleado;
import Empresa.Persona;
import perro.Perro;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//abstraccion
        System.out.println("hola POO");

        //CREAR OBJETOS
        Perro perro1 = new Perro();
        perro1.nombre = "tisa";
        perro1.edad =3;
        perro1.raza = "chiquito";
        perro1.miPerro();

        Perro perro2 = new Perro();
        perro2.nombre = "alicia";
        perro2.edad =4;
        perro2.raza = "flaquita";
      //  perro2.miPerro();

        Perro perro3 = new Perro();
        perro3.nombre = "GINA";
        perro3.edad =15;
        perro3.raza = "GATO";
        //System.out.println(perro3.getNombre());

        Persona Nicolas = new Persona();
        Nicolas.nombre = "Nico";
        Nicolas.mostrar();


        Empleado emp1 = new Empleado();
        emp1.calSalario();

    }
}
