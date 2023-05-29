# ![Screenshot from 2023-05-29 17-10-33](https://github.com/chriscarsam/foro-alura/assets/28877424/34b283cb-5bce-48e8-ab62-65397d51c846) Challenge ONE | Back End | Foro Alura


En este desafío, vamos a implementar a nivel de back end (CRUD) el proceso de un foro, y para eso crearemos una API REST usando Spring.

Nuestra API va a centrarse específicamente en los tópicos, y debe permitir a los usuarios:

* Crear un nuevo tópico
* Mostrar todos los tópicos creados
* Mostrar un tópico específico
* Actualizar un tópico
* Eliminar un tópico
* Documentación con Swagger
* Generar un token usando JWT
* Autenticación con JWT

### Definición de foro
Un foro es una comunidad en línea que facilita la comunicación y el intercambio de conocimientos entre usuarios interesados en temas específicos.

### ⬇️ Repositorio Base Alura
https://github.com/alura-challenges/challenge-one-foro-alura

## 📃 Challenge ONE - API REST - Spring 1

### 🔹Diagrama de base de datos:
Link: https://github.com/chriscarsam/foro-alura/tree/master/src/main/resources/db/migration
![diagrama_foro_api](https://github.com/chriscarsam/foro-alura/assets/28877424/6d761548-a16a-4977-b929-46ed8496ae15)

### 🔹Registro de un nuevo tópico
&emsp; La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes POST para el URI /topicos.
![Screenshot from 2023-05-28 17-32-31](https://github.com/chriscarsam/foro-alura/assets/28877424/87688b0d-d0f1-48cb-a1fc-e3e26c5403aa)

### 🔹Mostrar todos los tópicos
&emsp; La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos.
![Screenshot from 2023-05-28 17-33-56](https://github.com/chriscarsam/foro-alura/assets/28877424/d64a1379-b843-49d0-9cba-9f3f7a45f67d)

### 🔹Detallando un tópico
&emsp; La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos/{id}.
![Screenshot from 2023-05-28 17-34-22](https://github.com/chriscarsam/foro-alura/assets/28877424/6e84c466-ab4f-4b8e-a6f9-895f9d7a946d)

### 🔹Actualizar un tópico
&emsp; La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes PUT para el URI /topicos/{id}.
![Screenshot from 2023-05-28 17-36-08](https://github.com/chriscarsam/foro-alura/assets/28877424/349c199e-a02b-4fd1-86c5-112c39045087)

### 🔹Eliminar un tópico
&emsp; La API debe tener un endpoint para la eliminación de tópicos y debe aceptar requisiciones DELETE para el URI /topicos/{id}.
![Screenshot from 2023-05-28 17-37-05](https://github.com/chriscarsam/foro-alura/assets/28877424/cdda4335-3288-4bab-9b2c-4e4eaaaad92c)

## 📃 Challenge ONE - API REST - Spring 2
### 🔹Documentación con Swagger
&emsp; Swagger es una herramienta extremadamente ventajosa para tu API, ya que ofrece una interfaz fácil amigable y accesible, así como una forma de documentación automática, generada simultáneamente con el desarrollo de la API.
![Screenshot from 2023-05-28 17-23-46](https://github.com/chriscarsam/foro-alura/assets/28877424/7bce8329-10c0-4d7a-aea8-6a77c355f974)

### 🔹Generar un token usando JWT
&emsp; Para agregar mayor seguridad a tu aplicación, una opción muy ventajosa es requerir tokens para la autenticación. 
![Screenshot from 2023-05-29 13-13-42](https://github.com/chriscarsam/foro-alura/assets/28877424/91ccf37e-32c6-409b-aa82-27f36c4eeb6b)

### 🔹Autenticación con JWT
&emsp; Una vez que se genera el token con JWT, será necesario usarlo para autenticar el proceso de registros, eliminación, actualización, listado.
![Screenshot from 2023-05-29 13-14-35](https://github.com/chriscarsam/foro-alura/assets/28877424/423e80e1-d2b6-4380-8e88-cc72320d44d4)

## 📚 Tecnologías 
- [OpenJDK JDK 17](https://openjdk.org/projects/jdk/17/)
- [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/#section=linux)
- [Spring Boot 3.0.6](https://docs.spring.io/spring-boot/docs/3.0.6/reference/html/)
- [Spring Initializr](https://start.spring.io)
- [MySQL 8.0.30](https://dev.mysql.com/downloads/mysql/)
- [MySQL Workbench](https://www.mysql.com/products/workbench/)
- [Insomnia](https://insomnia.rest/)
- [Lombok](https://www.baeldung.com/intro-to-project-lombok)
- [Flyway](https://www.baeldung.com/database-migrations-with-flyway)
- [Swagger](https://www.baeldung.com/spring-rest-openapi-documentation)

## 📝 Dependencias utilizadas
Link: https://github.com/chriscarsam/foro-alura/blob/master/pom.xml
![Screenshot from 2023-05-29 13-30-47](https://github.com/chriscarsam/foro-alura/assets/28877424/5499f44f-57ab-4695-a75c-d1510e3345d9)

## 📝 Estructura del proyecto
Link: https://github.com/chriscarsam/foro-alura/tree/master/src/main/java/org/sam/foro/api
![Screenshot from 2023-05-28 20-27-12](https://github.com/chriscarsam/foro-alura/assets/28877424/56bd8fd4-63fb-46c8-949b-77c6e4658553)

### 📝 Commits realizados:
Link: https://github.com/chriscarsam/foro-alura/commits/master

⭐ ChristianSam

[![img](https://camo.githubusercontent.com/c00f87aeebbec37f3ee0857cc4c20b21fefde8a96caf4744383ebfe44a47fe3f/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f2d4c696e6b6564496e2d2532333030373742353f7374796c653d666f722d7468652d6261646765266c6f676f3d6c696e6b6564696e266c6f676f436f6c6f723d7768697465)](https://www.linkedin.com/in/christian-sambachi-491782174/)

