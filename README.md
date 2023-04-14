# RickAndMorty

## Sobre
Aplicação utilizando uma API do Rick and Morty, para gerar uma tela com uma lista de personagens através do endpoint.

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
- Criado a pasta repositor com a interface que será usado em outras camadas e a implementação com o método que fará a requisição.

## ScreenShots
