# REST API with Jackson for Data Binding

## add Dependencies:

- spring-webmvc: https://mvnrepository.com/artifact/org.springframework/spring-webmvc
- javax.servlet-api : https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api


### Spring rest understand that it will use jackson to convert objects to json fromant

Spring 4.0 introduced *@RestController*, a specialized version of the controller which is a convenience annotation 
that does nothing more than add the *@Controller* and *@ResponseBody* annotations. 

By annotating the controller class with *@RestController* annotation, you no longer need to add *@ResponseBody* to all the request mapping methods. By annotating the controller class with *@RestController* annotation, you no longer need to add *@ResponseBody* to all the request mapping methods.

In order to serve JSON, we will be using Jackson library *[jackson-databind.jar]*. For XML, we will use Jackson XML extension *[jackson-dataformat-xml.jar]*. Mere presence of these libraries in classpath will trigger Spring to convert the output in required format.

