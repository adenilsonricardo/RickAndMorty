package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.model.ListCharactersModel
import kotlinx.coroutines.flow.Flow

interface RepositoryRickAndMortyApi {
    fun getListCharacters(): Flow<ListCharactersModel>
}