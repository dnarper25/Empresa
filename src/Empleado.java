public class Empleado {
    private String nombre;
    private String dni;
    private double salarioBase;

    public Empleado(String nombre, String dni, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSueldo() {
        return salarioBase;
    }

    public void mostrarFicha() {
        System.out.println("Empleado: " + nombre + " | DNI: " + dni + " | sueldo: " + calcularSueldo());
    }
}
