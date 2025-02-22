package dev.lidia.MyComponent;
import dev.lidia.MyComponent.Computer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import java.util.List;



public class ComputerShopTest {

    @Test
    @DisplayName ("testamos atributos de la clase ComputerShop")

    public void testGettersAtributosTienda() {
        ComputerShop tienda = new ComputerShop("Tienda1", "Jhon Doe", 123456789);

        assertThat (tienda.getNombre(), is("Tienda1"));
        assertThat (tienda.getPropietario(), is("Jhon Doe"));
        assertThat (tienda.getIdTributario(), is(123456789));
    }


    @Test
    @DisplayName ("testamos atributo array de la clase ComputerShop") 

    public void testGetterListComputadoras() {
        ComputerShop tienda = new ComputerShop ("Tienda1", "Jhon Doe", 123456789);
        Computer computadora1 = new Computer();
        Computer computadora2 = new Computer();

        tienda.addComputer(computadora1);
        tienda.addComputer(computadora2);

        List <Computer> computadoras = tienda.getComputadoras();
        assertThat (computadoras.size(), is(2));
        assertThat (computadoras, hasItems(computadora1, computadora2));

    }
}
