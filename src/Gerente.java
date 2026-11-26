public class Gerente extends Empleado {
    private double bonus;

    public Gerente(String nombre, String dni, double salarioBase, double bonus) {
        super(nombre, dni, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSueldo() {
        return getSalarioBase() + bonus;
    }
}
