package android.visitas.entities;

/**
 * Created by steven1 on 26/02/2015.
 */
public class Usuario {
    public static int IdUsuario;
    public static String Nombre;
    public static String Clave;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String clave) {
        IdUsuario = idUsuario;
        Nombre = nombre;
        Clave = clave;
    }

    public static int getIdUsuario() {
        return IdUsuario;
    }

    public static void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public static String getNombre() {
        return Nombre;
    }

    public static void setNombre(String nombre) {
        Nombre = nombre;
    }

    public static String getClave() {
        return Clave;
    }

    public static void setClave(String clave) {
        Clave = clave;
    }
}
