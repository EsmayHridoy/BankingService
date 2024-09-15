package com.esmay.bankingService.service.impl;

import com.esmay.bankingService.dto.TransactionDto;


public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
