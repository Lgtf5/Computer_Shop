package dev.lidia.MyComponent;


public class Computer {
    private String marca;
    private int memoria;
    private String procesador;
    private String sistemaOperativo;
    private double precio;
    
    public Computer(String marca, int memoria, String procesador, String sistemaOperativo, double precio) {
        this.marca = marca;
        this.memoria = memoria;
        this.procesador = procesador;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    public String getMarca() { return marca;}
    public int getMemoria() { return memoria;}
    public String getProcesador() { return procesador;}
    public String getSistemaOperativo() { return sistemaOperativo;}
    public double getPrecio() { return precio;}
}
