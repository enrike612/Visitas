package android.visitas.entities;

/**
 * Created by Programados on 21/02/2015.
 */
public class movimientoVisita {

    private int idMovimientoVisita;
    private int idVisita;
    private int estado;
    private int idPersona;
    private String fecha;
    private String observacion;
    private int idProducto;
    private int flgVenta;
    private int idParametro;


    public movimientoVisita() {

    }

    public int getIdMovimientoVisita() {
        return idMovimientoVisita;
    }


    public void setIdMovimientoVisita(int idMovimientoVisita) {
        this.idMovimientoVisita = idMovimientoVisita;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getFlgVenta() {
        return flgVenta;
    }

    public void setFlgVenta(int flgVenta) {
        this.flgVenta = flgVenta;
    }

    public int getIdParametro() {
        return idParametro;
    }

    public void setIdParametro(int idParametro) {
        this.idParametro = idParametro;
    }
}
