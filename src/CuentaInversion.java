class CuentaInversion extends CuentaBancaria {
    public CuentaInversion(String cliente) {
        super(cliente);
        saldo = 25000; // Monto inicial de $25,000
    }

    @Override
    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    @Override
    public void retirar(int cantidad) {
        if (saldo - cantidad >= 10000 || saldo - cantidad == 0) {
            saldo -= cantidad;
        } else {
            System.out.println("No se puede retirar esa cantidad. El saldo mínimo debe ser $10,000.");
        }
    }

    @Override
    public void calcularIntereses() {
        // No se calculan intereses para cuenta de inversión
    }
}
