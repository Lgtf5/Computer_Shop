package dev.lidia.MyComponent;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import dev.lidia.MyComponent.Computer;


public class ComputerTest {

    @Test
    @DisplayName("Computer Test")

    public void test() {
        Computer computadora = new Computer ("HP", 16, "Intel i5", "Windows", 1500.0);

        String marca = computadora.getMarca();
        int memoria = computadora.getMemoria();
        String procesador = computadora.getProcesador(); 
        String sistemaOperativo = computadora.getSistemaOperativo();
        double precio = computadora.getPrecio();
    }
}
