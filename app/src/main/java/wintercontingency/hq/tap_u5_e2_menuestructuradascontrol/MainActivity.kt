package wintercontingency.hq.tap_u5_e2_menuestructuradascontrol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaPrincipal.setOnItemClickListener{AdapterView, View, i, l ->
            when(i){
                0 -> {
                    var condiciones = Intent(this, MainActivity2::class.java)

                    startActivity(condiciones)
                }

                1 -> {
                    var ciclos = Intent(this, Ciclos::class.java)

                    startActivity(ciclos)
                }

                2 -> {
                    var converciones = Intent(this, MainActivity3::class.java)

                    startActivity(converciones)
                }

                3 -> {
                    finish()
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menucito, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //equiva a SWITCH CASE em java
        when(item.itemId){
            R.id.opcion1 -> {
                AlertDialog.Builder(this)
                    .setTitle("Acerca de...")
                    .setMessage("Este programa es creado por Daniel")
                    .setPositiveButton("Aceptar"){d, i->}
                    .show()
            }
            R.id.opcion2 -> {
                finish()
            }
        }

        return true
    }
}