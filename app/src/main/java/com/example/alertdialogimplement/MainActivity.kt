package com.example.alertdialogimplement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.alertDialog1)
        val btn2 = findViewById<Button>(R.id.alertDialog2)
        val btn3 = findViewById<Button>(R.id.alertDialog3)

        val dialog1 = AlertDialog.Builder(this)
            .setTitle("This is the title")
            .setMessage("Just click on yes or No")
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(
                    this,
                    "clicked on Yes",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "clicked on No",
                    Toast.LENGTH_SHORT
                ).show()
            }
            .create()

        btn1.setOnClickListener{
            dialog1.show()
        }

    }
}