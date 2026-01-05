# 🚕 Ride Hailing Microservices Platform

A production-style backend system for a ride-hailing application built using Spring Boot microservices.  
The project focuses on scalability, modular design, and real-time communication.

---

## ✨ Key Features

- Microservices-based architecture
- Mono-repo structure for centralized management
- Real-time communication support
- Decoupled authentication service
- Service discovery using Eureka
- Clean layered architecture

---

## 🧩 Microservices

- **auth-service**  
  Handles authentication and JWT token management (kept decoupled).

- **booking-service**  
  Manages ride booking lifecycle and ride status.

- **location-service**  
  Tracks real-time driver locations using Redis and geo-queries.

- **entity-service**  
  Contains shared domain models used across services.

- **review-service**  
  Manages ride ratings and user reviews.

- **socket-service**  
  Provides real-time updates using WebSocket and STOMP.

- **service-discovery**  
  Eureka-based service registry for service discovery.

---

## 🏗 Architecture

- Microservices-based backend system
- Mono-repo for better orchestration and version control
- Controller → Service → Repository pattern
- Asynchronous and real-time communication support
- Database migration using Flyway
- Service discovery ready

---

## ⚙️ Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- Spring Security (JWT)
- MySQL
- Redis
- Kafka
- WebSocket (STOMP)
- Eureka Service Discovery
- Gradle / Maven

---

## 📂 Project Structure

```
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
```

---

## 🚀 How to Run

1. Start `service-discovery`
2. Start required microservices
3. Test APIs using Postman or any API client

---

## 👨‍💻 Author

**Satyam Choubey**
