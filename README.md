Aplicación Spring Boot con Thymeleaf

Descripción

Esta es una aplicación Spring Boot que utiliza Thymeleaf como motor de plantillas para generar vistas web. La aplicación también utiliza una base de datos H2 en modo local para el almacenamiento de datos.

Requisitos del sistema

Java: Versión 17
Maven: Versión 3.6.3
Ejecución de la aplicación

Paso 1: Clona el repositorio
Clona este repositorio en tu máquina local:

bash
Copiar
Editar
git clone <REPOSITORY_URL>
cd <PROJECT_NAME>
Paso 2: Compila la aplicación
Ejecuta el siguiente comando para compilar el proyecto:

bash
Copiar
Editar
mvn clean install
Paso 3: Ejecuta la aplicación
Utiliza el siguiente comando para iniciar la aplicación:

bash
Copiar
Editar
mvn spring-boot:run
Paso 4: Accede a la aplicación
Una vez iniciada, puedes acceder a la aplicación en:

http://localhost:8080

Base de datos H2

La aplicación está configurada para usar una base de datos H2 en modo local. 


src/main/java: Código fuente de la aplicación.
src/main/resources: Archivos de configuración y plantillas Thymeleaf.
templates: Vistas HTML de Thymeleaf.
application.properties: Configuraciones de la aplicación.
Tecnologías utilizadas

Spring Boot: Framework principal para construir la aplicación.
Thymeleaf: Motor de plantillas para renderizar vistas.
Base de datos H2: Base de datos embebida para almacenamiento temporal.
AngularJs: Para trabajar y procesar la informacion del back al fornt.

Notas:
Asegúrate de tener Java 17 y Maven 3.6.3 configurados correctamente en tu entorno.
Este proyecto está configurado para ejecución local y no incluye configuraciones para entornos de producción.
