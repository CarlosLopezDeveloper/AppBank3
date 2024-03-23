abstract class CuentaBancaria {
    protected int saldo;
    protected String cliente;

    public CuentaBancaria(String cliente) {
        this.cliente = cliente;
    }

    public abstract void depositar(int cantidad);

    public abstract void retirar(int cantidad);

    public abstract void calcularIntereses();

    public int getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return cliente;
    }
}
