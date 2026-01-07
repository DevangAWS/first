FROM eclipse-temurin:25-jdk AS builder

WORKDIR /app

RUN mkdir -p src/Generics/CustomGenericsArrayList

COPY *.java src/Generics/CustomGenericsArrayList/

WORKDIR /app/src

RUN javac Generics/CustomGenericsArrayList/*.java

FROM eclipse-temurin:25-jre-alpine

WORKDIR /app/src

COPY --from=builder /app/src /app/src

CMD [ "java","Generics.CustomGenericsArrayList.RunCustomGenericArrayList" ]