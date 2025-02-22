package dev.lidia.MyComponent;




public class ComputerShop {
    private String nombre;
    private String propietario;
    private int idTributario;

    public ComputerShop(String nombre, String propietario, int idTributario) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.idTributario = idTributario;
    }
    public String getNombre() { return nombre;}
    public String getPropietario() { return propietario;}
    public int getIdTributario() { return idTributario;}
}
