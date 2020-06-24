package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
	// write your code here
        startMenu();
    }

    public static void startMenu() throws IOException {
        IPAddressValidator ipAddressValidator = new IPAddressValidator();
        BankAccountValidator bankAccountValidator = new BankAccountValidator();
        EmailValidator emailValidator = new EmailValidator();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String pattern = "";
        boolean isTrue = true;
        int number = 0;

        while (isTrue){
            System.out.println("Choose between 1 and 4");
            System.out.println("1.IP ADDRESS VALIDATION");
            System.out.println("2.IBAN(PL) VALIDATION -> example: PL12345678901234567890123456");
            System.out.println("3.EMAIL VALIDATION");
            System.out.println("4.EXIT");

            try{
                number = Integer.parseInt(bufferedReader.readLine());
            }catch (NumberFormatException ex){
                System.out.println("DATA FORMAT IS INCORRECT\n");
            }

            switch (number){
                case 1:
                    System.out.println("ENTER IP ADDRESS");
                    pattern = bufferedReader.readLine();
                    System.out.println("YOUR IP ADDRESS IS : " + ipAddressValidator.validate(pattern) + "\n");
                    break;
                case 2:
                    System.out.println("ENTER ACCOUT NUMER (only Polish)");
                    pattern = bufferedReader.readLine();
                    System.out.println("YOUR ACCOUNT NUMBER IS : " + bankAccountValidator.validate(pattern) + "\n");
                    break;
                case 3:
                    System.out.println("ENTER E-MAIL ADDRESS");
                    pattern = bufferedReader.readLine();
                    System.out.println("YOUR EMAIL ADDRESS IS " + emailValidator.validate(pattern) + "\n");
                    break;
                case 4:
                    isTrue = false;
                    break;
                default:
                    System.out.println("YOU ENTERED NUMBER BEYOND SCOPE, TRY AGAIN!");
                    break;
            }
        }
    }
}
