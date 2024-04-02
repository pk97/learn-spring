**Notes**

1. Qualifer: 
   1. it can be used to define which bean to autowire. It is mentioned at the place of autowiring with the bean name
   and also where the bean wasa created.
2. If multiple beans are present, then primary is given preference. If yuou want to select a specific bean, use Qualifier.
3. Dependency Injection:
   4. Constructor -> no need to write autowrire. for rest you to write it.
   5. Setter
   6. field 
4. ComponentScan: Tells Spring where to search beans which will be injected as a dependency.
5. Dependency injection: process of findind right beans , wiring them to the class.
6. All beans get initialized in starting of SPring application and then autowiring takes place.
   But we can use @LAZY annotation to delay the intialisation but it is generally not recemonded as
   as it delays startup issue to production issue.
7. Scope types
   - Scope annotation is used to create a Singleton (one bean per Spring IOC continer) or Prototype.
     For protoype, everytime a new bean is created whenever the bean is accessed by context.
8. POstContruct() - Runs in the bean where it is present After all dependecies are injected.
9. PreDestory() - Runs just before the bean is destroyed by Spring container. Used to release resources.
10. In Java EE it offered XML based configuration where every bean had to be defined in XML without
    any annotations, which was a bit difficult to maintain, hence we moved a ahead with Annotations.

### SPRING BOOT ###

1. Provides all of the dependencies in starter project so configuration is easy.
2. Hence starting the application becomes very easy with Spring.
3. Auto-Configuration
   - ClassPath
     - We import classes using the import staement. But The JVM needs to exactly know where
       is the class present, so it doesn't has search in entire project.
   - AutoConfiguration is used to configure to default configurations which makes starting of application easy.
     - Eg. DispatvcherCong, ErrorResponseConfig.
4. SpringBoot profile is used to configure different cofiguration in different environments. You can create files
    such as application-dev.properties, application-prod.properties. In the default file, which is application.properties,
    set profile as spring.profile.env and spring will merge application.properties and the respective env property file.
5. Spring Actuator is a starter which gives important metrics like requests per second, thread pool size, all beans etc.
    