package android.visitas;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.visitas.dao.DataBaseHelper;
import android.visitas.dao.UsuarioDAO;
import android.visitas.entities.Usuario;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText etNombreUsuario, etClaveUsuario;
    private Button btLoginMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombreUsuario = (EditText) findViewById(R.id.etNombreUsuario);
        etClaveUsuario = (EditText) findViewById(R.id.etClaveUsuario);
        btLoginMain = (Button) findViewById(R.id.btLoginMain);

        btLoginMain.setOnClickListener(btLoginMainOnClickListener);
        try {
            DataBaseHelper dataBaseHelper = new DataBaseHelper(MainActivity.this);
            dataBaseHelper.createDataBase();
            dataBaseHelper.openDataBase();
        } catch (Exception ex) {
            Toast.makeText(MainActivity.this, "No se pudo copiar la BD", Toast.LENGTH_SHORT).show();
        }

        getSupportActionBar().setTitle("Login");
    }

    View.OnClickListener btLoginMainOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Intent intent = new Intent(MainActivity.this,MainResultado.class);
            if (etNombreUsuario.getText().toString().equals("")) {
                Toast.makeText(MainActivity.this, "Ingrese el nombre del Usuario", Toast.LENGTH_SHORT).show();
            } else {
                String Nombre = etNombreUsuario.getText().toString();
                Usuario usuario = new UsuarioDAO().getUsuarioByNombre(Nombre);
                if (usuario != null) {
                    if (etNombreUsuario.getText().toString().equalsIgnoreCase(usuario.getNombre()) &&
                            etClaveUsuario.getText().toString().equalsIgnoreCase(usuario.getClave())) {
                        Toast.makeText(MainActivity.this, "Bienvenido " + usuario.getNombre().toUpperCase(), Toast.LENGTH_SHORT).show();
                        etNombreUsuario.setText("");
                        etClaveUsuario.setText("");
                        //startActivity(intent);
                        etNombreUsuario.requestFocus();
                    } else if (!etNombreUsuario.getText().toString().equalsIgnoreCase(usuario.getNombre()) &&
                            etClaveUsuario.getText().toString().equalsIgnoreCase(usuario.getClave())) {
                        Toast.makeText(MainActivity.this, "El usuario no esta registrado", Toast.LENGTH_SHORT).show();
                        etNombreUsuario.setText("");
                        etNombreUsuario.requestFocus();
                    } else if (etNombreUsuario.getText().toString().equalsIgnoreCase(usuario.getNombre()) &&
                            !etClaveUsuario.getText().toString().equalsIgnoreCase(usuario.getClave())) {
                        Toast.makeText(MainActivity.this, "La clave es incorecta", Toast.LENGTH_SHORT).show();
                        etClaveUsuario.setText("");
                        etClaveUsuario.requestFocus();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "No existe el usuario", Toast.LENGTH_SHORT).show();
                    etNombreUsuario.setText("");
                    etClaveUsuario.setText("");
                    etNombreUsuario.requestFocus();
                }
            }
        }
    };
}
