# RickAndMortyCleanArch+MVVM (em construção)

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
#### Camada Data
- Criado a pasta api com a interface com o endpoint e o método para realizar a requisição;
- Criado a pasta model com o data class com o que pode ser requisitado no endpoint;
- Criado a pasta datasource com a interface que será utilizada pelo repository e a implementação contém o método para fazer a requisição ao endpoint;
- Criado a pasta repository com a interface que será usado em outras camadas e a implementação com o método que aponta para o datasource, neste caso usando os dados que estão na api.

### 2ª Etapa
#### Camada Domain
- Criado model com os objetos de domain para a camada de presentation;
- Criado repository com a interface para utilizar em domain;
- Criado usecase com a regra de negócio.

### 3ª Etapa
#### Layouts
- Utilizado FragmentContainerView na activity_main;
- Criado fragment_list_characters utilizando RecyclerView para a lista de personagens;
- Criado list_characters para definir como serão exibido os personagens, utilizado cardView para colocar os conteudos de cadas personagem;
- Utilizado ConstraintLayout para marcar as posições das ferramentas de layout utilizadas.

### 4ª Etapa
#### Camada presentation
##### Subcamada view
- pasta adapter com a classe adapter para configurar o viewholder e ligar o código aos arquivos xml.
- ListCharactersFragment configurado a exibição do RecyclerView no fragmentContainer e definido um oberver para o LiveData
- MainActivity definido qual a activity principal do app.
##### Subcamada viewmodel
- ListCharactersViewModel definido a função suspensa para a obtenção dos dados requisitados sem afetar a main thread com coroutines

#### Camada de DI
- FeatureModel - instancia de cada modulo da árvore de dependências do Koin para o projeto, a função load carrega essas dependências.
- ListCharactersModule - árvore de dependências do Koin para cada modulo e a definição de modo de requisição.
- MyApp - Configuração do Koin no projeto

## ScreenShots
https://user-images.githubusercontent.com/85114978/232639425-0421fbd1-60b8-4e1a-a2cc-d887cfd6db34.mp4



