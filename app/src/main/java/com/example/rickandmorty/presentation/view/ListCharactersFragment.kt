package com.example.rickandmorty.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rickandmorty.databinding.FragmentListCharactersBinding
import com.example.rickandmorty.domain.model.ListCharacters
import com.example.rickandmorty.presentation.view.adapter.ListCharactersAdapter
import com.example.rickandmorty.presentation.viewmodel.ListCharactersViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListCharactersFragment : Fragment() {

    private var _binding: FragmentListCharactersBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ListCharactersViewModel by viewModel()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getListCharacters()
        resultsObserver()
    }

    private fun resultsObserver() {
        viewModel.listCharacters.observe(viewLifecycleOwner) {
            configRv(it)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListCharactersBinding
            .inflate(inflater, container, false)
        return binding.root
    }

    private fun configRv(modelListCharacters: ListCharacters) {
        val adapter = ListCharactersAdapter(modelListCharacters.responseApi)
        binding.apply {
            rvListCharacters.adapter = adapter
            rvListCharacters.layoutManager = LinearLayoutManager(
                context, GridLayoutManager.VERTICAL, false
            )
        }
    }
}