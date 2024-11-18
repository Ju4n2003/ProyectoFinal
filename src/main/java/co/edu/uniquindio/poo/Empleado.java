package co.edu.uniquindio.poo;

public class Empleado extends Usuario implements ITransaccion {
    private String cargo;
    private String credenciales;

    public Empleado(String nombre, String cedula, String telefono, String cargo, String credenciales) {
        super(nombre, cedula, telefono);
        this.cargo = cargo;
        this.credenciales = credenciales;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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
}
