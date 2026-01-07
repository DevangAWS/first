FROM eclipse-temurin:17-jdk AS builder

WORKDIR /app

RUN mkdir -p DigitalClock

COPY *.java DigitalClock/

RUN javac DigitalClock/*.java

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=builder /app/DigitalClock ./DigitalClock

CMD ["java", "DigitalClock.Main"]