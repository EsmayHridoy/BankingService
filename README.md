# Banking Service Application

This project is a simple **Banking Service API** built using **Java Spring Boot** and **MySQL** as the database. The service includes features like account creation, balance inquiry, credit/debit transactions, account transfers, and generating bank statements. It also integrates email notifications for transactions such as credits, debits, and transfers.

## Features

- **User Account Management:**
  - Create a new account.
  - Check balance for an existing account.
  - Name enquiry for an account using account number.
  - Sent alert email.
  
- **Transactions:**
  - Credit an account.
  - Debit an account.
  - Transfer between accounts.
  - Save and log transactions.
  - Sent alert email.
  
- **Bank Statements:**
  - Generate bank statements for an account within a specific date range.

## Technologies Used

- **Backend:**
  - Java Spring Boot
  - Spring Data JPA
  - Spring Mail for email services

- **Database:**
  - MySQL
  
- **Miscellaneous:**
  - Lombok for reducing boilerplate code
  - Maven for project dependency management

## Setup

### Prerequisites

1. **Java 11 or above**
2. **Maven**
3. **MySQL**
4. **SMTP Email Server Configuration**

## API Endpoints
### User Management
### Create Account
POST /api/v1/user/create
Request body:

```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john.doe@example.com",
  "phoneNumber": "1234567890",
  "alternativePhoneNumber": "0987654321",
  "address": "123 Main St",
  "stateOfOrigin": "New York",
  "gender": "Male"
}
```
### Balance Enquiry
POST /api/v1/user/balance-enquiry
Request body:

```json
{
  "accountNumber": "1234567890"
}
```
### Name Enquiry
POST /api/v1/user/name-enquiry
Request body:

```json
{
  "accountNumber": "1234567890"
}
```
## Transactions
### Credit Account
POST /api/v1/transaction/credit
Request body:

```json
{
  "accountNumber": "1234567890",
  "amount": 1000
}
```
### Debit Account
POST /api/v1/transaction/debit
Request body:

```json
{
  "accountNumber": "1234567890",
  "amount": 500
}
```
### Transfer Funds
POST /api/v1/transaction/transfer
Request body:

```json
{
  "sourceAccountNumber": "1234567890",
  "destinationAccountNumber": "0987654321",
  "amount": 200
}
```
### Bank Statements
Generate Statement
GET /api/v1/statement/{accountNumber}/{startDate}/{endDate}
Response: List of transactions between startDate and endDate.

## Project Structure
```bash
src
│
├───main
│   ├───java/com/esmay/bankingService
│   │   ├───controller  # REST API controllers
│   │   ├───dto         # Data Transfer Objects
│   │   ├───entity      # JPA entities
│   │   ├───repository  # Repositories for database operations
│   │   ├───service     # Service layer for business logic
│   │   ├───utils       # Utility classes
│   └───resources
│       ├───application.properties  # Configuration file
│
└───test
    └───java/com/esmay/bankingService  # Unit and integration tests
```
## ER Diagram
![459128213_1973634026489453_8041061189010469146_n](https://github.com/user-attachments/assets/db285fa5-01c4-4747-a90c-c75a89347560)


## Conclusion

The Banking Service Application is a comprehensive backend system built with Java Spring Boot and MySQL, featuring core functionalities such as account creation, balance inquiries, transaction management, and bank statement generation. The project includes integration with an email service for transaction notifications, providing a complete solution for managing banking operations.

### Completed Features

- User Account Management: Create accounts, check balances, and perform name inquiries.
- Transaction Management: Credit and debit accounts, as well as transfer funds between accounts.
- Bank Statements: Generate statements for specific date ranges.
- Email Notifications: Integrated email service to send notifications for transactions.

### In Progress

- **Authentication:** The application currently lacks user authentication and authorization features. Implementing security measures such as JWT authentication will be a priority in future updates.
- **Frontend:** There is no frontend interface included at this stage. Developing a user-friendly web or mobile interface to interact with the backend will be considered for future enhancements.

I appreciate your interest in the Banking Service Application and welcome any feedback or contributions. The project will continue to evolve with additional features and improvements as we move forward.

Thank you for exploring this project!



