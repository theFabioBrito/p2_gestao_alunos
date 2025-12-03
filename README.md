# Sistema de Gestão de Alunos - Spring Boot

Mini-Projeto desenvolvido como atividade avaliativa da disciplina de Java, utilizando o framework Spring Boot e o padrão MVC, integrando persistência de dados com banco H2.

---

## 👨‍🎓 Objetivo do Projeto

O objetivo do projeto é desenvolver uma aplicação web em Java para gerenciamento de alunos e cursos, permitindo:

- Cadastro de cursos
- Cadastro de alunos vinculados a um curso
- Listagem de alunos e cursos
- Validações de dados
- Persistência em banco de dados
- Navegação via navegador

---

## ⚙️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database
- Thymeleaf
- Maven
- HTML, CSS e JavaScript
- Hibernate Validator

---

## 🏗️ Arquitetura do Projeto (Padrão MVC)

O projeto segue rigorosamente o padrão **MVC**:

### 🔹 Model (Modelos)
Localizados em:
```
model
 ├── Aluno.java
 ├── Curso.java
```
Responsáveis pelas entidades do sistema:

- `Aluno.java`
- `Curso.java`

Utilizam:
- JPA para mapeamento de tabelas
- Anotações de validação (`@NotNull`, `@Email`, `@Min`, etc.)

---

### 🔹 Repository (Persistência)
Localizados em:
```
repository
 ├── AlunoRepository.java
 ├── CursoRepository.java
```

Responsáveis pelo acesso ao banco de dados:

- `AlunoRepository`
- `CursoRepository`

Ambos estendem `JpaRepository`.

---

### 🔹 Controller (Controle de rotas)
Localizados em:
```
controller
 ├── AlunoController.java
 ├── CursoController.java
 ├── HomeController.java
```

Controlam as rotas da aplicação:

- `HomeController`
- `AlunoController`
- `CursoController`

São responsáveis por:
- Receber requisições HTTP
- Retornar páginas HTML
- Enviar dados para as views
- Processar cadastros
- Controlar redirecionamentos

---

### 🔹 View (Thymeleaf)
Localizadas em:
```
templates
 ├── home.html
 ├── alunos
 │   ├── form.html
 │   └── lista.html
 ├── cursos
 │   ├── form.html
 │   └── lista.html
 ├── home.html
```

Cada entidade possui:
- Tela de cadastro
- Tela de listagem

---

### 🎨 Arquivos Estáticos (CSS e JS)

Localizados em:
```
static
 ├── js
 │   ├── index.js
 │   └── transitions.js
 ├── styles
 │   ├── index.css
 │   ├── form.css
 │   └── home.css
```

Responsáveis por:
- Estilização
- Animações
- Toasts de sucesso e erro
- Transições visuais

---

## 🚦 Rotas do Sistema

### Home:
```
/
```

---

### Alunos:
```
/alunos
/alunos/novo
```

Funções:
- Cadastro
- Listagem
- Validação de dados
- Associação a curso

---

### Cursos:
```
/cursos
/cursos/novo
```

Funções:
- Cadastro
- Listagem
- Validação de nome único

---

## 🗄️ Banco de Dados

Banco utilizado:

- H2 (em memória)

Configuração localizada em:
```
application.properties
```

Acesso pelo navegador:
```
http://localhost:8080/h2-console
```

---

## ▶️ Como executar o projeto

1. Clonar o projeto
2. Abrir no VS Code ou IntelliJ
3. Executar a classe:

```
P2GestaoAlunosApplication.java
```

4. Acessar no navegador:
```
http://localhost:8080
```

---

## 📹 Vídeo Explicativo

Link no YouTube (não listado):

```
[https://youtu.be/A_QFUvf1-Bo]
```

---

## 📦 Entregáveis

- Projeto Java
- README
- Vídeo explicativo
- Projeto compactado via Teams

## 👩‍💻 Feito por
[@Marcella Ricoy](https://github.com/marcellarc)
[@Fabio Brito](https://github.com/theFabioBrito)
