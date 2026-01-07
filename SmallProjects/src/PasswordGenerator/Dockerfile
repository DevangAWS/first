FROM eclipse-temurin:25-jdk AS build

WORKDIR /app

RUN mkdir -p src/PasswordGenerator

COPY *.java src/PasswordGenerator/

WORKDIR /app/src

RUN javac PasswordGenerator/*.java

FROM eclipse-temurin:25-jre-alpine

WORKDIR /app/src

COPY --from=build /app/src /app/src

CMD [ "java","PasswordGenerator.RunAboveCode" ]