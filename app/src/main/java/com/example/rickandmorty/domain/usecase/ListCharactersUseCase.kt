package com.example.rickandmorty.domain.usecase

import com.example.rickandmorty.domain.model.ListCharacters
import com.example.rickandmorty.domain.repository.RepositoryRickAndMorty
import kotlinx.coroutines.flow.Flow

class ListCharactersUseCase(
    private val repository: RepositoryRickAndMorty
) {
    suspend operator fun invoke(): Flow<ListCharacters> {
        return repository.getListCharacters()
    }
}