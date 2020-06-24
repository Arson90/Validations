package com.app;

import java.util.regex.Pattern;

public class BankAccountValidator implements ValidatorInteface{

    @Override
    public boolean validate(String subject) {
        String accountNumberRegex = "PL[0-9]{26}";
        Pattern accountNumberpattern = Pattern.compile(accountNumberRegex);

        if(subject == null){
            return false;
        }

        if(!accountNumberpattern.matcher(subject).matches()){
            return false;
        }

        return true;
    }
}
