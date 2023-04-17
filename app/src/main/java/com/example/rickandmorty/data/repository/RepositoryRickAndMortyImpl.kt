package com.example.rickandmorty.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.rickandmorty.data.datasource.RickAndMortyListCharacterDataSource
import com.example.rickandmorty.data.mapper.ListCharactersMapper
import com.example.rickandmorty.domain.model.ListCharacters
import com.example.rickandmorty.domain.repository.RepositoryRickAndMorty
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RepositoryRickAndMortyImpl(
    private val serviceDataSource: RickAndMortyListCharacterDataSource,
    private val listCharactersMapper: ListCharactersMapper
) : RepositoryRickAndMorty {
    @RequiresApi(Build.VERSION_CODES.N)
    override suspend fun getListCharacters(): Flow<ListCharacters> {
        return serviceDataSource.getListCharacters().map(listCharactersMapper::map)
    }
}