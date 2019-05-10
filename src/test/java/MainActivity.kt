import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // esconder o action bar
        supportActionBar?.hide()

        val btnConfirmEntrevista = findViewById<Button>(R.id.fimEntrevista)
        btnConfirmEntrevista.setOnClickListener {

                val menuIntent = Intent(this@MainActivity,
                    MenuActivity::class.java)

                startActivity(menuIntent)

            val text = "Hello toast!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, "Obrigado por participar da entrevista. Seu voto foi no candidato!!", duration)
            toast.show()
            }

        }

    }
}