package co.edu.uniquindio.poo;

public class Deportivo extends Vehiculo {
    private int numPasajeros;
    private int numPuertas;
    private int numBolsasAire;
    private double caballosDeFuerza;
    private double tiempoCienKm;

    public Deportivo(String marca, String modelo, boolean esNuevo, int cambio, double velMax, double cilindraje, double precio, String tipoCombustible, boolean disponible, int numPasajeros, int numPuertas, int numBolsasAire, double caballosDeFuerza, double tiempoCienKm) {
        super(marca, modelo, esNuevo, cambio, velMax, cilindraje, precio, tipoCombustible, disponible);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.caballosDeFuerza = caballosDeFuerza;
        this.tiempoCienKm = tiempoCienKm;
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

    public int getNumBolsasAire() {
        return numBolsasAire;
    }

    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }

    public double getCaballosDeFuerza() {
        return caballosDeFuerza;
    }

    public void setCaballosDeFuerza(double caballosDeFuerza) {
        this.caballosDeFuerza = caballosDeFuerza;
    }

    public double getTiempoCienKm() {
        return tiempoCienKm;
    }

    public void setTiempoCienKm(double tiempoCienKm) {
        this.tiempoCienKm = tiempoCienKm;
    }
}


