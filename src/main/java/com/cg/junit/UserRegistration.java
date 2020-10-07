package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean emailId(String email) {
        String regex = "^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$";
        Pattern p = Pattern.compile( regex );
        if (email == null) {
            return false;
        }
        Matcher m = p.matcher( email );
        return m.matches();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter the EmailId");
        System.out.println(userRegistration.emailId(sc.nextLine()));
    }
}
