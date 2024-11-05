package com.bank.system.Bank_System_Kanchana.service.impl;

import com.bank.system.Bank_System_Kanchana.dto.BankResponse;
import com.bank.system.Bank_System_Kanchana.dto.CreditDebitRequest;
import com.bank.system.Bank_System_Kanchana.dto.EnquiryRequest;
import com.bank.system.Bank_System_Kanchana.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);

}
