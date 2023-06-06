
# ![209678377-70b50b21-33de-424c-bed8-6a71ef3406ff](https://github.com/chriscarsam/foro-alura/assets/28877424/3d87da57-2512-4f87-969e-5a18c4bfc304) Challenge ONE | Back End | Foro Alura


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

# 📃 Challenge ONE - API REST - Spring 1

### 🔹Diagrama de base de datos:
Link: https://github.com/chriscarsam/foro-alura/tree/master/src/main/resources/db/migration
![diagrama_foro_api](https://github.com/chriscarsam/foro-alura/assets/28877424/6d761548-a16a-4977-b929-46ed8496ae15)

### 🔹Registro de un nuevo tópico
&emsp; La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes POST para el URI /topicos.
```bash
[ POST ] http://localhost:8080/topicos
```

```json
{
	"titulo": "Laravel 8",
	"mensaje": "Consulta de Laravel 8 conexipon con PostGrestSQL",	
	"status": "NO_RESPONDIDO",
	"usuario":{
		"id": "1"}
	,
	"curso": {
		"id": "2"
	}
}
```
![Screenshot from 2023-05-28 17-32-31](https://github.com/chriscarsam/foro-alura/assets/28877424/87688b0d-d0f1-48cb-a1fc-e3e26c5403aa)

### 🔹Mostrar todos los tópicos
&emsp; La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos.
```bash
[ GET ] http://localhost:8080/topicos?size=10
```
![Screenshot from 2023-05-28 17-33-56](https://github.com/chriscarsam/foro-alura/assets/28877424/d64a1379-b843-49d0-9cba-9f3f7a45f67d)

### 🔹Detallando un tópico
&emsp; La API debe tener un endpoint para la lista de todos los tópicos y debe aceptar solicitudes GET para el URI /topicos/{id}.
```bash
[ GET ] http://localhost:8080/topicos/3
```
![Screenshot from 2023-05-28 17-34-22](https://github.com/chriscarsam/foro-alura/assets/28877424/6e84c466-ab4f-4b8e-a6f9-895f9d7a946d)

### 🔹Actualizar un tópico
&emsp; La API debe tener un endpoint para el registro de nuevos tópicos y debe aceptar solicitudes PUT para el URI /topicos/{id}.
```bash
[ PUT ] http://localhost:8080/topicos
```

```json
{
	"id": 3,
	"titulo": "PHP 7",
	"mensaje": "Consulta de PHP 7 Conexión con mysql"
}
```
![Screenshot from 2023-05-28 17-36-08](https://github.com/chriscarsam/foro-alura/assets/28877424/349c199e-a02b-4fd1-86c5-112c39045087)

### 🔹Eliminar un tópico
&emsp; La API debe tener un endpoint para la eliminación de tópicos y debe aceptar requisiciones DELETE para el URI /topicos/{id}.
```bash
[ DELETE ] http://localhost:8080/topicos/3
```
![Screenshot from 2023-05-28 17-37-05](https://github.com/chriscarsam/foro-alura/assets/28877424/cdda4335-3288-4bab-9b2c-4e4eaaaad92c)

# 📃 Challenge ONE - API REST - Spring 2
### 🔹Documentación con Swagger
&emsp; Swagger es una herramienta extremadamente ventajosa para tu API, ya que ofrece una interfaz fácil amigable y accesible, así como una forma de documentación automática, generada simultáneamente con el desarrollo de la API.

```bash
[ URL ] http://localhost:8080/login](http://localhost:8080/swagger-ui/index.html#/
```

![Screenshot from 2023-06-06 17-23-44](https://github.com/chriscarsam/foro-alura/assets/28877424/ee310076-d6b1-47d4-8979-03b656c98eb0)


### 🔹Generar un token usando JWT
&emsp; Para agregar mayor seguridad a tu aplicación, una opción muy ventajosa es requerir tokens para la autenticación. 
```bash
[ POST ] http://localhost:8080/login
```

```json
{
	"email": "user@email.com",
	"password": "123456"
}
```
![Screenshot from 2023-05-29 13-13-42](https://github.com/chriscarsam/foro-alura/assets/28877424/91ccf37e-32c6-409b-aa82-27f36c4eeb6b)

### 🔹Autenticación con JWT
&emsp; Una vez que se genera el token con JWT, será necesario usarlo para autenticar el proceso de registros, eliminación, actualización.

```json
{
	"jwTtoken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyQGVtYWlsLmNvbSIsImlzcyI6ImZvcm8gYXBpIiwiaWQiOjEsImV4cCI6MTY4NTMzMDIwNX0.Lnu4RX-8V91svB4zguSP9Z34HVDSe__sQkp-Hqe9UXQ"
}
```
### &emsp; Endpoints
---

| Endpoint                     | Método      | Acceso                   | Descripción                         |
| ---------------------------- | ----------- | ------------------------ | ----------------------------------- |
| /login                       | POST        | Público                  | Genera par de tokens                |
| /topicos                     | GET         | Público                  | Mostrar todos los tópicos creados   |
| /topicos/{id}                | GET         | Público                  | Mostrar un tópico específico        |
| /topicos                     | POST        | Privado/Protegido        | Crear un nuevo tópico               |
| /topicos                     | PUT         | Privado/Protegido        | Actualizar un tópico                |
| /topicos/{id}                | DELETE      | Privado/Protegido        | Eliminar un tópico                  |

---
![Screenshot from 2023-06-06 18-07-14](https://github.com/chriscarsam/foro-alura/assets/28877424/1b2ff4d8-0af6-4b87-8425-92c4e2eb6717)

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
- [JWT](https://jwt.io/)

## 📝 Dependencias utilizadas
Link: https://github.com/chriscarsam/foro-alura/blob/master/pom.xml
![Screenshot from 2023-05-29 13-30-47](https://github.com/chriscarsam/foro-alura/assets/28877424/5499f44f-57ab-4695-a75c-d1510e3345d9)
---
## 📝 Estructura del proyecto
Link: https://github.com/chriscarsam/foro-alura/tree/master/src/main/java/org/sam/foro/api
![Screenshot from 2023-05-28 20-27-12](https://github.com/chriscarsam/foro-alura/assets/28877424/56bd8fd4-63fb-46c8-949b-77c6e4658553)

## 📝 Commits realizados:
Link: https://github.com/chriscarsam/foro-alura/commits/master

---

![insignia](https://github.com/chriscarsam/foro-alura/assets/28877424/fb51f5ba-3c89-4800-bd2d-697fb138e24f) ChristianSam




