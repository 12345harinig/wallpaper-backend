# ---------- STAGE 1: build with Maven ----------
FROM maven:3.9.2-eclipse-temurin-17 AS build
WORKDIR /app

# copy Maven config
COPY pom.xml .
COPY mvnw mvnw
COPY .mvn .mvn

# download dependencies
RUN mvn -B dependency:go-offline

# copy source and build
COPY src ./src
RUN mvn -B clean package -DskipTests

# ---------- STAGE 2: run ----------
FROM eclipse-temurin:17-jdk
WORKDIR /app

# copy jar from build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

# run jar with port from $PORT
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -Dserver.port=${PORT:-8080} -jar /app/app.jar"]
