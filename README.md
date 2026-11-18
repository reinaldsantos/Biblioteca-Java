
# BiblioEscola

Sistema de Gestão de Biblioteca Escolar desenvolvido em Java com Jakarta EE.

## Objetivo

O BiblioEscola permite gerir livros, autores, categorias, leitores, empréstimos e reservas de uma biblioteca escolar.

## Tecnologias

- Java 21 LTS
- Jakarta EE 11
- Apache Maven
- WildFly 42.0.0.Final
- Servlets, JSP, JPA, EJB, JAX-RS, JSF, WebSocket, JMS e SOAP
- HTML, CSS e JavaScript
- Base de dados relacional (a configurar nas próximas etapas)

## Funcionalidades previstas

### Leitor

- Pesquisar livros por título, autor e categoria
- Consultar disponibilidade
- Reservar livros
- Consultar os seus empréstimos e prazos de devolução

### Bibliotecário

- Gerir o catálogo de livros
- Registar empréstimos e devoluções
- Consultar empréstimos em atraso
- Gerir autores e categorias

## Regras de negócio

- Cada leitor pode ter no máximo 3 empréstimos ativos.
- O prazo de empréstimo é de 15 dias.
- Leitores com empréstimos em atraso não podem realizar novos empréstimos ou reservas.
- Apenas livros disponíveis podem ser reservados.
- As reservas expiram após 48 horas.
- Cada livro deve possuir um ISBN único de 13 dígitos.

## Estrutura do projeto

```text
biblioescola/
├── pom.xml
├── README.md
├── .gitignore
├── docs/
│   └── arquitetura.md
├── src/
│   └── main/
│       └── java/
│           └── pt/
│               └── biblioescola/
│                   └── HelloServlet.java
└── target/  (gerado pelo Maven)
```

## Executar o projeto

### 1. Compilar

```bash
mvn clean package
```

### 2. Iniciar o WildFly

```bash
bash ~/tools/wildfly-42.0.0.Final/bin/standalone.sh
```

### 3. Publicar a aplicação

Com o WildFly em execução, abrir outro terminal:

```bash
cp target/biblioescola.war ~/tools/wildfly-42.0.0.Final/standalone/deployments/
```

### 4. Testar o endpoint

Abrir no navegador:

http://localhost:8080/biblioescola/api/estado

Resposta esperada:

```text
Hello World! BiblioEscola funcionando!
```

## Arquitetura

A arquitetura planeada está documentada em [docs/arquitetura.md](docs/arquitetura.md).

## Estado do desenvolvimento

- [x] Etapa 1 — Estrutura Maven e endpoint inicial (documentação em conclusão)
- [ ] Etapa 2 — Interface HTML, CSS e JavaScript
- [ ] Etapa 3 — Servlets, JSP e sessões
- [ ] Etapa 4 — JPA e persistência
- [ ] Etapa 5 — EJB e regras de negócio
- [ ] Etapa 6 — API REST
- [ ] Etapa 7 — JSF e WebSocket
- [ ] Etapa 8 — JMS
- [ ] Etapa 9 — SOAP
- [ ] Etapa 10 — Autenticação e autorização

## Autor

Projeto académico desenvolvido no âmbito do curso de Programador de Informática.
