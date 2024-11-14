package com.bank.system.Bank_System_Kanchana.service.impl;

import com.bank.system.Bank_System_Kanchana.dto.TransactionDto;
import com.bank.system.Bank_System_Kanchana.entity.Transaction;

public interface TransactionService {

    void saveTransaction(TransactionDto transactionDto);
}
