package net.dam.menudeopciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Creamos el menú de opciones.
     * Cuando creamos el menú, el archivo xml no existe.
     * Para crearlo, al objeto inflate le pasamos un archivo con el nombre que le queramos
     * dar y con ctrl + intro se crea el xml en res/menu/archivo.xml
     * @param menu es el menú definido en el toolbar pero que inicialmente está vacío.
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        //Cargamos el xml en el que se define el menú
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    /**
     * Método para responder a las acciones del menú de opciones
     * @param item es el ítem sobre el que se ha realizado la acción
     * @return 
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.mnop_nuevo_producto:
                Toast.makeText(this, "Nuevo producto", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnop_buscar:
                Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}