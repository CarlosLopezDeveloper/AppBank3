class Empleado {
    private int numero;
    private String nombre;
    private String puesto;
    private double salario;
    private int antiguedad;
    private int diasVacaciones;

    public Empleado(int numero, String nombre, String puesto, double salario, int antiguedad) {
        this.numero = numero;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.antiguedad = antiguedad;
        calcularDiasVacaciones();
    }

    private void calcularDiasVacaciones() {
        diasVacaciones = 10; // Por defecto, todos los empleados tienen 10 días de vacaciones
        diasVacaciones += antiguedad / 2; // Aumenta medio día por cada año de antigüedad
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }
}
