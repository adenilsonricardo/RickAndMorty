package com.example.rickandmorty.data.datasource

import com.example.rickandmorty.data.api.RickAndMortyApi
import com.example.rickandmorty.data.model.ListCharactersModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RickAndMortyListCharacterDataSourceImpl(
    private val apiService: RickAndMortyApi
) : RickAndMortyListCharacterDataSource {
    override suspend fun getListCharacters(): Flow<ListCharactersModel> {
        return flow{
            emit(
                apiService.getListCharacters()
            )}
    }
}