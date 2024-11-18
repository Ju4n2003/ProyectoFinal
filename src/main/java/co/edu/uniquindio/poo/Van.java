package co.edu.uniquindio.poo;

public class Van extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private int capacidadMaletero;
    private boolean aireAcondicionado;
    private boolean camaraReversa;
    private int numBolsasAire;
    private boolean frenoABS;

    public Van(String marca, String modelo, boolean esNuevo, int cambio, double velMax, double cilindraje, double precio, String tipoCombustible, boolean disponible, int numPasajeros, int numPuertas, int capacidadMaletero, boolean aireAcondicionado, boolean camaraReversa, int numBolsasAire, boolean frenoABS) {
        super(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.capacidadMaletero = capacidadMaletero;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
        this.numBolsasAire = numBolsasAire;
        this.frenoABS = frenoABS;
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

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
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
    
}

