package com.bank.system.Bank_System_Kanchana.repository;

import com.bank.system.Bank_System_Kanchana.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
