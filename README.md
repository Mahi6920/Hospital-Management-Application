# 🏥 Hospital Management System (Console-Based | Java)

#📌 Overview
This project is a console-based Hospital Management System built using core Java Object-Oriented Programming (OOP) principles and Data Structures.
The goal of this project is to strengthen understanding of system design, object modeling, and collection frameworks without using any database or external frameworks. All data is managed in-memory.

🎯 Project Objective
  - To implement a real-world system using:
  - Clean architecture
  - Proper responsibility distribution
  - Strong OOP principles
  - Efficient Java collections


# 1️⃣ Abstraction
Person is an abstract class.
Forces subclasses to implement displayDetails().

# 2️⃣ Inheritance
Doctor and Patient extend Person.

# 3️⃣ Encapsulation
All fields are private/protected.
Internal state controlled through methods.
Business rules enforced inside classes.

# 4️⃣ Polymorphism
Method overriding (displayDetails()).
Runtime behavior using subclass references.

# 📚 Data Structures Used
Data Structure	Purpose
  - HashMap<Integer, Doctor>	Fast doctor lookup by ID (O(1))
  - HashMap<Integer, Patient>	Fast patient lookup by ID (O(1))
  - Queue<Appointment>	FIFO appointment processing
  - Enum	Manage appointment status

# 🚀 How to Run
Clone the repository
Open in any Java IDE (IntelliJ / Eclipse / VS Code)
Run Main.java
