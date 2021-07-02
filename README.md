# Rnd-hexagonal

Ce projet consiste à faire ressortir la force que offre l'architecture Hexagonale. 



### Ce que je dois impérativement avoir pour commencer

- Installation de JDK/JR 11 et plus:  https://adoptopenjdk.net/ ou https://openjdk.java.net/install/ 

- Installation de Maven  https://maven.apache.org/download.cgi

- Installation de mes IDEs préférés: 

  - Intellij Idea: https://www.jetbrains.com/fr-fr/idea/download

  - Eclipse: https://www.eclipse.org/downloads/packages/



### Construire le projet pour prendre en compte spring 

```bash
./mvnw clean packge -P spring
```

####  Construire le projet pour prendre en compte  Quarkus

```
./mvnw clean packge -P quarkus
```

