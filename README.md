# RickAndMortyCleanArch+MVVM

## Sobre
Aplicação utilizando uma API do Rick and Morty, para gerar uma tela com uma lista personagens e uma segunda tela com detalhes de um único personagem da lista.

## Objetivo
- Consumo de uma API;
- Lista de objetos de um endpoint;
- Mostrar esses dados em uma RecyclerView;
- Montar a estrutura do App combinando arquiteturas Clean e Mvvm;
- Mostrar dados em uma outra tela com detalhes do item selecionado na lista da tela inicial

## Ferramentas utilizadas
- Kotlin
- Mvvm + Clean Architecture
- RecyclerView
- API - https://rickandmortyapi.com/documentation/#get-all-characters
- DataBinding 
- Retrofit
- Glide
- Gson
- Koin

## Etapas

### 1ª Etapa
#### Construção da Camada Data
- Criado a pasta api com a interface com o endpoint e o método para realizar a requisição;
- Criado a pasta model com o data class com o que pode ser requisitado no endpoint;
- Criado a pasta datasource com a interface que será utilizada pelo repository e a implementação contém o método para fazer a requisição ao endpoint;
- Criado a pasta repository com a interface que será usado em outras camadas e a implementação com o método que aponta para o datasource, neste caso usando os dados que estão na api.

### 2ª Etapa
#### Construção da Camada Domain
- Criado model com os objetos de domain para a camada de presentation;
- Criado repository com a interface para utilizar em domain;
- Criado usecase com a regra de negócio.

## ScreenShots
