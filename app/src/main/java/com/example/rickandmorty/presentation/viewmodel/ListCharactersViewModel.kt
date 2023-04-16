package com.example.rickandmorty.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.domain.model.ListCharacters
import com.example.rickandmorty.domain.usecase.ListCharactersUseCase
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class ListCharactersViewModel(
    private val listCharactersUseCase: ListCharactersUseCase,
    private val coroutinesDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel() {
    val _listCharacters: MutableLiveData<ListCharacters> = MutableLiveData()
    val listCharacters: LiveData<ListCharacters> = _listCharacters

    init {
        getListCharacters()
    }

    fun getListCharacters() {
        viewModelScope.launch {
            listCharactersUseCase()
                .flowOn(coroutinesDispatcher)
                .catch {

                }.collect {
                    _listCharacters.value = it
                }
        }
    }
}
