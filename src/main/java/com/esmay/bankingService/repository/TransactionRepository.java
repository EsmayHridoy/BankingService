package com.esmay.bankingService.repository;

import com.esmay.bankingService.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
