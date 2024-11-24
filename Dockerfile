FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /workspace/app

# Kopírování Maven souborů
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

# Sestavení aplikace
RUN chmod +x mvnw
RUN ./mvnw install -DskipTests

# Finální obraz
FROM eclipse-temurin:21-jre-alpine
VOLUME /tmp
COPY --from=build /workspace/app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]