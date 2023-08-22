package perro;//crea una clase llamada perro con atributos nombre raza y edad define metodos para obtener y establecer estos atributos y agrega un metodo para que el proo ladre

//Abstraccion
public class Perro {
    //atributos
    public String nombre="isa";
    public String raza="pequines";
    public int edad=5;

    //metodos
    public String getNombre(){
        return this.nombre;
    }
    public void miPerro(){
        System.out.println(
                "nombre:"+ this.nombre + "\n" +
                "edad:"+ this.edad + "\n" +
                "raza:"+ this.nombre + "\n"

        );
    }

}
