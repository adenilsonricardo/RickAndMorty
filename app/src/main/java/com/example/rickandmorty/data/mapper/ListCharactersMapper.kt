package com.example.rickandmorty.data.mapper

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.rickandmorty.data.model.ListCharactersModel
import com.example.rickandmorty.data.model.ListCharactersModel.Results
import com.example.rickandmorty.domain.model.ListCharacters
import com.example.rickandmorty.domain.model.ListCharacters.Info
import com.example.rickandmorty.domain.model.ListCharacters.ResponseApi
import com.example.rickandmorty.domain.model.ListCharacters.ResponseApi.Location
import com.example.rickandmorty.domain.model.ListCharacters.ResponseApi.Origin
import com.example.rickandmorty.utils.Mapper

@RequiresApi(Build.VERSION_CODES.N)
class ListCharactersMapper: Mapper<ListCharactersModel, ListCharacters> {
    override fun map(source: ListCharactersModel): ListCharacters {
        return ListCharacters(
            info = Info(
                count = source.info.count,
                next = source.info.next,
                prev = source.info.prev,
                pages = source.info.pages
            ),
            responseApi = mapResults(source.results),
        )
    }

    private fun mapResults(objectResults: List<Results>): List<ResponseApi> {
        return objectResults.map {
            ResponseApi(
                created = it.created,
                episode = it.episode,
                gender = it.gender,
                id = it.id,
                image = it.image,
                name = it.name,
                species = it.species,
                status = it.status,
                type = it.type,
                url = it.url,
                location = Location(
                    name = "",
                    url = ""
                ),
                origin = Origin(
                    name = "",
                    url = ""
                )
            )
        }
    }
}