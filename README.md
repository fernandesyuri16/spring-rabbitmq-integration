# Fila de pagamento com Java + Rabbit

## Descrição
Este projeto demonstra a integração de microserviços utilizando Spring Boot 3, RabbitMQ e Docker.
O objetivo é criar um sistema de pagamento simulado que utiliza mensagens assíncronas para melhorar a eficiência e resiliência da comunicação entre serviços.

## Tecnologias Utilizadas
- **Spring Boot 3**: Framework para desenvolvimento de aplicações Java.
- **RabbitMQ**: Sistema de mensageria para comunicação assíncrona entre serviços.
- **Docker**: Plataforma para criar, implantar e executar aplicações em contêineres.

## Pré-requisitos
- Java 17 ou superior
- Docker
- Maven

## Instalação
1. Clone o repositório:
   ```bash
   https://github.com/fernandesyuri16/spring-rabbitmq-integration
2. Navegue até o repositório:
   ```bash
   cd seurepositorio
3. Compile o projeto usando Maven:
  ```bash 
  mvn clean install
  ```
4. Inicie o Docker:
  ```bash
docker compose up
  ```

O RabbitMQ estará acessível em http://localhost:15672 (usuário: guest, senha: guest).

## Execução
Para executar o projeto, utilize o comando:

```
mvn spring-boot:run
```

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.
