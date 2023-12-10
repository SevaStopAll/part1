FROM gradle:7.4.1-jdk17 as build

WORKDIR /build
COPY . .
RUN gradle :bootRun --no-daemon
