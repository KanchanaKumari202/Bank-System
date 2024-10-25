package com.bank.system.Bank_System_Kanchana.repository;

import com.bank.system.Bank_System_Kanchana.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
