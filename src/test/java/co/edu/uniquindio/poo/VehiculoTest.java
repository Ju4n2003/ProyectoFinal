package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    @Test
    public void DatosCompletos() {
        Vehiculo vehiculo = new Vehiculo("chevrolet", "2024", true, 5, 200, 1000, 64000000.0, "diesel", true){

        };
        assertEquals("chevrolet", vehiculo.getMarca());
        assertEquals("2024", vehiculo.getModelo());
        assertTrue(vehiculo.isEsNuevo());
        assertEquals(5, vehiculo.getCambio());
        assertEquals(200, vehiculo.getVelMax());
        assertEquals(1000, vehiculo.getCilindraje());
        assertEquals(64000000.0, vehiculo.getPrecio());
        assertEquals("diesel", vehiculo.getTipoCombustible());
        assertTrue(vehiculo.isDisponible());
    }

    @Test
    public void testDisponibilidad() {
        Vehiculo vehiculo = new Vehiculo("Chevrolet", "2024", true, 5, 200, 1000, 64000000, "diesel", true) {

        };

        assertTrue(vehiculo.isDisponible());
        vehiculo.setDisponible(false);
        assertFalse(vehiculo.isDisponible());
    }
    
    @Test
    public void precioNegativo(){
        
        assertThrows(Throwable.class,()-> new Sedan("chevrolete", "2024", true, 5, 200, 1000, -64000000, "diesel", true, 5, 5, 50, true, true, false, 4, true));
    }
}
