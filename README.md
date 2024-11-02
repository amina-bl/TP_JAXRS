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
Ajoutez JAXB pour le support XML dans `pom.xml` 
## 3. Démonstration

https://github.com/user-attachments/assets/b19bc260-3715-4547-9554-d96c1a8c2b1d


https://github.com/user-attachments/assets/8f597f37-f767-47b5-b756-79b684f87c0a

