import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedio{

    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
        double [] calificaciones; //calificaciones de cada alumno
        double suma = 0; //para sumar las calificaciones
        double promedio; //promedio del grupo

        BufferedReader bufer =new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Programa para calcular promedio de un grupo");
        System.out.println("------------------------------------------------");
        //recuperando el tamaño del grupo
        System.out.println("Escribe el numer de alumnos en el grupo: ");
        entrada =bufer.readLine();//lectura del teclado
        n = Integer.parseInt(entrada);//Conversion de String a int

        calificaciones = new double[n]; // construccion del arreglo

        // Pedir cada calificacion y acumularla
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Escribe la calificacion del alumno [" + (i+1) + "]:");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        // obtener el promedio
        promedio = suma / n;
        System.out.println("-----------------------------------------");
        System.out.println("Las calificaciones de cada alumno son: ");
        for (double calif : calificaciones) {
            System.out.println(calif);
        }
        System.out.println("---------------------------------------");
        System.out.println("El promedio del grupo es: " + promedio );
    }
}