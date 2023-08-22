// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        GestionEstudiantes gestionEstudiantes = new GestionEstudiantes();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-------- GESTIÓN DE ESTUDIANTES --------");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular promedio de edad");
            System.out.println("4. Calcular promedio de notas");
            System.out.println("5. Mostrar total de hombres y mujeres");
            System.out.println("6. Salir");
            System.out.println("----------------------------------------");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.println("-------- AGREGAR ESTUDIANTE --------");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.print("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese el teléfono: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Ingrese la nota promedio final: ");
                    double notaPromedioFinal = scanner.nextDouble();

                    Estudiante estudiante = new Estudiante(nombre, sexo, edad, telefono, curso, notaPromedioFinal);
                    gestionEstudiantes.agregarEstudiante(estudiante);
                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println("-------- LISTA DE ESTUDIANTES --------");
                    gestionEstudiantes.mostrarListaEstudiantes();
                    System.out.println("--------------------------------------");
                    break;
                case 3:
                    double promedioEdad = gestionEstudiantes.calcularPromedioEdad();
                    System.out.println("Promedio de edad de los estudiantes: " + promedioEdad);
                    break;
                case 4:
                    double promedioNotas = gestionEstudiantes.calcularPromedioNotas();
                    System.out.println("Promedio de notas de los estudiantes: " + promedioNotas);
                    break;
                case 5:
                    System.out.println("-------- TOTAL DE HOMBRES Y MUJERES --------");
                    gestionEstudiantes.mostrarTotalHombresMujeres();
                    System.out.println("--------------------------------------------");
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 6);

        scanner.close();
    }
}
