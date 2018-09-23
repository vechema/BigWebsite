# Chores

Web app to keep track of household chores

## How to

### How to run app
mvn spring-boot:run

## Tech used
* Spring boot - 1.5.3.RELEASE
* H2 in memory database
* Angular - 1.6.6

## Packages
* controller - takes request from frontend, takes dtos, makes calls with entities
* converter - converts from dto to entity and vice versa
* dto - All dtos
* entity - All entities
* repository - All repositories
* service - Business logic, deals with entities
