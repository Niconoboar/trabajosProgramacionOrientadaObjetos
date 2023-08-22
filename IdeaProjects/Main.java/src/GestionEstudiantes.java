import java.util.ArrayList;
import java.util.List;

public class GestionEstudiantes {
        private List<Estudiante> listaEstudiantes;

        public GestionEstudiantes() {
            listaEstudiantes = new ArrayList<>();
        }

        public void agregarEstudiante(Estudiante estudiante) {
            listaEstudiantes.add(estudiante);
            System.out.println("Estudiante agregado correctamente.");
        }

        public void mostrarListaEstudiantes() {
            if (listaEstudiantes.isEmpty()) {
                System.out.println("No hay estudiantes en la lista.");
            } else {
                System.out.println("Lista de estudiantes:");
                for (Estudiante estudiante : listaEstudiantes) {
                    System.out.println("Nombre: " + estudiante.getNombre());
                    System.out.println("Sexo: " + estudiante.getSexo());
                    System.out.println("Edad: " + estudiante.getEdad());
                    System.out.println("Teléfono: " + estudiante.getTelefono());
                    System.out.println("Curso: " + estudiante.getCurso());
                    System.out.println("Nota Promedio Final: " + estudiante.getNotaPromedioFinal());
                }
            }
        }

        public double calcularPromedioEdad() {
            if (listaEstudiantes.isEmpty()) {
                return 0;
            }

            int sumaEdades = 0;
            for (Estudiante estudiante : listaEstudiantes) {
                sumaEdades += estudiante.getEdad();
            }

            return (double) sumaEdades / listaEstudiantes.size();
        }

        public double calcularPromedioNotas() {
            if (listaEstudiantes.isEmpty()) {
                return 0;
            }

            double sumaNotas = 0;
            for (Estudiante estudiante : listaEstudiantes) {
                sumaNotas += estudiante.getNotaPromedioFinal();
            }

            return sumaNotas / listaEstudiantes.size();
        }

        public void mostrarTotalHombresMujeres() {
            int totalHombres = 0;
            int totalMujeres = 0;

            for (Estudiante estudiante : listaEstudiantes) {
                if (estudiante.getSexo().equalsIgnoreCase("Hombre")) {
                    totalHombres++;
                } else if (estudiante.getSexo().equalsIgnoreCase("Mujer")) {
                    totalMujeres++;
                }
            }

            System.out.println("Total de Hombres: " + totalHombres);
            System.out.println("Total de Mujeres: " + totalMujeres);
        }
    }