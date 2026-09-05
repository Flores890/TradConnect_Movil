package com.example.tradconnect

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.tradconnect.ui.MainActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        /*Permite ver primero el splash screen y  luego el login*/

        installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val correo = findViewById<EditText>(R.id.edtxt_correo)
        val contrasenia = findViewById<EditText>(R.id.edtxt_contrasena)
        val acceder = findViewById<Button>(R.id.btn_acceder)

        acceder.setOnClickListener{
            val mail= correo.text.toString()
            val password= contrasenia.text.toString()

            if (mail == "arlen23@gmail.com" && password =="262608"){
                val ventana = Intent(
                    this, MainActivity::class.java
                )
                startActivity(ventana)
            }else{
                Toast.makeText(this,"Usuario o contraseña incorrecto", Toast.LENGTH_SHORT).show()
            }
        }

    }
}