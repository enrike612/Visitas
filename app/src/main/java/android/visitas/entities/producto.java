package android.visitas.entities;

/**
 * Created by Programados on 21/02/2015.
 */
public class producto {
    private int idProducto;
    private String descripcion;
    private double precio;

    public producto() {
    }



    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
