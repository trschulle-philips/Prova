package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_prova.view.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val i = intent
        if (i != null) {
            val nome = i.extras.getString("nome")
            findViewById<TextView>(R.id.txt).text = nome
        }
    }

    fun carregar(view : View) {
        val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.g1.com.br"))
        if (i.resolveActivity(packageManager) != null) {
            val chooserIntent = Intent.createChooser(i, "Carregar com:")
            startActivity(chooserIntent)
        }
        else {
            Toast.makeText(this, "Não encontro nenhuam intent", Toast.LENGTH_SHORT).show()
        }
    }
    fun enviar(view: View) {
        val i = Intent(this, MenuActivity::class.java)
        i.putExtra("nomePresidentes", findViewById<EditText>(R.id.nomePresisdente).text.toString())
        startActivity(i)
    }
    fun send(view: View) {
        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Texto ou URL a ser compartilhada")
        sendIntent.type = "text/plain"
        startActivity(sendIntent)
        startActivity(sendIntent)

    }
}