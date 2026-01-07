FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

RUN mkdir -p src/Advance_Java/LambdaPractice

COPY *.java src/Advance_Java/LambdaPractice/

WORKDIR /app/src

RUN javac Advance_Java/LambdaPractice/*.java

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app/src/

COPY --from=build /app/src /app/src

CMD ["java", "Advance_Java.LambdaPractice.demo"]