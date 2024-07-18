### Proyecto de Formulario con Spring Boot 

#### Descripción

Este proyecto implementa un formulario simple utilizando Spring Boot para el backend y JavaScript para el frontend. El formulario permite ingresar datos de usuarios (nombre y apellido) y enviarlos al servidor para su procesamiento.

#### Tecnologías Utilizadas

- **Backend:**
  - Spring Boot
  - Spring MVC para manejo de controladores
  - Thymeleaf para templates HTML dinámicos
- **Frontend:**
  - JavaScript para la interactividad del formulario
  - HTML para la estructura del formulario
  - CSS para estilos básicos

#### Funcionalidad

El proyecto permite al usuario ingresar su nombre y apellido en un formulario HTML y enviar estos datos al backend utilizando JavaScript y fetch API. Los datos son recibidos por un controlador en Spring Boot, que los procesa y muestra un mensaje de confirmación en el navegador.

#### Estructura del Proyecto

- Backend:
  - `UserController.java`: Controlador para manejar la vista del formulario y enviar datos a la plantilla HTML.
  - `UserRestController.java`: Controlador REST para manejar las solicitudes POST de creación de usuarios.
  - `User.java`: Modelo de datos para representar un usuario con nombre y apellido.
- Frontend:
  - `index.html`: Formulario HTML para ingresar nombre y apellido.
  - `script.js`: Script JavaScript para manejar la captura de datos del formulario y enviarlos al servidor.
  - `style.css`: Hoja de estilos CSS para estilizar el formulario.

