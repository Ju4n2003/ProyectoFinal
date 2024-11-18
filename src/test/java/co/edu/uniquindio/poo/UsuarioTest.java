package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UsuarioTest {
    @Test
    public void datosVacios() {

        assertThrows(Throwable.class, () -> new Cliente("null", "null", " ", " "));

    }

    @Test
    public void datosNulos() {

        assertThrows(NullPointerException.class, () -> new Empleado(null, null, null, null, null, 0));

    }
    @Test
    public void salarioNegativo() {
        
        assertThrows(Throwable.class, ()-> new Empleado("Carlos", "10943622", "3248667422", "Vendedor", "0611", -1400000));

    }
}
