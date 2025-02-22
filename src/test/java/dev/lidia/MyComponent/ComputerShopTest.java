package dev.lidia.MyComponent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ComputerShopTest {


    @Test
    @DisplayName ("testamos atributos de la clase ComputerShop")

    public void testGettersAtributosTienda() {
        ComputerShop tienda = new ComputerShop("Tienda1", "Jhon Doe", "123456789");

        assertThat (tienda.getNombre(), is("Tienda1"));
        assertThat (tienda.getPropietario(), is("Jhon Doe"));
        assertThat (tienda.getIdTributario(), is("123456789"));
    }


}
