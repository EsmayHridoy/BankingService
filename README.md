# Banking Service Application

This project is a simple **Banking Service API** built using **Java Spring Boot** and **MySQL** as the database. The service includes features like account creation, balance inquiry, credit/debit transactions, account transfers, and generating bank statements. It also integrates email notifications for transactions such as credits, debits, and transfers.

## Features

- **User Account Management:**
  - Create a new account.
  - Check balance for an existing account.
  - Name enquiry for an account using account number.
  
- **Transactions:**
  - Credit an account.
  - Debit an account.
  - Transfer between accounts.
  - Save and log transactions.
  
- **Bank Statements:**
  - Generate bank statements for an account within a specific date range.
  - Export the statement as a PDF.
  - Send the PDF via email.

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
## Conclusion

The Banking Service Application provides a robust foundation for managing user accounts, handling transactions, and generating bank statements. As a project built with Java Spring Boot and MySQL, it leverages powerful technologies to deliver a scalable and efficient solution. While the application covers essential banking functionalities, there's still room for growth and enhancement. Future updates will focus on integrating additional security features, improving error handling, and enhancing the user experience.

Feel free to explore the code, contribute improvements, and adapt the project to meet specific needs. Your feedback and contributions are highly valued as we continue to develop and refine this application.

Thank you for your interest in the Banking Service Application!

