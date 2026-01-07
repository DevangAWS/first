FROM eclipse-temurin:25-jdk AS builder

WORKDIR /app

RUN mkdir -p src/Generics/CustomArrayList

COPY *.java src/Generics/CustomArrayList/

WORKDIR /app/src

RUN javac Generics/CustomArrayList/*.java

FROM eclipse-temurin:25-jre-alpine

WORKDIR /app/src

COPY --from=builder /app/src /app/src

CMD [ "java","Generics.CustomArrayList.RunCustomArrayList" ]