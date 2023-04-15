package com.example.rickandmorty.utils

interface Mapper <S,T>{
    fun map(source: S): T
}