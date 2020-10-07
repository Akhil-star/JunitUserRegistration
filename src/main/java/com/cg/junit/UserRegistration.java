package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean password(String pass) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        Pattern p = Pattern.compile( regex );
        if (pass == null) {
            return false;
        }
        Matcher m = p.matcher( pass );
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        UserRegistration userRegistration = new UserRegistration();
        System.out.println( "Enter Password " );
        System.out.println( userRegistration.password( sc.nextLine() ) );
    }
}