# INTEGRANTES:
-Brandon Eduardo Merchan Sandoval

# Proyecto: Registro de Votantes - Registraduría 

Este proyecto implementa una solución basada en TDDpara la registraduría nacional. El sistema permite registrar personas que desean votar, donde se valida si son elegibles según ciertos criterios.

##  Funcionalidades

- Solo se registran personas vivas
- Solo se registran mayores de edad
- Solo se permite un registro por número de documento
- Se validan edades inválidas (negativas o exageradas)

## Estructura de Clases

- `Person`: Representa una persona con nombre, edad, género, ID y estado de vida.
- `Registry`: Servicio que permite registrar personas.
- `RegisterResult`: Enum con los posibles resultados del registro.
- `RegistryTest`: Pruebas unitarias que validan cada clase de equivalencia.

##  Requisitos Técnicos

- JDK 8
- Maven
- JUnit 5

##  Cómo ejecutar las pruebas

```bash
mvn clean test
