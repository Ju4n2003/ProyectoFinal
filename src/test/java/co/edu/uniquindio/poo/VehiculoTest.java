package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class VehiculoTest {
    @Test
    public void DatosCompletos() {
        Sedan vehiculo = new Sedan("chevrolete", "2024", true, 5, 200, 1000, 64000000, "diesel", true, 5, 5, 50, true, true, true, 4, true);
        assertEquals("chevrolet", vehiculo.getMarca());
        assertEquals("2024", vehiculo.getModelo());
        assertTrue(vehiculo.isEsNuevo());
        assertEquals(5, vehiculo.getCambio());
        assertEquals(200, vehiculo.getVelMax());
        assertEquals(1000, vehiculo.getCilindraje());
        assertEquals(64000000.0, vehiculo.getPrecio());
        assertEquals("diesel", vehiculo.getTipoCombustible());
        assertTrue(vehiculo.isDisponible());
        assertEquals(5, vehiculo.getNumPasajeros());
        assertEquals(5, vehiculo.getNumPuertas());
        assertEquals(50, vehiculo.getCapacidadMaletero());
        assertEquals(true, vehiculo.isAireAcondicionado());
        assertEquals(true, vehiculo.isCamaraReversa());
        assertEquals(true, vehiculo.isVelocidadCrucero());
        assertEquals(4, vehiculo.getNumBolsasAire());
        assertEquals(true, vehiculo.isFrenoABS());
        
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
    @Test 
    public void numPuertasNegativo(){

        assertThrows(Throwable.class,()-> new Sedan("chevrolet", "2024", true, 5, 200, 1000, 64000000, "diesel", true, 5, -5, 50, true, true, false, 4, true));
    }
}
