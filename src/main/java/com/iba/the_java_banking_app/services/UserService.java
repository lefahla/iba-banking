package com.iba.the_java_banking_app.services;

import com.iba.the_java_banking_app.dto.BankResponse;
import com.iba.the_java_banking_app.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequests);
}
