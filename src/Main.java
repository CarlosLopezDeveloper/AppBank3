import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el número de cuenta:");
        String numeroCuenta = scanner.nextLine();

        System.out.println("Ingrese el valor a depositar:");
        int valorDeposito = scanner.nextInt();

        // Ejemplo de uso de las clases
        CuentaBancaria cuentaAhorro = new CuentaAhorro(nombre, 5); // Tasa de interés anual del 5%
        cuentaAhorro.depositar(valorDeposito);
        cuentaAhorro.retirar(200);
        cuentaAhorro.calcularIntereses();
        System.out.println("Saldo de cuenta de ahorro: $" + cuentaAhorro.getSaldo());

        CuentaBancaria cuentaInversion = new CuentaInversion(nombre);
        cuentaInversion.depositar(15000);
        cuentaInversion.retirar(5000);
        System.out.println("Saldo de cuenta de inversión: $" + cuentaInversion.getSaldo());

        Empleado empleado = new Empleado(1, nombre, "Gerente", 50000, 3);
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Puesto: " + empleado.getPuesto());
        System.out.println("Salario: $" + empleado.getSalario());
        System.out.println("Días de vacaciones: " + empleado.getDiasVacaciones());

        scanner.close();
    }
}