package com.example.rickandmorty.presentation.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rickandmorty.databinding.ListCharactersBinding
import com.example.rickandmorty.domain.model.ListCharacters

class ListCharactersAdapter(
    var listCharacters: List<ListCharacters.ResponseApi>
) : RecyclerView.Adapter<ListCharactersAdapter.ViewHolder>() {

    class ViewHolder(val binding: ListCharactersBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(objectListCharacters: ListCharacters.ResponseApi) {
            with(binding) {
                nameListCharacters.text = objectListCharacters.name
                speciesListCharacters.text = objectListCharacters.species
                genderListCharacters.text = objectListCharacters.gender
                statusListCharacters.text = objectListCharacters.status
                Glide.with(root.context)
                    .load(objectListCharacters.image)
                    .into(imageListCharaters)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(
            ListCharactersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val objectListCharacters = listCharacters[position]
        holder.onBind(objectListCharacters)
    }

    override fun getItemCount(): Int {
        return listCharacters.size
    }

    //@SuppressLint("NotifyDataSetChanged")
    fun updateList(newList: MutableList<ListCharacters.ResponseApi>) {
        listCharacters = newList
        notifyDataSetChanged()
    }
}