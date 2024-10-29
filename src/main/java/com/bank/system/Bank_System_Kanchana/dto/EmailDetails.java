package com.bank.system.Bank_System_Kanchana.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class EmailDetails {

    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}
