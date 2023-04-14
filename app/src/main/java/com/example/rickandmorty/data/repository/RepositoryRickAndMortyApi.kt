package com.example.rickandmorty.data.repository

import com.example.rickandmorty.domain.model.ListCharacters
import kotlinx.coroutines.flow.Flow

interface RepositoryRickAndMortyApi {
    suspend fun getListCharacters(): Flow<ListCharacters>
}