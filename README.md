<h1> 📖 Course API </h1>

#### Nesse desafio foi desenvolvido uma API fictícia para uma empresa de cursos de programação, onde foi utilizado um CRUD, para criação de cursos.

<br>
<br>

# ✨ Funcionalidades

### 📖 Cursos

✅ Criação de um novo curso

✅ Listagem de todos os cursos(ativos)

✅ Atualização de um curso pelo id

✅ Atualização do estado de um curso

✅ Remover um curso pelo id

<br>
<br>

# ⚙️ Utilizando Localmente

<br>

- Clone o repositório.

- Dentro de main/resources crie um arquivo `application.properties` com a informacoes seguindo o padrão do `application.properties.example`

- Instale as dependências necessárias usando `maven`.

- Execute o arquivo da docker usando `docker compose up`.

  <strong>OBS: E necessário ter a docker instalada no computador.</strong>

- Execute a aplicação usando `mvn spring-boot:run`.

<br>

# 📡 Endpoints da API

### Os seguintes endpoints estão disponíveis:

## 📖 Course- Endpoints

- #### Criação de um novo curso.

  <p>Método: <strong>POST</strong> <p> 
  <p>rota: <strong>/course/create</strong> </p>

#### <p>Requisição:</p>

```
 {
  name: "course-name",
  category:"course-category"
 }
```



<hr>

- #### Listagem de todos os cursos(ativos)

  <p>Método: <strong>GET</strong> <p> 
  <p>rota: <strong>/course?search</strong> </p>

##### OBS: Nesta rota é possível filtrar pelo nome ou categoria


<hr>

- #### Atualização de um curso.

  <p>Método: <strong>PUT</strong> <p> 
  <p>rota: <strong>/course/:courseId</strong> </p>

  ##### OBS: Todos os parâmetros que esta rota pode receber são opcionais

#### <p>Requisição:</p>

```
 {
  name: "course-name",
  category:"course-category"
 }

```

<hr>

- #### Atualização do estado de um curso.

  <p>Método: <strong>PATCH</strong> <p> 
  <p>rota: <strong>/course/:courseId/active</strong> </p>



<br>

<hr>

- #### Remover um curso.

  <p>Método: <strong>DEL</strong> <p> 
  <p>rota: <strong>/course/:courseId</strong> </p>



<br>

<hr>

# Tecnologias Utilizadas

- [Java 21](https://www.java.com/en/)
- [SpringBoot Web](https://spring.io/)
- [PostgreSQL](https://www.postgresql.org/)
- [Docker](https://docs.docker.com/)

<br>

#### O arquivo client.http é um arquivo utilizado para fazer todas as possíveis chamadas para a API. Para utiliza-lo, basta ter a extensão [RestClient](https://marketplace.visualstudio.com/items?itemName=humao.rest-client)

<hr>

## Contribuidores

| Nome                                                            | Papel                 |
| --------------------------------------------------------------- | --------------------- |
| [Eduardo N Gomes](https://www.linkedin.com/in/eduardo-n-gomes/) | Back-End  |
