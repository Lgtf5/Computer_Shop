package dev.lidia.MyComponent;

import java.util.ArrayList;
import java.util.List;

public class ComputerShop {
    private String nombre;
    private String propietario;
    private int idTributario;
    private List<Computer> computadoras;


    public ComputerShop(String nombre, String propietario, int idTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.idTributario = idTributario;
        this.computadoras = new ArrayList<>();

    }

    public void addComputer(Computer computadora) {
        this.computadoras.add(computadora);
    }

    public String getNombre() { return nombre;}
    public String getPropietario() { return propietario;}
    public int getIdTributario() { return idTributario;}
    public List<Computer> getComputadoras() { return computadoras;}
}
