# TruthLence-kotlin-
Kotlin Spring Boot Product API

This is a Kotlin Spring Boot project for managing products using a RESTful API.

Getting Started

Prerequisites

JDK 17+

Kotlin
1.9.23

Spring Boot
3.2.0

Maven


i used a h2 db here 

Installation

Clone the repository:
git clone https://github.com/CodingManiac44/TruthLence-kotlin-.git

cd kotlin-product-api

API Endpoints

Create a Product

Endpoint: POST /api/products

Request:
curl --location 'http://localhost:8081/api/products' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Sample Product 1"
}'

{
    "id": 1,
    "name": "Sample Product 1"
}
