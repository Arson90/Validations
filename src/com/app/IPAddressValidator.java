package com.app;

import java.util.regex.Pattern;

public class IPAddressValidator implements ValidatorInteface{
    @Override
    public boolean validate(String subject) {
        String ipV4Regex = "^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$";
        Pattern ipV4Pattern = Pattern.compile(ipV4Regex);

        if(subject == null){
            return false;
        }
        if(!ipV4Pattern.matcher(subject).matches()){
            return false;
        }

        String[] partsOfAddressIP = subject.split("\\.");

        for (String part : partsOfAddressIP) {
            if(Integer.parseInt(part) > 255 || (part.length() > 1 && part.startsWith("0"))){
                return false;
            }
        }

        return true;
    }
}
