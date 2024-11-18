package co.edu.uniquindio.poo;

public class PickUp extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean frenoABS;
    private boolean esCuatroPorCuatro;
    private double capacidadCarga;

    public PickUp(String marca, String modelo, boolean esNuevo, int cambio, double velMax, double cilindraje, double precio, String tipoCombustible, boolean disponible, int numPasajeros, int numPuertas, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean frenoABS, boolean esCuatroPorCuatro, double capacidadCarga) {
        super(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.frenoABS = frenoABS;
        this.esCuatroPorCuatro = esCuatroPorCuatro;
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public boolean isFrenoABS() {
        return frenoABS;
    }

    public void setFrenoABS(boolean frenoABS) {
        this.frenoABS = frenoABS;
    }

    public boolean isEsCuatroPorCuatro() {
        return esCuatroPorCuatro;
    }

    public void setEsCuatroPorCuatro(boolean esCuatroPorCuatro) {
        this.esCuatroPorCuatro = esCuatroPorCuatro;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}
