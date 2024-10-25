package com.bank.system.Bank_System_Kanchana.utils;

import java.time.Year;
import java.util.Random;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account!";
    public static final String ACCOUNT_CREATED_CODE = "002";
    public static final String ACCOUNT_CREATED_MESSAGE = "Account created successfully!";

    public static String generateAccountNumber(){
        /**
         * 2024 + random 6 digit number
         */

        Year currentYear = Year.now();
        int min = 100000;
        int max = 999999;

        //generate a random number between 100000 and 999999
        Random random = new Random();
        int randomNumber = min + random.nextInt(max);

        //concatenate current year and random number to get the accountNumber
        String year = String.valueOf(currentYear);
        String Number = String.valueOf(randomNumber);

        return year+Number;
    }

}
