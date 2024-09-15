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

### Clone the Repository

```bash
git clone https://github.com/EsmayHridoy/bankingService.git
cd bankingService
