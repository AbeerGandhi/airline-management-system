## Airline Management System

### Overview

The Airline Management System is a Spring Boot-based application that allows users to:

Retrieve flight schedules

Get ticket details

Book new tickets

Cancel booked tickets

Ensure validations for duplicate bookings and general checks

### Features

Retrieve all flights: GET /flights?sort=asc

Retrieve a specific flight: GET /flights/{id}

Get flight schedules for a date: GET /flights/{id}/schedules?dates=YYYY-MM-DD

Create a ticket: POST /tickets/

Get ticket details: GET /tickets/{id}

Cancel a ticket: DELETE /tickets/{id}

### Tech Stack

Spring Boot (Java Backend Framework)

Spring Data JPA (Database Management)

Spring Web (REST API Development)

H2/PostgreSQL/MySQL (Database Options)

Lombok (For reducing boilerplate code)

Swagger/OpenAPI (API Documentation)
