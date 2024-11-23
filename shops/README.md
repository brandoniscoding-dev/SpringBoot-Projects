# E-commerce Backend Application

Ce projet est une application de gestion d'un système de commerce en ligne (e-commerce) développée en utilisant **Spring Boot**. Il comprend des fonctionnalités telles que la gestion des utilisateurs, des produits, des catégories, des commandes et des paniers d'achat. Il expose une API RESTful pour interagir avec les différents composants du système.

## Table des matières
- [Technologies utilisées](#technologies-utilisées)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Structure du projet](#structure-du-projet)
- [Configuration](#configuration)
- [Exécution](#exécution)
- [API Endpoints](#api-endpoints)
- [Tests](#tests)
- [Contribuer](#contribuer)
- [Licence](#licence)

## Technologies utilisées
- **Spring Boot** : Framework principal pour la création de l'application backend.
- **Spring Data JPA** : Pour l'accès aux bases de données relationnelles.
- **MySQL** : Base de données utilisée pour stocker les données du projet.
- **Maven** : Outil de gestion de projet et de dépendances.
- **Lombok** : Pour réduire la verbosité du code Java.
- **Swagger** : Pour la documentation de l'API (si intégré).
- **JUnit** : Pour les tests unitaires.

## Prérequis
Avant de commencer, assurez-vous d'avoir les éléments suivants installés :
- **Java 17** ou version supérieure.
- **Maven** 3.8 ou version supérieure.
- **MySQL** ou toute autre base de données compatible.
- Un IDE (comme **IntelliJ IDEA** ou **Eclipse**) pour développer et exécuter le projet.

## Installation
1. Clonez ce repository :
    ```bash
    git clone https://github.com/brandoniscoding-dev/shops.git
    ```

2. Accédez au répertoire du projet :
    ```bash
    cd shops
    ```

3. Modifiez la configuration de la base de données dans `src/main/resources/application.properties` :
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/shop_db
    spring.datasource.username=root
    spring.datasource.password=
    ```

4. Compilez le projet en utilisant Maven :
    ```bash
    mvn clean install
    ```

5. Exécutez le projet en mode développement :
    ```bash
    mvn spring-boot:run
    ```

## Structure du projet
- **controller** : Contient les contrôleurs REST qui gèrent les requêtes HTTP et coordonnent les réponses.
- **dto** : Contient les objets de transfert de données qui définissent les structures d'entrée et de sortie pour l'API.
- **model** : Contient les entités JPA représentant les objets métiers (produit, utilisateur, commande, etc.).
- **repository** : Contient les interfaces de repos JPA pour accéder aux données.
- **service** : Contient la logique métier, divisée en services spécialisés pour chaque domaine (produit, utilisateur, commande, etc.).

## Configuration
Le fichier de configuration `application.properties` contient les paramètres de configuration pour l'application, y compris la configuration de la base de données, les paramètres de serveur, etc. Voici un exemple de configuration pour la base de données MySQL :

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shopsdb
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

## Exécution
1. **Lancer l'application** :
   Utilisez la commande suivante pour démarrer le serveur backend :
    ```bash
    mvn spring-boot:run
    ```

2. **Accéder à l'API** :
   Une fois l'application lancée, vous pouvez accéder à l'API à l'adresse suivante :
    ```
    http://localhost:8080/
    ```

3. **Documenter l'API avec Swagger (optionnel)** :
   Si vous avez intégré Swagger dans votre projet, la documentation de l'API sera disponible à l'adresse suivante :
    ```
    http://localhost:8080/swagger-ui/
    ```

## API Endpoints
Voici un aperçu des principaux endpoints REST de l'application :

### Utilisateurs
- **POST** `/users` : Crée un nouvel utilisateur.
- **GET** `/users/{id}` : Récupère les informations d'un utilisateur par son ID.
- **PUT** `/users/{id}` : Met à jour un utilisateur existant.
- **DELETE** `/users/{id}` : Supprime un utilisateur.

### Produits
- **POST** `/products` : Ajoute un nouveau produit.
- **GET** `/products` : Récupère tous les produits.
- **GET** `/products/{id}` : Récupère un produit par son ID.
- **PUT** `/products/{id}` : Met à jour un produit existant.
- **DELETE** `/products/{id}` : Supprime un produit.

### Commandes
- **POST** `/orders` : Crée une nouvelle commande.
- **GET** `/orders/{id}` : Récupère les détails d'une commande par son ID.

### Panier
- **POST** `/cart` : Crée un panier d'achat pour un utilisateur.
- **POST** `/cart/items` : Ajoute un article au panier.
- **GET** `/cart/{userId}` : Récupère les articles du panier pour un utilisateur.

## Tests
Les tests unitaires sont situés dans le dossier `src/test/java/com/brandoniscoding/shops/`. Vous pouvez exécuter les tests avec la commande suivante :
```bash
mvn test
```

## Contribuer
Si vous souhaitez contribuer à ce projet, voici comment vous pouvez le faire :
1. Fork ce projet.
2. Créez une branche pour vos modifications.
3. Effectuez vos changements.
4. Ouvrez une pull request décrivant vos modifications.

## Licence
Ce projet est sous licence **MIT**. Vous êtes libre d'utiliser, de modifier et de distribuer ce code selon les termes de cette licence.
```
