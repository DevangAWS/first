FROM ubuntu:22.04

RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    xvfb \
    x11vnc \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app

RUN mkdir -p src/DigitalClock

COPY *.java src/DigitalClock/

RUN javac -d . src/DigitalClock/*.java

CMD ["sh", "-c", "Xvfb :99 -screen 0 1024x768x24 & x11vnc -display :99 -forever -nopw & export DISPLAY=:99 && java -cp /app DigitalClock.Main"]