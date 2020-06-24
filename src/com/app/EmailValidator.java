package com.app;

import java.util.regex.Pattern;

public class EmailValidator implements ValidatorInteface{

    @Override
    public boolean validate(String subject) {
        String emailRegex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]{1,64}\\s*@[a-zA-Z0-9.-]+$";
        Pattern emailPattern = Pattern.compile(emailRegex);

        if(subject == null){
            return false;
        }

        if(!emailPattern.matcher(subject).matches()){
            return false;
        }

        return true;
    }
}
