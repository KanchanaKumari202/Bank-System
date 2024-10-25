package com.bank.system.Bank_System_Kanchana.service.impl;

import com.bank.system.Bank_System_Kanchana.dto.BankResponse;
import com.bank.system.Bank_System_Kanchana.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
