package dev.lidia.MyComponent;

import java.sql.Date;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import java.time.LocalDate; 

public class FlowStockTest {
    private FlowStock movimiento;

    @Before
    public void setup() {
        movimiento = new FlowStock("ENTRADA", "HP", 50, LocalDate.now(), "Compra de 50 HP para lanzamiento tienda");
    }

    @Test
    @DisplayName ("tested attributes to FlowStock class")

    public void FlowStock() {
        
        String tipo;
        String marca;
        int unidadesStock;
        Date fechaStock;
        String detalle;
    

        assertThat (movimiento.getTipo(), is("ENTRADA"));
        assertThat (movimiento.getMarca(), is("HP"));
        assertThat (movimiento.getUnidadesStock(), is(50));
        assertThat (movimiento.getFechaStock(), is(notNullValue()));
        assertThat (movimiento.getDetalle(), is("Compra de 50 HP para lanzamiento tienda"));
    
    }

}
