# Base image para Java 21
FROM eclipse-temurin:21-jdk

# Diretório de trabalho dentro do container
WORKDIR /app

# Copiar os arquivos de build
COPY ./build/libs/*.jar /app/app.jar

# Expor a porta onde a aplicação irá rodar
EXPOSE 8080

# Comando para rodar o Spring Boot
ENTRYPOINT ["java", "-jar", "/app/app.jar"]