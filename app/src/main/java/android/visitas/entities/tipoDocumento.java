package android.visitas.entities;

/**
 * Created by Programados on 21/02/2015.
 */
public class tipoDocumento {
    private int idTipoDocumento;
    private String descripcion;


    public tipoDocumento() {
    }


    public int getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(int idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
