import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedio{

    // DEclarando variables globales
    public static BufferedReader bufer =new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;
    // Declaración de un arreglo del tipo TDA
    public static Alumno[] alumnos;


    public static void leerAlumnos() throws IOException{
        String matricula, nombre;

        System.out.println("Solicitud de informacion de cada estuduiante");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("----------------------");
            System.out.println("Escribe el nombre de la matricula: ");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Escribe el nombre ");
            entrada = bufer.readLine();
            nombre = entrada;
            Alumno a = new Alumno(matricula, nombre);
            //Leyendo calificaciones
            System.out.println("Escribe la calificaion de estructuras: ");
            entrada = bufer.readLine();
            a.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escribe calificacion de ingles");
            entrada = bufer.readLine();
            a.setIngles(Double.parseDouble(entrada));
            System.out.println("Escribe calificacion de oit: ");
            entrada = bufer.readLine();
            a.setIot(Double.parseDouble(entrada));
            a.setPromedio();
            //agregando un alumno al arreglo
            alumnos[i] = a;
        }
    }

    public static void imprimirAlumnos() {
        System.out.println("Contenido del arreglo alumnos: ");
        for (Alumno a : alumnos){
            System.out.println("----------------------");
            System.out.println("Información del alumno: ");
            System.out.println(a.toString());
        }
    }

        public static double calcularPromedioGrupo() {
            double suma = 0;
            for (Alumno a : alumnos){
                suma += a.getPromedio();
            }
            return (suma / alumnos.length);
        }

    public static void main(String[] args) throws IOException {
        int n; //tamaño del grupo
        double promedio; //promedio del grupo

        System.out.println("Programa para calcular promedio de un grupo ");
        System.out.println("------------------------------------------------");
        //recuperando el tamaño del grupo
        System.out.println("Escribe el numer de alumnos en el grupo: ");
        entrada =bufer.readLine();//lectura del teclado
        n = Integer.parseInt(entrada);//Conversion de String a int


        //Construir el arreglo alumnos
        alumnos = new Alumno[n];
        //Introducir información de los alumnos
        leerAlumnos();
        //Mostrar la información
        imprimirAlumnos();
        //Obtener el promedio
        promedio = calcularPromedioGrupo();


        System.out.println("---------------------------------------");
        System.out.println("El promedio del grupo es: " + promedio + "");

    }
}