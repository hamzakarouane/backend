# Réservation des Terrains

Cette application est  dédiée aux opérations sur le terrain simplifient les processus pour permettre aux utilisateurs de mener à bien leurs tâches. Les applications de terrain utilisent les technologies de localisation pour la collecte de données, la coordination des équipes, le calcul d’itinéraire et la navigation, ainsi que le suivi de la localisation du personnel pour rationaliser les opérations sur le terrain.

# Fonctionnalités
- Gestion des terrains (CRUD) 
- Gestion des terrains par villes et par zones
- Gestion de réservation

## Architecture du projet :
L'application est divisée en deux parties : le frontend, codé en Angular, et le backend, codé en Spring Boot. Le backend utilise également une base de données MySQL pour stocker les données de l'application.

Le frontend et le backend communiquent via des API REST. Le frontend envoie des requêtes HTTP au backend, qui réalise les opérations souhaitées sur la base de données et renvoie les résultats au frontend sous forme de JSON.

![App Screenshot](https://github.com/hamzakarouane/hh/blob/master/screenshots/angular-spring-boot-mysql.png?raw=true)

# Mise en place du projet

Pour mettre en place ce projet, vous aurez besoin des éléments suivants :

- Un serveur d'application Java (comme Tomcat)
- Un SGBD (comme MySQL)
- Un éditeur de code (comme Intellij)
- Le driver JDBC de votre SGBD (à télécharger sur le site officiel de votre SGBD)
- Le framework Hibernate (à télécharger sur le site officiel ou via Maven)

# Déploiement

Pour déployer ce projet sur votre serveur d'application, suivez les étapes suivantes :

- Téléchargez le projet sur votre ordinateur
- Ouvrez-le dans votre éditeur de code
- Configurez la connexion à votre SGBD dans le fichier application_properties
- Exportez le projet en tant qu'archive WAR/JAR
- Déployez l'archive sur votre serveur d'application en suivant les instructions de votre serveur
- Tester les API en entrant l'URL suivante : http://localhost:8080/methode_de_mapping

## Authors

Ce projet a été réalisé par : 
- LAYOUNE Ghita 
- KADIRI Meriem 
- KAROUANE Hamza
