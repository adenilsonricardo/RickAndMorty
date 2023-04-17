package com.example.rickandmorty.domain.repository

import com.example.rickandmorty.domain.model.ListCharacters
import kotlinx.coroutines.flow.Flow

interface RepositoryRickAndMorty {
    suspend fun getListCharacters(): Flow<ListCharacters>
}