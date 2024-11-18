package co.edu.uniquindio.poo;

public class Camion extends Vehiculo {
    private double capacidadCarga;
    private boolean aireAcondicionado;
    private boolean frenoABS;
    private int numEjes;
    private String tipoCamion;

    public Camion(String marca, String modelo, boolean esNuevo, int cambio, double velMax, double cilindraje, double precio, String tipoCombustible, boolean disponible, double capacidadCarga, boolean aireAcondicionado, boolean frenoABS, int numEjes, String tipoCamion) {
        super(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible);
        this.capacidadCarga = capacidadCarga;
        this.aireAcondicionado = aireAcondicionado;
        this.frenoABS = frenoABS;
        this.numEjes = numEjes;
        this.tipoCamion = tipoCamion;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isFrenoABS() {
        return frenoABS;
    }

    public void setFrenoABS(boolean frenoABS) {
        this.frenoABS = frenoABS;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    public String getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(String tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

}
