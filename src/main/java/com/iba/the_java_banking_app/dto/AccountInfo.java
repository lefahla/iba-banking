package com.iba.the_java_banking_app.dto;

import lombok.Data;
import lombok.Builder;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountInfo {
    private String accountName;

    private BigDecimal accountBalance;
    private String accountNumber;


}
