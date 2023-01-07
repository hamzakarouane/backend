# Réservation des Terrains

Cette application est  dédiée aux opérations sur le terrain simplifient les processus pour permettre aux utilisateurs de mener à bien leurs tâches. Les applications de terrain utilisent les technologies de localisation pour la collecte de données, la coordination des équipes, le calcul d’itinéraire et la navigation, ainsi que le suivi de la localisation du personnel pour rationaliser les opérations sur le terrain.

# Fonctionnalités
- Gestion des terrains (CRUD) 
- Gestion des terrains par villes et par zones
- Gestion de réservation

## Model-View-Controller
- Un modèle (Model) : contient les données à afficher par exemple les terrains (getter/setters)
- Une vue (View) : contient la présentation de l'interface graphique.
- Un contrôleur (Controller) : contient la logique concernant les actions effectuées par l'utilisateur.

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
