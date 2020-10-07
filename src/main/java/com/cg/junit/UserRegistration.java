package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean name(String name) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern p = Pattern.compile( regex );
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher( name );
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        UserRegistration userRegistration = new UserRegistration();
        System.out.println( "Enter last name " );
        System.out.println( userRegistration.name( sc.nextLine() ) );
    }
}