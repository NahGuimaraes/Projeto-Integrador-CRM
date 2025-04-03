## <h1> DESAFIO 2 BACKEND: Criando um projeto Spring com uma entidade e CRUD COMPLETO </h1>  

 ### 🏗👨‍💻 Equipe 
	 	
 Lays Sabryna - https://github.com/SabrynaSousa 
	
 Najla Guimarães - https://github.com/NahGuimaraes 
	
 Nycolly Weiss - https://github.com/NycollyWeiss
	
 Thais Machado - https://github.com/machadothais
	
 Mireli Borges - https://github.com/mikaborges
	
 Mariana Marie - https://github.com/ihamari
	
 Isabella Bento - https://github.com/
 


### <h2>📢 Título do Projeto </h2>

<h3>Sistema de Relacionamento com cliente (CRM) </h3>
 
### 🏢 Modelo de Negócio Escolhido 

O projeto tem como objetivo desenvolver um sistema para gerenciamento de funcionários, cargos e departamentos de uma empresa. A aplicação permitirá a gestão eficiente de informações sobre colaboradores, incluindo cadastro, atualização, consulta e remoção de dados. 


### 📖 Descrição Geral 

Sistema de Relacionamento com cliente (CRM) é uma aplicação backend baseada em Spring Boot, que oferece um CRUD completo para gerenciamento de funcionários dentro de uma organização. O sistema armazenará informações essenciais, como nome, cargo, departamento e salário. A aplicação contará com uma API REST para integração e utilização dos dados em diferentes sistemas ou interfaces. 
 

### 📂 Entidade e Atributos da Entidade 

A principal entidade do sistema será Funcionário, com os seguintes atributos: 

ID (Long) – Identificador único do funcionário 

Nome (String) – Nome completo do funcionário 

Cargo (String) – Cargo ocupado pelo funcionário 

Departamento (String) – Setor ao qual pertence 

Salário (Double) – Remuneração do funcionário 


### ⚙️ Funcionalidades Principais (CRUD) 

O sistema oferecerá as seguintes operações para a entidade Funcionário: 

Criar um novo funcionário 

Listar todos os funcionários 

Buscar funcionário por ID 

Atualizar informações de um funcionário 

Excluir um funcionário 

Personalizado pesquisar por nome de funcionário


### 🛠️ Tecnologias Utilizadas 

Java 

Spring Boot Dev Tools 

Spring Web 

Maven 

Spring Data JPA 

Insomnia 

Validation  

MySQL Driver 

MySQL Workbench 
 

### 📁 Estrutura do Projeto 

O projeto será organizado seguindo as boas práticas de desenvolvimento, com a seguinte estrutura: 

/src 

├── main 

│   ├── java/com/Projeto-RH/rh 

│   │   ├── controller   # Controladores da API 

│   │   ├── service      # Regras de negócio 

│   │   ├── repository   # Repositórios para acesso ao banco 

│   │   ├── model        # Modelos das entidades 

│   │   ├── dto          # Objetos de transferência de dados 

│   │   ├── config       # Configurações gerais 

│       ├── resources 

│   │   ├── application.properties # Configurações do Spring Boot 
 

