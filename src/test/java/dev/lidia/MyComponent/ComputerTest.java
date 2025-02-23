package dev.lidia.MyComponent;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;



public class ComputerTest {

    @Test
    @DisplayName("Computer Test")

    public void Computer() {
        Computer computadora = new Computer ("HP", 16, "Intel i5", "Windows", 1500.00);

        String marca = computadora.getMarca();
        int memoria = computadora.getMemoria();
        String procesador = computadora.getProcesador(); 
        String sistemaOperativo = computadora.getSistemaOperativo();
        double precio = computadora.getPrecio();
    
    assertThat (computadora.getMarca(), is("HP"));
    assertThat (computadora.getMemoria(), is(16));
    assertThat (computadora.getProcesador(), is("Intel i5"));
    assertThat (computadora.getSistemaOperativo(), is("Windows"));
    assertThat (computadora.getPrecio(), is(1500.00));

    }
}
