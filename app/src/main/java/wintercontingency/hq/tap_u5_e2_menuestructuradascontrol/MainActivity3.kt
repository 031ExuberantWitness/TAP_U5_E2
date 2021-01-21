package wintercontingency.hq.tap_u5_e2_menuestructuradascontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        aplicar.setOnClickListener {
            var opcionSpinner = spinner.selectedItemPosition

            when(opcionSpinner){
                0 -> {
                    var can1 = "919"
                    var valorEntero = Integer.parseInt(can1)

                    valorEntero += 1;

                    editTextResultado.setText("Conversion CAD -> INT ${valorEntero}")
                }

                1 -> {
                    var can2 = "919"
                    var valorDoble = can2.toDouble()

                    editTextResultado.setText("Conversion CAD -> DOUBLE ${valorDoble}")
                }

                2 -> {
                    var valorDec = 29.8
                    var can3 = valorDec.toShort()

                    editTextResultado.setText("Conversion FLOAT -> CAD ${can3}")
                }

                3 -> {
                    var valorEnt = 915
                    var can4 = "Conversion ENT -> CAD" + valorEnt

                    editTextResultado.setText(can4)

                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menuconversion, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //equiva a SWITCH CASE em java
        when(item.itemId){
            R.id.btnLimpiar -> {
                editTextResultado.setText("")
                Toast.makeText(this, "Se limpio los campos de texto/s", Toast.LENGTH_SHORT).show()
            }
            R.id.btnRegresar -> {
                finish()
            }
        }

        return true
    }
}