package co.edu.uniquindio.poo;


public class Transaccion {
    private String fecha;
    private String tipo;
    private Empleado empleadoResponsable;
    private Vehiculo vehiculo;
    private Cliente cliente;

    public Transaccion(String fecha, String tipo, Empleado empleadoResponsable, Vehiculo vehiculo, Cliente cliente) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.empleadoResponsable = empleadoResponsable;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Empleado getEmpleadoResponsable() {
        return empleadoResponsable;
    }

    public void setEmpleadoResponsable(Empleado empleadoResponsable) {
        this.empleadoResponsable = empleadoResponsable;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String toString() {
        return "Fecha: " + fecha + ", Tipo: " + tipo + ", Empleado: " + empleadoResponsable.getNombre() +
                ", Cliente: " + cliente.getNombre() + ", Vehículo: " + vehiculo.getMarca() + " " + vehiculo.getModelo();
    }
}
