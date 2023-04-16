package com.example.rickandmorty.di

import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

abstract class FeatureModule {

    protected open val dataModule: Module = module { }

    protected open val domainModule: Module = module { }

    protected open val presentationModule: Module = module { }

    protected open val additionalModule: List<Module> = emptyList()

    fun load() {
        val defaultModule = listOf(
            dataModule,
            domainModule,
            presentationModule
        )
        loadKoinModules(defaultModule + additionalModule)
    }
}