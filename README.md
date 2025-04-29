# CRUD API 📝

Projeto desenvolvido com Java e Spring Boot. A aplicação é focada na gestão de pessoas, com funcionalidades de CRUD. Utiliza o banco de dados PostgreSQL para persistência de dados e Spring Data JPA para o gerenciamento da camada de dados.

## Tecnologias Utilizadas

- Java 21
- Spring Boot
- Postman
- PostgreSQL (para persistência de dados)
- Spring Data JPA (para interação com o banco de dados)
- Maven (para gerenciamento de dependências)


## Funcionalidades

- CRUD de Produtos: Criação, leitura, atualização e exclusão de produtos na aplicação.
- Persistência com PostgreSQL: Armazenamento de dados no banco de dados PostgreSQL utilizando Spring Data JPA.

## Como Rodar o Projeto
### Pré-requisitos
- Java 17+ instalado
- Maven instalado
- PostgreSQL configurado localmente ou remotamente

## Estrutura do Projeto
O projeto segue a seguinte estrutura básica:

```
src/main/java/com/example/demo  
  ├── controller      # Contém os controladores da API  
  ├── model           # Modelo de dado, como Usuário  
  ├── repository      # Repositório para acessar o banco de dados  
  ├── service         # Lógica de negócios
````

