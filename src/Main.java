public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Ana", "11111111A", 1500.0);  Gerente g1 = new Gerente("Luis", "22222222B", 2000.0, 500.0);  Programador p1 = new Programador("Marta", "33333333C", 1800.0, "Java");
        e1.mostrarFicha();
        g1.mostrarFicha();
        p1.mostrarFicha();
        p1.programar();
    }
}

