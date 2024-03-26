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