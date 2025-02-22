package dev.lidia.MyComponent;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import dev.lidia.MyComponent.Computer;

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
        ComputerShop tienda = new ComputerShop("Tienda1", "Jhon Doe", 123456789);
        Computer computadora1 = new Computer("HP", "Pavilion", 8, 500, 1000);
        Computer computadora2 = new Computer("Lenovo", "Thinkpad", 16, 1000, 1500);
        tienda.addComputer(computadora1);
        tienda.addComputer(computadora2);

        List <Computer> computadoras = tienda.getComputadoras();
        assertThat (computadoras.size(), is(2));
        assertThat (computadoras, hasItems(computadora1, computadora2));

    }
}
