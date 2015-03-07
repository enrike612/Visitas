package android.visitas.entities;

/**
 * Created by Programados on 21/02/2015.
 */
public class persona {
    private int idPersona;
    private int tipoPermiso;
    private String nombres;
    private String apellidos;
    private int idTipoDocumento;
    private String nroDocumento;
    private String usuario;
    private String clave;

    public persona() {

    }

    public persona(int idPersona, int tipoPermiso, String nombres, String apellidos, int idTipoDocumento, String nroDocumento, String usuario, String clave) {
        this.idPersona = idPersona;
        this.tipoPermiso = tipoPermiso;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idTipoDocumento = idTipoDocumento;
        this.nroDocumento = nroDocumento;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(int tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
