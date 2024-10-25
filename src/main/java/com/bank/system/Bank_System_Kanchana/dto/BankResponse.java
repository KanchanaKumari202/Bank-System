package com.bank.system.Bank_System_Kanchana.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class BankResponse {

    private String responseCode;
    private String responseMessage;
    private AccountInfo accountInfo;
}
