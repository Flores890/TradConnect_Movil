package com.example.tradconnect.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tradconnect.data.Cliente
import com.example.tradconnect.R

class ClienteAdapter(private val listaClientes: List<Cliente>) :
    RecyclerView.Adapter<ClienteAdapter.ClienteViewHolder>()
    {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClienteViewHolder
        {
            val view = LayoutInflater.from( parent  .context    )
                .inflate(R.layout.item_cliente,parent,false)
            return ClienteViewHolder(view)
        }

        override fun onBindViewHolder(holder: ClienteViewHolder, position: Int) {
            val cliente = listaClientes[position]
            holder.bind(cliente)
        }
        class  ClienteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
        {
            val txtNombre: TextView = itemView.findViewById(R.id.txt_nombrecliente)
            val txtDirection: TextView = itemView.findViewById(R.id.txt_direcioncliente)
            val txtFechaPedido: TextView = itemView .findViewById(R.id.txt_fechapedido)

            fun bind(cliente: Cliente){
                txtNombre.text=cliente.nombre
                txtDirection.text=cliente.direccion
                txtFechaPedido.text=cliente.fechaPedido
            }
        }


        override fun getItemCount(): Int= listaClientes.size
    }