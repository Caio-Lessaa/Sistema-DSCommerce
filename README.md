# 🛒 dscommerce

Projeto de API REST para um sistema de e-commerce desenvolvido em Java com Spring Boot. A aplicação permite realizar operações CRUD (Create, Read, Update, Delete) sobre várias entidades do domínio como produtos, categorias, usuários e pedidos. Além disso possui um tratamento global de exceções.

## 🚀 Tecnologias utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database (banco em memória)
- Maven

## 🧾 Funcionalidades
- CRUD de Produtos  
- CRUD de Categorias  
- CRUD de Pedidos  
- Relacionamento entre pedidos e usuários  
- Tratamento de exceções com ControllerExceptionHandler

## 🛑 Tratamento global de exceções
A classe ControllerExceptionHandler está anotada com @ControllerAdvice, que permite interceptar exceções lançadas por qualquer controller da aplicação e retornar uma resposta personalizada para o cliente. Isso garante que os erros sejam tratados de forma consistente e profissional.

## 🧰 Endpoints
Exemplos de endpoints disponíveis:

GET /products

GET /products/{id}

POST /products

PUT /products/{id}

DELETE /products/{id}

## 📌 Observações
- A aplicação é baseada em Spring Boot
- As entidades estão mapeadas com JPA/Hibernate
- O projeto foi desenvolvido como parte de um curso de Spring com foco em backend