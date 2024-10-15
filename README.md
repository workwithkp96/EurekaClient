**Spring Boot Service with Eureka Client**
**Overview**
This project is a Spring Boot application that acts as a client for a microservices architecture using Netflix Eureka for service discovery. It enables blocking communication with other services registered in the Eureka server.

**Features**
  1.Eureka Client: Automatically registers this service with the Eureka server for service discovery.
  2.Blocking Communication: Uses RestTemplate for synchronous HTTP calls to other services.
  3.Service Discovery: Retrieves service instances from Eureka to facilitate communication.
  
**Prerequisites**
Java 11 or later
Maven
Spring Boot
Eureka Server (make sure it is running) github link : https://github.com/workwithkp96/ServiceDiscoveryEureka
