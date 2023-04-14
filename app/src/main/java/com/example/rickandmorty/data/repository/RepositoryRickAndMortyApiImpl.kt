package com.example.rickandmorty.data.repository

import com.example.rickandmorty.data.api.RickAndMortyApi
import com.example.rickandmorty.data.model.ListCharactersModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RepositoryRickAndMortyApiImpl(
    private val serviceApi: RickAndMortyApi
) : RepositoryRickAndMortyApi {
    override fun getListCharacters(): Flow<ListCharactersModel> {
        return flow {
            emit(serviceApi.getListCharacters())
        }
    }
}