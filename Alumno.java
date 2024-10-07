public class Alumno {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double ingles;
    private double iot;
    private double promedio;

    // Constructor
    public Alumno(String m, String n) {
        this.matricula = m;
        this.nombre = n;
    }

    // Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }

    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }

    public double getIngles() { // Corregido de "getIngels"
        return ingles;
    }

    public void setIngles(double ingles) { // Corregido de "setIngels"
        this.ingles = ingles;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getPromedio() {
        return promedio;
    }

    // Método para calcular el promedio
    public void setPromedio() {
        this.promedio = (this.estructuras + this.ingles + this.iot) / 3; // Ajustado el cálculo
    }

    // Método para imprimir la información del alumno
    @Override
    public String toString() {
        return "Alumno [Matrícula: " + matricula + ", Nombre: " + nombre + ", Estructuras: " + estructuras +
               ", Inglés: " + ingles + ", IoT: " + iot + ", Promedio: " + promedio + "]";
    }
}
