package co.edu.uniquindio.poo;

public class Cliente extends Usuario implements ITransaccion{
    private String email;

    public Cliente(String nombre, String cedula, String telefono, String email) {
        super(nombre, cedula, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


