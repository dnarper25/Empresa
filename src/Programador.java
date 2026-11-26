public class Programador extends Empleado {
    private String lenguaje;

    public Programador(String nombre, String dni, double salarioBase, String lenguaje) {
        super(nombre, dni, salarioBase);
        this.lenguaje = lenguaje;
    }

    public void programar() {
        System.out.println(getNombre() + " programa en " + lenguaje);
    }
}

