package com.example.tradconnect.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tradconnect.R
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import  com.example.tradconnect.data.Cliente


class InicioFragment : Fragment(R.layout.fragment_inicio) {
    override fun onViewCreated(view: View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)


//Datos locales de prueba
        val datosPrueba = listOf(
            Cliente("Distribuidora Central", "Av. Principal #123", "Hace 10 min"),
            Cliente("Comercial los Andes", "Calle 45 #890", "hace 2 horas"),
            Cliente("Abarrotes El sol", "Mz. B Lote 4", "Ayer")
        )

        val recycler = view.findViewById<RecyclerView>(R.id.recycle_clientes)
        recycler?.layoutManager = LinearLayoutManager(requireContext())
        recycler?.adapter = ClienteAdapter(datosPrueba)


    }
}