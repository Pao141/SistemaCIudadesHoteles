# 🏙️ Sistema Ciudades Hoteles

Sistema basado en una arquitectura de **microservicios** desarrollado con Java y Spring Boot para gestionar información de ciudades y hoteles.

## 📋 Descripción

El proyecto implementa una arquitectura distribuida donde diferentes servicios se encargan de funcionalidades específicas del sistema.

La solución incluye servicios independientes para la gestión de ciudades y hoteles, junto con un servidor Eureka para el descubrimiento y registro de los microservicios.

El entorno puede ejecutarse mediante **Docker Compose**, facilitando la puesta en marcha de los diferentes componentes.

## 🧩 Microservicios

### 🏙️ Cities Service

Microservicio encargado de gestionar la información relacionada con las ciudades.

### 🏨 Hotels Service

Microservicio encargado de gestionar la información relacionada con hoteles.

### 🔎 Eureka Server

Servicio utilizado para el **registro y descubrimiento de los microservicios** dentro de la arquitectura.

## 🐳 Docker Compose

El proyecto incluye:

```text
docker-compose.yml
```

para facilitar la ejecución conjunta de los diferentes servicios.

## 🛠️ Tecnologías

* Java
* Spring Boot
* Spring Cloud
* Eureka
* Maven
* Docker
* Docker Compose

## 🎯 Objetivo

Proyecto práctico orientado al aprendizaje y aplicación de conceptos de **arquitectura de microservicios, comunicación entre servicios, service discovery y contenerización**.
