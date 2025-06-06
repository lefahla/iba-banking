package com.iba.the_java_banking_app.services;

import com.iba.the_java_banking_app.dto.BankResponse;
import com.iba.the_java_banking_app.dto.UserRequests;

public interface UserService {
    BankResponse createAccount(UserRequests userRequests);
}
