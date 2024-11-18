package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Concesionario {
    private String nombre;
    private LinkedList<Usuario> usuarios;
    private LinkedList<Vehiculo> vehiculos;
    public Concesionario(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(LinkedList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public LinkedList<Usuario> mostrarUsuarios() {
        return usuarios;
    }
    public LinkedList<Vehiculo> mostrarVehiculos() {
        return vehiculos;
    }
    @Override
    public String toString() {
        return "Concesionario [nombre=" + nombre + ", usuarios=" + usuarios + ", vehiculos=" + vehiculos + "]";
    }
    
}
