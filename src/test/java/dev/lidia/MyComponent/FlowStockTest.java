package dev.lidia.MyComponent;

import java.sql.Date;
import java.util.concurrent.Flow;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class FlowStockTest {
    private FlowStock movimiento;

    @Before
    public void setup() {
        movimiento = new FlowStock("ENTRADA", "HP", 50, new Date(), "Compra de 50 HP para lanzamiento tienda");
    }

    @Test
    @DisplayName ("tested attributes to FlowStock class")

    public void testFlowStock() {
        
        private String tipo;
        private String marca;
        private int unidadesStock;
        private Date fechaStock;
        private String detalle;

        assertThat (movimiento.getTipo(), is("ENTRADA"));
        assertThat (movimiento.getMarca(), is("HP"));
        assertThat (movimiento.getUnidadesStock(), is(50));
        assertThat (movimiento.getFechaStock(), is(new Date()));
        assertThat (movimiento.getDetalle(), is("Compra de 50 HP para lanzamiento tienda"));
    }
}
