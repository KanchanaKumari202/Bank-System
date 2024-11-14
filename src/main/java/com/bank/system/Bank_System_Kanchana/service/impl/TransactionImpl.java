package com.bank.system.Bank_System_Kanchana.service.impl;

import com.bank.system.Bank_System_Kanchana.dto.TransactionDto;
import com.bank.system.Bank_System_Kanchana.entity.Transaction;
import com.bank.system.Bank_System_Kanchana.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
                .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully!");
    }
}
