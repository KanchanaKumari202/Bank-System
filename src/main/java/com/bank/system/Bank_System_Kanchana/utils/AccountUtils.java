package com.bank.system.Bank_System_Kanchana.utils;

import java.time.Year;
import java.util.Random;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE = "001";
    public static final String ACCOUNT_EXISTS_MESSAGE = "This user already has an account!";
    public static final String ACCOUNT_CREATED_CODE = "002";
    public static final String ACCOUNT_CREATED_MESSAGE = "Account created successfully!";
    public static final String ACCOUNT_NOT_EXIST_CODE = "003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE = "User with the provided account number does not exists!";
    public static final String ACCOUNT_FOUND_CODE = "004";
    public static final String ACCOUNT_FOUND_SUCCESS = "User Account Found!";
    public static final String ACCOUNT_CREDITED_SUCCESS = "005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE = "User account credited successfully!";
    public static final String INSUFFICIENT_BALANCE_CODE = "006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE = "Insufficient Balance in account!";
    public static final String ACCOUNT_DEBITED_SUCCESS = "007";
    public static final String ACCOUNT_DEBITED_MESSAGE = "Account has been debited successfully!";


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
