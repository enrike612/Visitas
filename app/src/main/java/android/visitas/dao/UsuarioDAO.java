package android.visitas.dao;

import android.database.Cursor;
import android.visitas.entities.Usuario;

/**
 * Created by steven1 on 26/02/2015.
 */
public class UsuarioDAO {

    public Usuario getUsuarioById(int IdUsuario) {
        Cursor cursor = null;
        Usuario usuario = null;
        try {
            cursor = DataBaseHelper.myDataBase.query("Usuario", null, "IdUsuario = ?", new String[]{String.valueOf(IdUsuario)}, null, null, null);
            if (cursor.moveToFirst()) {
                do {
                    usuario = new Usuario();
                    usuario.setIdUsuario(IdUsuario);
                    usuario.setNombre(cursor.isNull(cursor.getColumnIndex("Nombre"))?"111":cursor.getString(cursor.getColumnIndex("Nombre")));
                    usuario.setClave(cursor.isNull(cursor.getColumnIndex("Clave"))?"222":cursor.getString(cursor.getColumnIndex("Clave")));
                } while (cursor.moveToNext());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (cursor != null)
                cursor.close();
        }
        return usuario;
    }

    public Usuario getUsuarioByNombre(String Nombre) {
        Cursor cursor = null;
        Usuario usuario = null;
        try {
            cursor = DataBaseHelper.myDataBase.query("Usuario", null, "Nombre = ?", new String[]{String.valueOf(Nombre)}, null, null, null);
            if (cursor.moveToFirst()) {
                do {
                    usuario = new Usuario();
                    usuario.setIdUsuario(cursor.isNull(cursor.getColumnIndex("IdUsuario"))?000:cursor.getInt(cursor.getColumnIndex("IdUsuario")));
                    usuario.setNombre(cursor.isNull(cursor.getColumnIndex("Nombre"))?"111":cursor.getString(cursor.getColumnIndex("Nombre")));
                    usuario.setClave(cursor.isNull(cursor.getColumnIndex("Clave"))?"222":cursor.getString(cursor.getColumnIndex("Clave")));
                } while (cursor.moveToNext());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (cursor != null)
                cursor.close();
        }
        return usuario;
    }
}
