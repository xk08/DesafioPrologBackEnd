# 🚀 Desafio Prolog App | Serviço de Back-end / API

> API desenvolvida em **Java** e **Spring Boot** para listar pneus. Essa API será utilizada por um aplicativo Android/Flutter.

----------

## 📌 Funcionalidades

✅ Apresenta uma lista completa de pneus, contendo:

-   **Identificador (ID)**
    
-   **Marca**
    
-   **Modelo**
    
-   **Tamanho**
    
-   **Preço**
    
-   **Imagem** (URL da internet)
    

✅ Permite buscar informações de um pneu específico pelo **ID**.

----------

## 📂 Estrutura e Organização

📌 Aplicação baseada em boas práticas, utilizando:

-   **Clean Code** e **SOLID**
    
-   **Clean Architecture**, separando responsabilidades em:
    
    -   `application` 📦 Lógica da aplicação
        
    -   `domain` 🏗️ Regras de negócio
        
    -   `infra` 🔌 Integrações e infraestrutura
        

----------

## 🛠️ Tecnologias Utilizadas

-   **Spring Boot** 4 🚀
    
-   **Java** 21 ☕
    
-   **PostgreSQL** 🐘
    
-   **Flyway** 🛠️
    
-   **Lombok** 1.18.36 🔧
    
-   **Docker** 27.5.1 🐳
    
-   **Postman** (testes de API) 📬
    

----------

## ⚙️ Como Instalar e Executar

### 📥 Clonando o repositório:

```
 git clone https://github.com/xk08/DesafioPrologBackEnd.git
 cd DesafioPrologBackEnd
```

💡 **Importante:** O projeto exige que o **PostgreSQL** esteja rodando no **Docker**. Certifique-se de que o **Docker** está instalado e configurado corretamente.

### 🐳 Executar utilizando Docker (Recomendado)

```
docker-compose up --build
```

Isso irá subir **um container com duas imagens**:

-   🌐 **Servidor Web** rodando na porta `8080`
    
-   🗄️ **Banco de Dados PostgreSQL** na porta `5432`
    

⚡ **Dica DEV:** Essa é a maneira mais rápida de rodar o projeto. 😉

### 💻 Executar via IDE (Exemplo: Eclipse)

1.  **Abra o projeto na IDE**
    
2.  **Execute** (Run)
    

🔴 **Atenção:** Se o **servidor Docker** já estiver rodando na porta `8080`, será necessário encerrá-lo ou alterar a porta do servidor manualmente:

-   **No arquivo** `application.properties`, altere a porta 8080 para:
    
    ```
    server.port=8081
    ```
    
    Isso evitará conflitos ao rodar a API via IDE.
    

----------

## 🔗 Endpoints Disponíveis

📌 A API expõe os seguintes endpoints:

📥 **Listar todos os pneus:**

```
GET http://localhost:8080/api/tires
```

🔹 **Retorno:** Lista de objetos JSON

📥 **Buscar um pneu por ID:**

```
GET http://localhost:8080/api/tires/{id}
```

🔹 **Retorno:** Um objeto JSON correspondente

----------