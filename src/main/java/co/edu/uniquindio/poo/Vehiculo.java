package co.edu.uniquindio.poo;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private boolean esNuevo;
    private int cambio;
    private double velMax;
    private double cilindraje;
    private double precio;
    private String tipoCombustible;
    private boolean disponible;

    public Vehiculo(String marca, String modelo, boolean esNuevo, int cambio, double velMax, double cilindraje,
            double precio, String tipoCombustible, boolean disponible) {
        this.marca = marca;
        this.modelo = modelo;
        this.esNuevo = esNuevo;
        this.cambio = cambio;
        this.velMax = velMax;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.tipoCombustible = tipoCombustible;
        this.disponible = disponible;
        assert marca != null && !marca.isBlank();
        assert modelo != null && !modelo.isBlank();
        assert precio >= 0 : "El precio del vehiculo debe ser positivo";
        assert velMax > 0;
        assert cilindraje > 0;
        assert tipoCombustible != null && !tipoCombustible.isBlank();
        assert disponible;
        assert cambio > 3;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public int getCambio() {
        return cambio;
    }

    public void setCambio(int cambio) {
        this.cambio = cambio;
    }

    public double getVelMax() {
        return velMax;
    }

    public void setVelMax(double velMax) {
        this.velMax = velMax;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", esNuevo=" + esNuevo + ", cambio=" + cambio
                + ", velMax=" + velMax + ", cilindraje=" + cilindraje + ", precio=" + precio + ", tipoCombustible="
                + tipoCombustible + ", disponible=" + disponible + "]";
    }

}
