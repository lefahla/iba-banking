package com.iba.the_java_banking_app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo {
    private String acccountName;
    private String accountBalance;
    private String accountNumber;

}
