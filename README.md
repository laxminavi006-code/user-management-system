# 🚀 User Management System (Spring Boot)

A backend REST API project built using Spring Boot that provides user registration, login, and CRUD operations.

---

## 📌 Features

* ✅ User Registration
* 🔐 Login & Logout API
* 📄 CRUD Operations (Create, Read, Update, Delete)
* ✔️ Input Validation (Jakarta Validation)
* ⚠️ Global Exception Handling
* 🗄️ Database Integration (JPA + Hibernate)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL / H2 Database
* Maven
* Postman (API Testing)

---

## 📂 Project Structure

com.palle1
├── controller
├── service
├── repository
├── entity
├── dto
└── exception

---

## ⚙️ How to Run

1. Clone the repository:
   git clone https://github.com/laxminavi006-code/user-management-system.git

2. Open in Eclipse / Spring Tool Suite

3. Run the main class:
   UseropApplication.java

4. Server starts at:
   http://localhost:8080

---

## 🔗 API Endpoints

### ➤ Add User

POST /user/add

### ➤ Login

POST /user/login

### ➤ Logout

POST /user/logout

### ➤ Get All Users

GET /user/all

### ➤ Get User by ID

GET /user/{id}

### ➤ Update User

PUT /user/update/{id}

### ➤ Delete User

DELETE /user/delete/{id}

---

## 🧪 Testing

Use Postman to test APIs.

---

## 🔒 Future Improvements

* JWT Authentication
* Password Encryption (BCrypt)
* Role-based Authorization
* Swagger API Documentation

---

## 👩‍💻 Author

Laxmi Navi
