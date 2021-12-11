package co.edu.unab.api.models;

public class ProductModel {
    private String nombre;
    private int cantidad;
    private int precio;

    
    public ProductModel() {
    }


    public ProductModel(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public int getprecio() {
        return precio;
    }


    public void setprecio(int precio) {
        this.precio = precio;
    }

    

}
