package co.edu.uniquindio.poo;

public class Empleado extends Usuario implements ITransaccion {
    private String cargo;
    private String credenciales;
    private double salario;

    public Empleado(String nombre, String cedula, String telefono, String cargo, String credenciales, double salario) {
        super(nombre, cedula, telefono);
        this.cargo = cargo;
        this.credenciales = credenciales;
        this.salario = salario;
        assert salario >= 0;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }

    @Override
    public void alquilar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void comprar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void vender() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void realizarTransaccion(Vehiculo vehiculo, Cliente cliente, String tipo, String fecha) {
        if (vehiculo.isDisponible()) {
            vehiculo.setDisponible(false);
            System.out.println("Transacción realizada exitosamente:");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Vehículo: " + vehiculo);
            System.out.println("Tipo: " + tipo);
            System.out.println("Fecha: " + fecha);
        } else {
            System.out.println("El vehículo no está disponible para la transacción.");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado [cargo=" + cargo + ", credenciales=" + credenciales + ", salario=" + salario + "]";
    }
    
}
