# SpringBoot Projects

## Table of Contents

- [Overview](#overview)
- [Projects](#projects)
    - [Shops](#shops)
    - [Book Manager](#book-manager)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Contributors](#contributors)
- [Acknowledgments](#acknowledgments)

## Overview

**SpringBoot Projects** est un dépôt regroupant divers projets backend développés avec **Spring Boot** pour explorer et résoudre des problématiques variées en développement d'applications. Ce dépôt est en constante évolution et a pour objectif de couvrir plusieurs cas d'utilisation backend dans différents domaines.

Actuellement, le dépôt contient les projets suivants :

- **Shops** : Un système de gestion de boutiques.
- **Book Manager** : Une application de gestion de collections de livres.

## Projects

### Shops

Un projet de gestion de boutiques permettant de gérer les produits, les catégories, les commandes et les utilisateurs.

#### Features :
- Gestion des utilisateurs : enregistrement, authentification.
- Gestion des produits : ajout, modification, suppression et recherche.
- Gestion des commandes : suivi des commandes par utilisateur.
- APIs REST sécurisées avec JWT.

#### Technologies :
- **Spring Boot 3**
- **Spring Security**
- **Spring Data JPA**
- **Swagger UI**
- **H2 Database** (en mode de développement)

---

### Book Manager

Une application backend pour la gestion et le partage de livres. Voir le [README dédié](book-manager/README.md) pour plus de détails.

#### Features :
- Gestion des utilisateurs : enregistrement, validation d'email, authentification.
- Gestion des livres : ajout, mise à jour, partage et archivage.
- Gestion des emprunts et retours des livres.
- APIs REST sécurisées avec JWT.

#### Technologies :
- **Spring Boot 3**
- **Spring Security**
- **Spring Data JPA**
- **Keycloak**
- **Swagger UI**
- **Docker**

---

## Technologies Used

Tous les projets de ce dépôt utilisent les technologies suivantes, adaptées à chaque projet selon les besoins :

- **Spring Boot** (version 3.0 et ultérieure)
- **Spring Security**
- **Spring Data JPA**
- **Swagger/OpenAPI** pour la documentation
- **Docker** pour la containerisation
- **GitHub Actions** pour l'intégration continue (CI/CD)
- **H2, MySQL, ou PostgreSQL** selon les projets

## Getting Started

Chaque projet de ce dépôt dispose de son propre fichier `README` décrivant les étapes nécessaires pour le cloner, le configurer et le lancer.  
Exemples :
- [Shops Setup Instructions](shops/README.md)
- [Book Manager Setup Instructions](book-manager/README.md)

## Contributors

- [Kamga Brandon](https://github.com/brandoniscoding-dev)

## Acknowledgments

Un grand merci à la communauté Spring Boot et aux mainteneurs des outils open source qui ont permis de développer ces projets.