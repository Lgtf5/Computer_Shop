package dev.lidia.MyComponent;

import java.time.LocalDate;


public class FlowStock {
    
    public String tipo; 
    public String marca;
    public int unidadesStock;
    public LocalDate fechaStock;
    public String detalle;

    public FlowStock(String tipo, String marca, int unidadesStock, LocalDate fechaStock, String detalle) {
        this.tipo = tipo;
        this.marca = marca;
        this.unidadesStock = unidadesStock;
        this.fechaStock = LocalDate.now();
        this.detalle = detalle;
    }

    public String getTipo() { return tipo;}
    public String getMarca() { return marca;}
    public int getUnidadesStock() { return unidadesStock;}  
    public LocalDate getFechaStock() { return LocalDate.now();}
    public String getDetalle() { return detalle;}
}
