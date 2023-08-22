package com.example.uygulamaseansi5.soru2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.uygulamaseansi5.databinding.ListelerItemBinding

class ListelerAdapter (private val List: List<Listeler>,val onclick : (Listeler) -> Unit ) :
RecyclerView.Adapter<ListelerAdapter.ListelerViewHolder>() {

    inner class ListelerViewHolder(val binding: ListelerItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListelerViewHolder {
        val binding = ListelerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListelerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return List.size
    }

    override fun onBindViewHolder(holder: ListelerViewHolder, position: Int) {
        val liste = List[position]
        val binding = holder.binding
        binding.cardTextViewAd.text = liste.Ad

        binding.cardNextTextView.setOnClickListener {
            onclick.invoke(liste)



        }
    }
}
