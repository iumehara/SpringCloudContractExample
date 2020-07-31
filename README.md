# Spring Cloud Contract Example


## Stack
- Spring Boot
- Spring Cloud Contract
- Java
- Gradle

## Setup
Test & Build Producer
- `cd producer`
- `make build` # will publish stubs to local maven repo after successful test

Test & Build Consumer
- `cd consumer`
- `make build` # will install producer stubs before running tests and building 

## TODO
- try `StubsMode.CLASSPATH` and `StubsMode.REMOTE`
- try with `build.gradle.kt` file 
