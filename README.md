# Spring Framework - Proyecto de Aprendizaje

Este repositorio contiene ejemplos de aplicaciones desarrolladas con el framework **Spring**. A lo largo del proyecto, se exploran diferentes enfoques y configuraciones dentro del ecosistema de Spring, desde configuraciones en XML hasta el uso de anotaciones y JavaConfig para gestionar los beans y la arquitectura de las aplicaciones.

## Estructura del Proyecto

El proyecto se organiza en distintas etapas de aprendizaje:

### 01_SpringXML
- Implementación básica de Spring utilizando configuración en **XML**.
- Se configura el contexto de la aplicación y los beans de manera tradicional.
  
### 02_SpringXMLCapas
- Integración de la **arquitectura de tres capas** (presentación, negocio y datos) con Spring usando configuración XML.
  
### 03_springAnotaciones01
- Introducción al uso de **anotaciones** en Spring.
- Se abandona parcialmente la configuración XML en favor de las anotaciones como `@Component`, `@Autowired`, entre otras.
  
### 04_SpringAnotacionesCapas
- Implementación de la **arquitectura de tres capas** utilizando anotaciones y **JavaConfig**.
  
### 05_SpringJavaConfig
- Configuración completa de Spring mediante **JavaConfig**.
- Uso de clases y métodos para definir los beans, proporcionando una configuración más limpia y flexible.

## Requisitos

Para ejecutar estos ejemplos, necesitas tener instalados los siguientes programas:

- **Java JDK 11 o superior**
- **Maven** o **Gradle** (dependiendo de la herramienta que uses para gestionar dependencias)
- **Spring Framework 5.x o superior**
