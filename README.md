# Hotel Management System 🏨

A Java Swing desktop application designed to handle standard hotel management tasks. I built this project during my 4th-semester vacation period to practice Object-Oriented Programming (OOP) and database integration in Java. 

⚠️ **Note:** This project was created with the help of a YouTube tutorial and is currently **incomplete**. It served primarily as a testing and learning ground for my Java coursework!

## 🛠️ Tech Stack
* **Language:** Java
* **GUI Framework:** Java Swing & AWT
* **Database:** MySQL
* **Database API:** JDBC (Java Database Connectivity)

## 💾 Database Connection & SQL Usage
This application is directly tied to a local MySQL database to authenticate users, manage room availability, and store employee records. 

* **Connection Setup:** The database connection is handled centrally in the `Conn.java` class using the `DriverManager.getConnection()` method. By default, it connects to a local MySQL server (`localhost:3306`) and targets a database named `hotelMS`.
* **Executing Queries:** 
  * The project relies on standard SQL queries constructed as Java Strings and executed via Java's `Statement` class. 
  * **Reads (`executeQuery`):** Used in the login screens to fetch records and validate user credentials (e.g., `select * from login2 where username = '...' and password='...'`).
  * **Writes (`executeUpdate`):** Used in forms like Add Employee and Add Room to insert new data into the database tables (e.g., `insert into employee values(...)`).

## 🚀 Getting Started (Local Setup)
To run this project locally, you will need to set up the MySQL database:
1. Install MySQL and create a database named `hotelMS`.
2. Update the credentials in `Conn.java` to match your local MySQL username and password (currently set to `root` and `Sahala@2024`).
3. Create the necessary tables (`login`, `login2`, `employee`, `room`) with the appropriate columns based on the Java code insertions.
4. Ensure the **MySQL Connector/J** (`.jar`) is added to your IDE's project dependencies.

---
*Built as a 4th Sem vacation testing project.*