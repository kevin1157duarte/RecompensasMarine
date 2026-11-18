# ☠️ Recompensas Marine

### 🏴‍☠️ Sistema de gerenciamento de piratas e recompensas — One Piece

## 📖 Sobre o projeto

O **Recompensas Marine** é um projeto de estudos desenvolvido em **Java com Spring Boot**, inspirado no universo do anime *One Piece*.

A ideia é criar uma API REST para gerenciar informações de piratas, permitindo futuramente cadastrar, consultar, atualizar e remover personagens e suas respectivas recompensas.

O projeto tem como principal objetivo colocar em prática meus conhecimentos de desenvolvimento backend, explorando a organização de uma aplicação Spring Boot, a criação de APIs e a integração com bancos de dados.

Mais do que desenvolver uma aplicação funcional, este repositório também representa meu processo de aprendizado e evolução como desenvolvedor Java.

## 🎯 Objetivos de aprendizado

- Compreender a estrutura e o funcionamento do Spring Boot.
- Desenvolver APIs REST utilizando Java.
- Praticar programação orientada a objetos.
- Compreender a separação de responsabilidades entre Controller, Service e Repository.
- Aprender a utilizar o Spring Data JPA.
- Trabalhar com persistência de dados.
- Desenvolver operações CRUD (criar, consultar, atualizar e excluir registros).

## 🛠️ Tecnologias utilizadas

- **Java 25** — Linguagem principal.
- **Spring Boot 4.1.2** — Framework para desenvolvimento da aplicação.
- **Spring Web MVC** — Desenvolvimento de controladores e rotas HTTP.
- **Spring Data JPA** — Camada de persistência de dados.
- **H2 Database** — Banco de dados incluído nas dependências do projeto.
- **Maven** — Gerenciamento de dependências e construção.
- **Lombok** — Biblioteca adicionada ao projeto.
- **IntelliJ IDEA** — Ambiente de desenvolvimento.

## 🏗️ Estrutura do projeto

O projeto está sendo organizado em camadas:

| Camada | Responsabilidade |
|---|---|
| Model | Representação dos dados dos piratas. |
| Controller | Recebimento das requisições HTTP. |
| Service | Implementação das regras de negócio. |
| Repository | Comunicação com a camada de persistência. |

### 🏴‍☠️ Entidade Pirata

A entidade `Pirata` possui os seguintes atributos:

| Atributo | Descrição |
|---|---|
| id | Identificador do pirata. |
| name | Nome do personagem. |
| poder | Habilidade ou poder do pirata. |
| Recompensa | Valor da recompensa. |
| idade | Idade do personagem. |

## 🚧 Status do desenvolvimento

**Em desenvolvimento — projeto de estudos.**

A estrutura inicial da aplicação e as principais camadas já foram criadas. A implementação das funcionalidades ainda está em andamento.

### Etapas do projeto

- [x] Criar o projeto Spring Boot.
- [x] Configurar as dependências iniciais.
- [x] Criar a entidade Pirata.
- [x] Criar a interface PirataRepository.
- [x] Estruturar as classes Controller e Service.
- [ ] Finalizar a comunicação entre as camadas.
- [ ] Implementar a consulta de piratas.
- [ ] Implementar o cadastro de piratas.
- [ ] Implementar a atualização de registros.
- [ ] Implementar a exclusão de registros.
- [ ] Configurar e validar a persistência de dados.
- [ ] Executar e validar os testes da aplicação.

## 📚 Considerações finais

Este projeto faz parte da minha jornada de aprendizado em desenvolvimento backend com Java.

As implementações serão realizadas gradualmente, conforme avanço nos estudos de Spring Boot, APIs REST e persistência de dados.

O repositório será atualizado para registrar essa evolução, incluindo melhorias, novas funcionalidades e refatorações.

---

**Projeto educacional inspirado no universo de One Piece. Sem vínculo oficial com a obra.**
