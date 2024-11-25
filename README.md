
# Challenge: CRUD de Clientes com Spring Boot

Este é um projeto de exemplo para um sistema de gerenciamento de clientes, desenvolvido com **Spring Boot**, que implementa operações básicas de CRUD (Criar, Ler, Atualizar e Deletar). O objetivo principal é demonstrar o uso de boas práticas no desenvolvimento de uma API RESTful e reforçar conceitos importantes do framework.

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3** (Spring Data JPA, Spring Web)
- **Hibernate** para persistência de dados
- **H2 Database** (banco de dados em memória)
- **Maven** como gerenciador de dependências

## 📦 Funcionalidades

O sistema permite:

1. **Adicionar um novo cliente**:
   - Informar nome, cpf, renda, data de nascimento e quantidade de filhos.
2. **Listar clientes**:
   - Exibir todos os clientes cadastrados.
3. **Buscar cliente por ID**:
   - Obter detalhes de um cliente específico.
4. **Atualizar informações de um cliente**:
   - Alterar os dados de um cliente existente.
5. **Deletar um cliente**:
   - Remover permanentemente um cliente do banco de dados.

## 🛠️ Como Executar o Projeto

### Pré-requisitos

- [Java 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) instalado.
- [Maven](https://maven.apache.org/install.html) configurado.
- Um IDE de sua preferência (como IntelliJ IDEA ou Eclipse).

### Passos para execução

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/andrezktt/challenge_client-crud_spring.git
   cd challenge_client-crud_spring
   ```

2. **Compile o projeto**:
   ```bash
   mvn clean install
   ```

3. **Execute a aplicação**:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação em: [http://localhost:8080](http://localhost:8080)

## 🗂️ Estrutura do Projeto

```plaintext
src/main/java/com/example/clientcrud
├── controllers    # Controladores REST
├── dtos           # Data Transfer Objects (DTOs)
├── entities        # Entidades JPA
├── repositories    # Interfaces de Repositórios (JPA Repository)
├── services        # Lógica de Negócio
└── exceptions      # Tratamento de Exceções
```

## 🔄 Rotas da API

| Método | Endpoint         | Descrição                          | Exemplo de Payload               |
|--------|-------------------|------------------------------------|-----------------------------------|
| GET    | `/clients`        | Lista todos os clientes.           | -                                 |
| GET    | `/clients/{id}`   | Retorna um cliente pelo ID.        | -                                 |
| POST   | `/clients`        | Cria um novo cliente.              | `{"name": "João", "cpf": "12345678901", "income": 6500.0, "birthDate": "1990-01-01", "children": 3}` |
| PUT    | `/clients/{id}`   | Atualiza informações de um cliente.| `{"name": "Maria", "cpf": "10987654321", "income": 8400.0, "birthDate": "1995-03-22", "children": 1}` |
| DELETE | `/clients/{id}`   | Remove um cliente pelo ID.         | -                                 |


## 📝 Licença

Este projeto é open-source e está sob a licença [MIT](LICENSE).

---

**Desenvolvido por [André Zicatti](https://github.com/andrezktt)** ❤️