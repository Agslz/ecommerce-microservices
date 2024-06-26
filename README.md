# E-commerce Microservices

## Introducción

Este proyecto es un sistema de comercio electrónico basado en microservicios, diseñado utilizando un enfoque de Domain Driven Design (DDD). A continuación, se detallan las principales tecnologías y componentes utilizados en este proyecto.

## Tecnologías Principales

- **Spring Boot**: Utilizado para construir los microservicios.
- **Spring Cloud**: Incluyendo Config Server, Discovery Server (Eureka), y API Gateway.
- **Kafka**: Para la mensajería y coordinación entre servicios.
- **Docker**: Para contenedores y configuración de Kafka y Zookeeper.
- **Zipkin**: Para el rastreo distribuido de solicitudes.
- **Keycloak**: Para la gestión de la seguridad y autenticación.
- **PostgreSQL**: Base de datos para los microservicios.
- **Hibernate**: Para ORM y manejo de las entidades.

## Arquitectura

El sistema está compuesto por varios microservicios, cada uno responsable de una funcionalidad específica dentro del ecommerce:

- **Configuration Server**: Centraliza la configuración de todos los microservicios.
- **Discovery Server**: Facilita la detección de microservicios.
- **Customer Service**: Gestión de clientes.
- **Product Service**: Gestión de productos.
- **Order Service**: Gestión de órdenes.
- **Payment Service**: Procesamiento de pagos.
- **Notification Service**: Gestión de notificaciones.
- **API Gateway**: Puerta de enlace que dirige las solicitudes a los microservicios adecuados.

## Pasos para la Implementación

1. **Configuración del Monorepo**: Preparar el espacio de trabajo.
2. **Configuración de la Infraestructura y Herramientas**: Instalar y configurar las herramientas necesarias.
3. **Creación del Configuration Server**: Proyecto para centralizar la configuración.
4. **Creación y Configuración del Discovery Server**: Servidor para descubrir los microservicios.
5. **Microservicio de Clientes**: Creación, configuración e implementación.
6. **Microservicio de Productos**: Creación de entidades, inicialización de la base de datos, e implementación.
7. **Manejo de Excepciones y Datos de Prueba**.
8. **Microservicio de Órdenes**: Métodos para crear órdenes y configuración de Kafka.
9. **Controlador de Líneas de Órdenes y Manejo de Excepciones**.
10. **Microservicio de Pagos**: Implementación.
11. **Microservicio de Notificaciones**: Implementación.
12. **Configuración del API Gateway**: Implementación y configuración.
13. **Pruebas del Flujo Completo de la Aplicación**.
14. **Configuración de Zipkin para Trazabilidad**.
15. **Configuración de Keycloak para la Seguridad**: Creación de realm y cliente, configuración de seguridad en el API Gateway.
16. **Pruebas de la Aplicación con Seguridad**.

## Imágenes

## Diagrama sobre microservicios y tecnoologias utilizadas

![Untitled](https://github.com/Agslz/ecommerce-microservices/assets/83142033/f6c1b2c5-a191-4aa6-ae67-9459b8791c9b)

## Ejemplo del correo que recibe el cliente a la hora de la compra

![Untitled](https://github.com/Agslz/ecommerce-microservices/assets/83142033/64d11865-681f-4b56-8080-ec0f4ef1b58e)

