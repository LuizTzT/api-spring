# API Spring Boot 🌱

Bem-vindo ao Meu Projeto Spring Boot! Este é um projeto pessoal onde eu exploro a criação de uma API usando o Spring Boot e o banco de dados MySQL.

## Tecnologias Utilizadas 💻

- Spring Boot
- Spring Data JPA
- MySQL
- Maven

## Sobre o Projeto 📖

Este projeto tem como objetivo servir como playground para mim, onde eu posso praticar a criação de APIs com o Spring Boot e a integração com o banco de dados MySQL. Aqui, vou explorar os principais conceitos, como controladores, modelos, serviços e configurações.

## Endpoints da API 🌐

`@PostMapping("/api")`: Cria uma nova pessoa. Recebe um objeto Person no corpo da solicitação.

`@GetMapping("/api")`: Retorna todas as pessoas existentes.

`@GetMapping("/api/{id}")`: Retorna os detalhes de uma pessoa pelo ID fornecido.

`@PutMapping("/api")`: Atualiza os detalhes de uma pessoa. Recebe um objeto Person no corpo da solicitação.

`@DeleteMapping("/api/{id}")`: Exclui uma pessoa pelo ID fornecido.

`@GetMapping("/api/count")`: Retorna o número total de elementos (pessoas) na base de dados.

`@GetMapping("/api/orderByName")`: Retorna uma lista de pessoas ordenadas por nome.

`@GetMapping("/api/orderByAgeDesc")`: Retorna uma lista de pessoas com nome "Renata" ordenadas por idade descendente.

`@GetMapping("/api/containing")`: Retorna uma lista de pessoas com nome contendo "br".

`@GetMapping("/api/starts")`: Retorna uma lista de pessoas cujos nomes começam com "re".

`@GetMapping("/api/ends")`: Retorna uma lista de pessoas cujos nomes terminam com "o".

`@GetMapping("/api/sumAges")`: Retorna a soma das idades de todas as pessoas.

`@GetMapping("/api/equalOrHigher")`: Retorna uma lista de pessoas com idade igual ou maior que 30.

`@GetMapping("/message")`: Retorna uma mensagem "Hello World!".

`@GetMapping("/welcome/{name}")`: Retorna uma mensagem de boas-vindas com o nome fornecido.

`@PostMapping("/pessoa")`: Recebe um objeto Person no corpo da solicitação e o retorna.

`@PostMapping("/client")`: Recebe um objeto Client no corpo da solicitação. Neste caso, o método não tem implementação.


