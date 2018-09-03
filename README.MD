## The Sandwich Gateway
##### This project is a simple implementation of the [Api Gateway micro services design pattern](https://microservices.io/patterns/data/saga.html).
### Technology Stack

* Java 8
  * Spring Boot 2
  * Maven 3
* PHP 7
* Ruby 2.5
  * Rails 5
* MariaDB 10

### Modules:
  #### Bread
  A simple module written in Spring boot responsible for creating and storing sandwich breads
  #### Meat
  A simple module written in Spring boot responsible for creating and storing sandwich meat
  #### Vegetables
  A simple module written in Spring boot responsible for creating sandwich and storing vegetables
  #### CalorieCalculator
  A simple module written in Rails responsible for calculating the total calories of a sandwich
  #### Menu
  A simple module written in PHP responsible for creating and storing menus
  #### SandwichGateway
  The core module responsible for breaking down API calls to smaller ones, also responsible for 
  orchestrating the [saga pattern](https://microservices.io/patterns/data/saga.html).




