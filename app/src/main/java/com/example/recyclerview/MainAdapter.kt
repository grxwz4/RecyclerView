package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.databinding.ItemCardBinding
import org.json.JSONObject

class MainAdapter(private val perfiles: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(perfiles[position])
    }

    override fun getItemCount(): Int = perfiles.size

    class MainHolder(val binding: ItemCardBinding): RecyclerView.ViewHolder(binding.root){
        fun render(video: JSONObject){
            binding.txUser.setText(video.getString("user"))
            binding.txStatus.setText(video.getString("status"))
            binding.imPerfil.setImageResource(R.drawable.perfil_placeholder)
            binding.btOcultar.setImageResource(R.drawable.x_placeholder)
        }
    }
}