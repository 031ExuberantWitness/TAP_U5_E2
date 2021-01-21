package wintercontingency.hq.tap_u5_e2_menuestructuradascontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ciclos.*

class Ciclos : AppCompatActivity() {
    var cadena = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclos)

        btnRegresar.setOnClickListener {
            finish()
        }

        cicloFor.setOnClickListener {
            cadena = ""

            for(i in 1..100 ){
                cadena += i.toString() + " - ";
            }

            textView.setText(cadena)
        }

        cicloWhile.setOnClickListener {
            cadena = ""
            var i = 0;

            while(i<=100){
                i += 2
                cadena += i.toString() + " - ";
            }

            textView.setText(cadena)
        }
    }
}