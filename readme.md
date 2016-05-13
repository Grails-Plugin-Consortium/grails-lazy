Lazy Initialization in Grails Broken?!
--------------------------------------

Grails
======
1. Start the spring boot app `grails-lazy-issue` via `./gradlew bootRun`
2. Notice the bean wiring output is logged during boot time

The lazy beans are being eagerly loaded.

### Workaround?

Stop application and uncomment resources.groovy code and restart.

```
     fooService(FooService){ bean ->
            bean.lazyInit = true
        }
```

The bean is now loaded lazily, but only because the service bean is lazy loaded.

Adding the following causes the bean to still be eagerly loaded

```__
     sampleBean(SampleBean){ bean ->
         bean.lazyInit = true
     }
```

 

Spring Boot 
===========
1. Start the spring boot app `spring-boot-lazy` via `./gradlew bootRun`
2. Hit endpoint `http://localhost:8080/index` notice the output is clean
3. Hit endpoint `http://localhost:8080/foo/index` notice the bean wiring output is logged

The lazy wiring worked as expected
