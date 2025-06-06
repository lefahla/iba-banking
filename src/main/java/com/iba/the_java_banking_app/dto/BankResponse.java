package com.iba.the_java_banking_app.dto;


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
