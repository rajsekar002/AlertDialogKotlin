package com.androindian.alertdialogkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        alertdialog.setOnClickListener {
            val alertDialog=AlertDialog.Builder(this@MainActivity)
            alertDialog.setTitle("Hello Good Morining")
            alertDialog.setMessage("How are you")

            //positive
            alertDialog.setPositiveButton("YES"){
                dialog, which ->
                Toast.makeText(this@MainActivity,"YES",Toast.LENGTH_LONG).show()
            }
            //negative
            alertDialog.setNegativeButton("NO"){
                dialog, which ->
                Toast.makeText(this@MainActivity,"NO",Toast.LENGTH_LONG).show()
            }
            //nutral
            alertDialog.setNeutralButton("Cancel"){
                dialog, which ->
                Toast.makeText(this@MainActivity,"Cancel",Toast.LENGTH_LONG).show()
            }

            alertDialog.show()
        }
    }
}
