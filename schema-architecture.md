# Description

This Spring Boot application uses both MVC and REST controllers. Thymeleaf templates are used for the Admin and Doctor dashboards, while REST APIs serve all other modules.
The application interacts with two databases—MySQL (for patient, doctor, appointment, and admin data) and MongoDB (for prescriptions). 
All controllers route requests through a common service layer, which in turn delegates to the appropriate repositories. MySQL uses JPA entities while MongoDB uses document models.

# Data Flow based on architecture diagram

1. User accesses Appointment pages.
2. The action is routed to the REST controller
3. The REST controller calls the service layer
4. The service layer uses MySQL repositories to access MySQL database
5. The repository ensures that a appointment can be made (search for availability) and return a response to the service layer
6. The service layer returns the response to the controller
7. The controller returns a JSON response