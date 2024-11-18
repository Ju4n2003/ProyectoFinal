package co.edu.uniquindio.poo;

public class OperacionNoPermitida extends Exception {
    public OperacionNoPermitida(String mensaje) {
        super(mensaje);
    }
}
