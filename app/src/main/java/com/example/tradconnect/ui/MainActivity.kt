package com.example.tradconnect.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.tradconnect.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        //Carga el primer fragment al abrir la app
        if (savedInstanceState == null) {
            cambiarFragment(InicioFragment())
        }

        //Detecta los clics en el la barra de navegacion
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_inicio -> {
                    cambiarFragment(InicioFragment())
                    true
                }
                /*  R.id.nav_reputacion -> cambiarFragment(ReputacionFragment())
                R.id.nav_reclamos -> cambiarFragment(ReclamosFragment())
                R.id.nav_oportunidades -> cambiarFragment(OportunidadesFragment())
                R.id.nav_perfil -> cambiarFragment(PerfilFragment())*/

                else -> false

            }
        }
    }

    private fun cambiarFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_contenedor, fragment)
            .commit()
    }
}
