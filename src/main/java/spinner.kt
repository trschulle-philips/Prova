package com.example.myapplication

import java.util.ArrayList
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import android.widget.AdapterView.OnItemSelectedListener

internal class AndroidSpinnerExampleActivity : Activity(), OnItemSelectedListener {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        // Spinner element
        val spinner = findViewById(R.id.spinner) as Spinner

        // Spinner click listener
        spinner.onItemSelectedListener = this

        // Spinner Drop down elements
        val escalaridade = ArrayList<String>()
        escalaridade.add("Analfabeto")
        escalaridade.add("Ensino Médio")
        escalaridade.add("Graduação")
        escalaridade.add("Pós Graduação")

        // Creating adapter for spinner
        val dataAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // attaching data adapter to spinner
        spinner.adapter = dataAdapter
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
        // On selecting a spinner item
        val item = parent.getItemAtPosition(position).toString()

        // Showing selected spinner item
        Toast.makeText(parent.context, "Selected: $item", Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(arg0: AdapterView<*>) {
        // TODO Auto-generated method stub
    }
}