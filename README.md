# 🚕 Ride Hailing Microservices Platform

A production-style backend system for a ride-hailing application built using Spring Boot microservices.
The project focuses on scalability, modular design, and real-time communication.

---

## 📌 Highlights

- 🚀 Microservices-based architecture (Spring Boot)
- 🧩 Clean domain-driven service separation
- 🔐 Decoupled authentication using JWT
- 📍 Real-time driver location tracking with Redis Geo
- 🔁 Asynchronous communication using Kafka
- ⚡ Live updates via WebSocket (STOMP)
- 🧭 Service discovery using Eureka
- 🗃 Database migration with Flyway
- 📦 Mono-repo for centralized management

---

## 🏗 System Architecture

> *(Add architecture diagram image here if available)*

Client (Mobile / Web)
|
API Requests
|
┌──────────────┐
│ Auth Service │ ← JWT Authentication
└──────────────┘
|
┌────────────────────────────────────────┐
│ Booking | Location | Review | Socket │
│ Entity | Kafka | Redis | Services │
└────────────────────────────────────────┘
|
┌──────────────────────────┐
│ Eureka Service Discovery │
└──────────────────────────┘


---

## 🧩 Microservices Breakdown

| Service | Responsibility |
|------|------|
| **auth-service** | User authentication, JWT token generation & validation |
| **booking-service** | Ride creation, ride lifecycle & status management |
| **location-service** | Real-time driver location tracking using Redis Geo |
| **entity-service** | Shared domain models to avoid duplication |
| **review-service** | Ride ratings and user reviews |
| **socket-service** | Real-time communication using WebSocket & STOMP |
| **service-discovery** | Eureka-based service registry |

---

## 🔄 Communication Patterns

- **Synchronous:** REST APIs (Service-to-Service)
- **Asynchronous:** Kafka event streaming
- **Real-time:** WebSocket (STOMP)
- **Discovery:** Eureka Service Registry

---

## ⚙️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Spring Security (JWT)

### Infrastructure & Messaging
- MySQL
- Redis (Geo Queries)
- Kafka
- WebSocket (STOMP)
- Eureka Service Discovery

### Build & Migration
- Gradle / Maven
- Flyway

---

## 📂 Project Structure

Ride-Hailing-Microservices/
├── auth-service
├── booking-service
├── location-service
├── entity-service
├── review-service
├── socket-service
├── service-discovery
├── README.md
└── .gitignore


---

## 🚀 How to Run the Project

### Prerequisites
- Java 17+
- MySQL
- Redis
- Kafka & Zookeeper

### Steps

1. Start **service-discovery**
```bash
cd service-discovery
./mvnw spring-boot:run
Start infrastructure services
(MySQL, Redis, Kafka)

Start required microservices


cd auth-service
./mvnw spring-boot:run
Test APIs using Postman or any API client

🔑 Sample API Endpoints
Authentication
POST /auth/register
POST /auth/login

Ride Booking
POST /booking/create
GET  /booking/{rideId}

Location
GET /location/nearby-drivers
🔮 Future Enhancements
API Gateway (Spring Cloud Gateway)

Rate limiting & request validation

Docker & Kubernetes deployment

CI/CD pipeline (GitHub Actions)

🧠 Key Learnings
Designing scalable microservices

Real-time system architecture

Event-driven communication

Geo-spatial data handling

Secure authentication strategies

👨‍💻 Author
Satyam Choubey
