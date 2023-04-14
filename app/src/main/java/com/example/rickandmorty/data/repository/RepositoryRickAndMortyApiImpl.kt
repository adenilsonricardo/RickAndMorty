package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.datasource.RickAndMortyListCharacterDataSource
import com.example.rickandmorty.data.model.ListCharactersModel
import kotlinx.coroutines.flow.Flow

class RepositoryRickAndMortyApiImpl(
    private val serviceDataSource: RickAndMortyListCharacterDataSource
) : RepositoryRickAndMortyApi {
    override suspend fun getListCharacters(): Flow<ListCharactersModel> {
        return serviceDataSource.getListCharacters()
    }
}