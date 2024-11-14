package com.bank.system.Bank_System_Kanchana.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TransferRequest {

    private String sourceAccountNumber;
    private String destinationAccountNumber;
    private BigDecimal amount;

}
