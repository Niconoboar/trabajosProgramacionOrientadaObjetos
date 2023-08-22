import java.util.ArrayList;
import java.util.List;


public class Persona {

        private String nombre;
        private String sexo;
        private int edad;
        private String telefono;

        public Persona(String nombre, String sexo, int edad, String telefono) {
            this.nombre = nombre;
            this.sexo = sexo;
            this.edad = edad;
            this.telefono = telefono;
        }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
            return nombre;
        }

        public String getSexo() {
            return sexo;
        }

        public int getEdad() {
            return edad;
        }

        public String getTelefono() {
            return telefono;
        }
    }
