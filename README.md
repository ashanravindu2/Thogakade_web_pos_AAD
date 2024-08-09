# POS System Documentation

This documentation provides details on the POS (Point of Sale) system, which is designed for managing customers, items, and orders. The backend is built using Java Servlets and MySQL, offering a RESTful API for seamless operations.

## Overview

- *Technologies:*
    - Java EE (Servlets)
    - MySQL
    - Jakarta JSON-B
    - Logback (Logging)
    - Apache Tomcat 10.1.24
    - HTML
    - CSS
    - Js
    - Java JDK 17
    - Maven

- *Project Purpose:*
  The POS system allows small to medium-sized businesses to manage their sales operations effectively, including customer management, inventory control, and order processing.

### Prerequisites

Ensure you have the following installed:

- JDK 11 or higher
- Apache Tomcat 9.x or higher
- MySQL Server
- Git (for cloning the repository)

### Installation Steps

1. *Clone the Project Repository:*
   bash
   git clone https://github.com/ashanravindu2/Thogakade_web_pos_AAD.git
   cd AAD-POS-Assignment
   

2. *Set Up MySQL Database:*
    - Create a new database in MySQL:    
      sql
      CREATE DATABASE webpos;
      
    - Import the database schema:
      bash
      mysql -u [username] -p webpos < back-end/src/main/resources/webpos.sql
      

3. *Deploy the Application:*
    - Package the project into a WAR file.
    - Deploy the WAR file to the Tomcat server.

4. *Run the Application:*
    - Start the Tomcat server and access the application at http://localhost:8080//back_end_war_exploded/

## API Reference

The system provides RESTful APIs for managing customers, items, and orders. Below is an overview of the available endpoints:


## Additional Information

### Logging and Monitoring

The application uses Logback for logging. Logs are generated in both the console and log files, providing detailed information about API requests, errors, and other significant events.

### Error Handling

The API includes robust error handling mechanisms to return meaningful HTTP status codes and messages, ensuring clients can easily identify and resolve issues.

## API Endpoint Documentation

### - Customer : https://documenter.getpostman.com/view/35385633/2sA3s3Fqbm
### -  Item : https://documenter.getpostman.com/view/35385633/2sA3s3Fqbn
### - order : https://documenter.getpostman.com/view/35385633/2sA3s3Fqbo
### - Order Detail : https://documenter.getpostman.com/view/35385633/2sA3s3Fqbp

## Conclusion

This POS system offers a comprehensive solution for managing sales operations, making it ideal for businesses that need an efficient and scalable tool. With its RESTful API, the system can easily integrate with other platforms or services, providing flexibility and ease of use.

---

This revised version introduces new sections like "Overview," "Getting Started," "Logging and Monitoring," and "Error Handling," and it reorganizes the content to give it a fresh structure. Let me know if there's anything else you'd like to tweak!
