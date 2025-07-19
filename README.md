# Spring Boot Film Randomizer

A simple application that allows you to add movies and randomly pick one from your list, built with Java and Spring Boot.

## Features
- Add movies via API
- Pick a random movie from your list
- Simple RESTful architecture

## Technologies Used
- Java
- Spring Boot
- Spring Web

## How to Run
1. Clone the repository:  
   `git clone https://github.com/shahmar-abbas/spring-boot-film-randomizer.git`
2. Go into the project folder:  
   `cd spring-boot-film-randomizer`
3. Start using Maven:  
   `./mvnw spring-boot:run`  
   or  
   `mvn spring-boot:run`

## API Endpoints
- `POST /films`: Adds a new film (send film name in body)
- `GET /films/random`: Returns a random film from the list
