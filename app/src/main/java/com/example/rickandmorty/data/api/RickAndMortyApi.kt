package com.example.rickandmorty.data.api

import com.example.rickandmorty.data.api.RickAndMortyApi.PatchConstants.LISTCHARACTERS
import com.example.rickandmorty.data.model.ListCharactersModel
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET(LISTCHARACTERS)

    suspend fun listCharacters(): ListCharactersModel

    object PatchConstants{
        const val LISTCHARACTERS = "character"
    }
}