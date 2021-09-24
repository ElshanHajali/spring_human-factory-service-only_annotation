# spring_human-factory-service-only_annotation


                       Plan
Create Human Service interface like he has legs, arm, head so on…
Create a Human interface with same method as Human Service
Create dependencies which implements Human Service interface:
1’st dependency is about Normal Human Service.
2’nd one is Disabled Human Service. 
Create objects which implements Human interface:
Create Normal Human class.
Create Disabled Human class.
When use annotation base configuration create Configuration class to configure objects.
Package structure under com.humandemo:
--Dependencies
--Objects
--Interfaces
--Configuration

                    Project types
In the Third one instead of using @Component and @ComponentScan use @Bean for 
injecting and creating objects then use the other annotations except @Qualifier and @Autowired.
Use them:  @PostConstruct, @PreDestroy, @Value, @Scope, @PropertySource.

