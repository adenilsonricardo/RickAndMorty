package com.example.rickandmorty.domain.repository

import com.example.rickandmorty.domain.model.ListCharacters
import kotlinx.coroutines.flow.Flow

interface RepositoryRickAndMortyApi {
    suspend fun getListCharacters(): Flow<ListCharacters>
}