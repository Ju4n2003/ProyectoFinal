package co.edu.uniquindio.poo;

public class Administrador extends Empleado {

    public Administrador(String nombre, String cedula, String telefono, String cargo, String credenciales, double salario) {
        super(nombre, cedula, telefono, cargo, credenciales, salario);
    }
    public void recuperarClave(String credenciales) throws CredencialesInvalidas {
        if (!this.getCredenciales().equals(credenciales)) {
            throw new CredencialesInvalidas("Las credenciales no son válidas. Por favor, intente nuevamente.");
        }
        System.out.println("Clave recuperada exitosamente. Se ha enviado a su correo registrado.");
    }

    public void gestionarEmpleados(String accion, String empleadoNombre) throws ErrorAdministrativo {
        if (accion == null || accion.isBlank()) {
            throw new ErrorAdministrativo("La acción proporcionada no es válida.");
        }

        switch (accion.toLowerCase()) {
            case "agregar":
                System.out.println("Empleado " + empleadoNombre + " agregado con éxito.");
                break;
            case "modificar":
                System.out.println("Datos del empleado " + empleadoNombre + " actualizados.");
                break;
            case "bloquear":
                System.out.println("Cuenta del empleado " + empleadoNombre + " bloqueada.");
                break;
            default:
                throw new ErrorAdministrativo("Acción desconocida: " + accion);
        }
    }
    public void validarCredenciales(String usuario, String clave) throws CredencialesInvalidas {
            if (!this.getCredenciales().equals(clave)) {
                throw new CredencialesInvalidas("Credenciales inválidas para el usuario: " + usuario);
        }
    }
    public void gestionarVehiculo(Vehiculo vehiculo) throws VehiculoNoDisponible {
        if (!vehiculo.isDisponible()) {
            throw new VehiculoNoDisponible("El vehículo seleccionado no está disponible.");
        }
        System.out.println("Vehículo gestionado exitosamente: " + vehiculo);
        }
}
    
