package com.iba.the_java_banking_app.utils;

import java.time.Year;

public class AccountUtils {
    public static String generateAccountNumber(){
        /*
         * year +randomSixDigits
         * */
        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        // Generate a random number between min and max

        int randNumber = (int)Math.floor(Math.random() * ( max - min + 1 ) + min);

        // Convert the current and randomNumber to Strings , then conc together
        String year = String.valueOf(currentYear);
        String randomNumber = String.valueOf(randNumber);
        StringBuffer accountNumber = new StringBuffer();

        return accountNumber.append(year).append(randomNumber).toString();
    }

}
