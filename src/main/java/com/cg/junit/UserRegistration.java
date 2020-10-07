package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean phNo(String num) {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        if (num == null) {
            return false;
        }
        Matcher m = p.matcher(num);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        UserRegistration userRegistration = new UserRegistration();
        System.out.println( "Enter Phone number " );
        System.out.println( userRegistration.phNo( sc.nextLine() ) );
    }
}