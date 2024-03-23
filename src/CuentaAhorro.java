class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual;

    public CuentaAhorro(String cliente, double tasaInteresAnual) {
        super(cliente);
        this.tasaInteresAnual = tasaInteresAnual;
        saldo = 1000; // Primer depósito invariablemente de $1000
    }

    @Override
    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(int cantidad) {
        if (saldo - cantidad >= 500) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar esa cantidad. El saldo mínimo debe ser $500.");
        }
    }

    @Override
    public void calcularIntereses() {
        double intereses = saldo * (tasaInteresAnual / 12) / 100; // Calcula intereses mensuales
        saldo += intereses;
        System.out.println("Intereses calculados: $" + intereses);
    }
}
