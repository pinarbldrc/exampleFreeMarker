# exampleFreeMarker
 Sending Email use FreeMarker Template Engine with SpringBoot
This repository contains a Spring Boot application with FreeMarker.You will find sending Email and save to database(PostgreSQL)with uuid(Primary Key)<br>
GET STARTED
-----------------------------------------------------------------------
1-Making the configuration settings(SwaggerUİ and FreeMarker)<br>
2-DB Setting(in appplication.yml)
   ```  platform: postgresql
    driverClassName: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/freeMarkerDataBase
    username: postgres
    password: admin
   ``` 
3-Mail Setting(choose which mail extension to use)
   ```  smtp:
      ssl:
        trust: smtp.gmail.com
    protocol: smtp
    host: smtp.gmail.com
    port: 587
    properties:
      mail:
        smtp:
          ssl:
            trust: smtp.gmail.com
          auth: true
          starttls:
            required: true
            enable: true
 ```            
 4-Create  Repository-Service pattern(JPA Repository)(
The id will not be entered when registering to the database)<br>
 5-Run the Application
 

