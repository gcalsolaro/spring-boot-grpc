# Spring Boot gRPC

![Java CI with Maven](https://github.com/gcalsolaro/spring-boot-grpc/workflows/Java%20CI%20with%20Maven/badge.svg)
> **Sample application using Google gRPC Protobuf and Spring Boot**


## Table of Contents

   * [Spring Boot gRPC](#spring-boot-grpc)
      * [Architecture](#architecture)
      * [Prerequisites](#prerequisites)
      * [Rest API](#rest-api)
         * [Spring Boot gRPC Rest API](#spring-boot-grpc-rest-api)
      

## Architecture

gRPC (gRPC Remote Procedure Calls) is an open source remote procedure call (RPC) system initially developed at Google in 2015. It uses HTTP/2 for transport, Protocol Buffers as the interface description language. It generates cross-platform client and server bindings for many languages. Most common usage scenarios include connecting services in microservices style architecture.
In this example the technology stack used is provided by Spring and Google, in particular:

* **_Spring Boot_** - 2.2.1.RELEASE
* **_Google Protobuf Protocol for client/server_** - 1.4.0

## Prerequisites
* **_JDK 8_** - Install JDK 1.8 version
* **_Maven_** - Download latest version



## Rest API

### Spring Boot gRPC Rest API

Method | URI | Description | Parameters |
--- | --- | --- | --- |
`GET` | */grpc/get* |

