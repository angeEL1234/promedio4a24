import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedio {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    public static Alumno[] alumnos;

    public static void main(String[] args) throws IOException {
        int n;

        // Solicitar el número de alumnos
        System.out.println("Escribe el número de alumnos en el grupo: ");
        entrada = bufer.readLine(); // Lectura del teclado
        n = Integer.parseInt(entrada); // Conversión de String a int

        // Inicializar el arreglo de alumnos
        alumnos = new Alumno[n];

        // Llamar al método para leer la información de los alumnos
        leerAlumnos();

        // Calcular y mostrar el promedio general del grupo
        double promedioGeneral = calcularPromedioGeneral();
        System.out.println("-----------------------------------------");
        System.out.println("El promedio general del grupo es: " + promedioGeneral);
    }

    // Método para leer la información de los alumnos
    public static void leerAlumnos() throws IOException {
        String matricula, nombre;
        System.out.println("Solicito la información de los estudiantes");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Escribe la matrícula: ");
            entrada = bufer.readLine();
            matricula = entrada;

            System.out.println("Escribe el nombre:");
            entrada = bufer.readLine();
            nombre = entrada;

            // Creación de un objeto Alumno
            Alumno a = new Alumno(matricula, nombre);

            // Leyendo calificaciones
            System.out.println("Escribe la calificación de Estructuras: ");
            entrada = bufer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));

            System.out.println("Escribe la calificación de Inglés: ");
            entrada = bufer.readLine();
            a.setIngels(Double.parseDouble(entrada)); // Corregido el nombre del método

            System.out.println("Escribe la calificación de IoT: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));

            // Calcular el promedio del alumno
            a.calcularpromedio();

            // Guardar el alumno en el arreglo
            alumnos[i] = a;
        }
    }

    // Método para calcular el promedio general del grupo
    public static double calcularPromedioGeneral() {
        double suma = 0;
        for (Alumno a : alumnos) {
            suma += a.getPromedio();
        }
        return suma / alumnos.length;
    }
}
