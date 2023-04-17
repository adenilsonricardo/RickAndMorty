package com.example.rickandmorty.di

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.rickandmorty.data.datasource.RickAndMortyListCharacterDataSource
import com.example.rickandmorty.data.datasource.RickAndMortyListCharacterDataSourceImpl
import com.example.rickandmorty.data.mapper.ListCharactersMapper
import com.example.rickandmorty.data.repository.RepositoryRickAndMortyImpl
import com.example.rickandmorty.domain.repository.RepositoryRickAndMorty
import com.example.rickandmorty.domain.usecase.ListCharactersUseCase
import com.example.rickandmorty.presentation.viewmodel.ListCharactersViewModel
import com.example.rickandmorty.utils.RetrofitService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal class ListCharactersModule : FeatureModule() {

    @RequiresApi(Build.VERSION_CODES.N)
    override val dataModule = module {
        factory { RetrofitService.service }

        factory<RickAndMortyListCharacterDataSource> {
            RickAndMortyListCharacterDataSourceImpl(
                apiService = get()
            )
        }

        factory<RepositoryRickAndMorty> {
            RepositoryRickAndMortyImpl(
                serviceDataSource = get(),
                listCharactersMapper = get()
            )
        }
        factory { ListCharactersMapper() }
    }

    override val domainModule = module {
        factory { ListCharactersUseCase(repository = get()) }
    }

    override val presentationModule = module {
        viewModel {
            ListCharactersViewModel(
                listCharactersUseCase = get()
            )
        }
    }
}