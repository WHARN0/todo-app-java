FROM openjdk:11
WORKDIR /app
COPY TodoApp.java .
RUN javac TodoApp.java
CMD ["java", "TodoApp"]