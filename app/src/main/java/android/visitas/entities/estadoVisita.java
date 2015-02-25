package android.visitas.entities;

/**
 * Created by Programados on 21/02/2015.
 */
public class estadoVisita {

    private int idEstadoVisita;
    private String descripcion;

    public estadoVisita() {
    }


    public int getIdEstadoVisita() {
        return idEstadoVisita;
    }

    public void setIdEstadoVisita(int idEstadoVisita) {
        this.idEstadoVisita = idEstadoVisita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
