package com.example.rickandmorty.data.datasource

import com.example.rickandmorty.data.model.ListCharactersModel
import kotlinx.coroutines.flow.Flow

interface RickAndMortyListCharacterDataSource {
    suspend fun getListCharacters() : Flow<ListCharactersModel>
}