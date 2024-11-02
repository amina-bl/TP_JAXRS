# Exercice Web Services : JAX-RS / Jersey

## Aperçu
Ce projet montre comment construire des services web RESTful en utilisant **JAX-RS avec Jersey** dans **Spring Boot**. Il utilise **Spring Data JPA** pour la persistance des données et une **base de données H2** pour simplifier les tests. **JAXB** est ajouté pour gérer le format XML.

## Prérequis
- Java 17+
- Maven

## Structure du Projet
- `JaxRsApplication.java` : Point d’entrée principal de l’application.
- `MyConfig.java` : Configuration Jersey.
- `Compte.java` : Entité représentant un compte bancaire.
- `TypeCompte.java` : Enumération pour les types de comptes.
- `CompteRepository.java` : Interface JPA.
- `CompteRestJaxRSAPI.java` : Implémentation des services REST

## 1. Création du projet
Utilisez [Spring Initializr](https://start.spring.io/) avec les dépendances :
- **Spring Web**, **Spring Data JPA**, **H2 Database**, **Jersey**, **Lombok**, **DevTools**.

## 2. Dépendance JAXB
Ajoutez JAXB pour le support XML dans `pom.xml` :
```xml
<dependency>
    <groupId>org.glassfish.jersey.media</groupId>
    <artifactId>jersey-media-jaxb</artifactId>
    <version>3.1.1</version>
</dependency>
