Lazy Initialization in Grails Broken?!
--------------------------------------

Grails
======
Start the grails app `grails-lazy-isse`
1. Start the spring boot app `grails-lazy-issue` via `./gradlew bootRun`
2. Notice the bean wiring output is logged during boot time

The lazy beans are being eagerly loaded.
 

Spring Boot 
===========
1. Start the spring boot app `spring-boot-lazy` via `./gradlew bootRun`
2. Hit endpoint `http://localhost:8080/index` notice the output is clean
3. Hit endpoint `http://localhost:8080/foo/index` notice the bean wiring output is logged

The lazy wiring worked as expected
