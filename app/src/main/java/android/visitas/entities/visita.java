package android.visitas.entities;

/**
 * Created by Programados on 21/02/2015.
 */
public class visita {

    private int idVisita;
    private int idCliente;
    private int idDistrito;
    private String direccion;
    private String fecha;
    private String horaDesde;
    private String horaHasta;
    private int idPersonaAsignada;
    private int idEstadoVisita;
    private String latitud;
    private String longitud;
    private String altitud;


    public visita() {
    }



    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(String horaDesde) {
        this.horaDesde = horaDesde;
    }

    public String getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(String horaHasta) {
        this.horaHasta = horaHasta;
    }

    public int getIdPersonaAsignada() {
        return idPersonaAsignada;
    }

    public void setIdPersonaAsignada(int idPersonaAsignada) {
        this.idPersonaAsignada = idPersonaAsignada;
    }

    public int getIdEstadoVisita() {
        return idEstadoVisita;
    }

    public void setIdEstadoVisita(int idEstadoVisita) {
        this.idEstadoVisita = idEstadoVisita;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }
}
