package com.iba.the_java_banking_app.services;

import com.iba.the_java_banking_app.dto.BankResponse;
import com.iba.the_java_banking_app.dto.UserRequests;
import com.iba.the_java_banking_app.entity.User;
import com.iba.the_java_banking_app.utils.AccountUtils;

import java.math.BigDecimal;

public class UserServiceImpl implements UserService{

    @Override
    public BankResponse createAccount(UserRequests userRequests) {
       /*
            Creating an account - saving a new user into db
       * */

        User newUser = User.builder()
                .firstName(userRequests.getFirstName())
                .lastName(userRequests.getLastName())
                .otherName(userRequests.getOtherName())
                .gender(userRequests.getGender())
                .address(userRequests.getAddress())
                .stateOfOrigin(userRequests.getStateOfOrigin())
                .accountNumber(AccountUtils.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userRequests.getEmail())
                .phoneNumber(userRequests.getPhoneNumber())
                .status("ACTIVE")
                .build();
    }
}
