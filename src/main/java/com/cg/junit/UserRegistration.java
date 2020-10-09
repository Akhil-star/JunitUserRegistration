package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean name(String name) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        return  pattern.matcher(name).matches();
    }

    public static boolean emailId(String email) {
        String regex = "^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$";
        Pattern p = Pattern.compile( regex );
        Matcher m = p.matcher( email );
        return m.matches();
    }

    public static boolean phNo(String num) {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(num);
        return m.matches();
    }

    public static boolean password(String pass) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        Pattern p = Pattern.compile( regex );
        Matcher m = p.matcher( pass );
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter the First name");
        System.out.println(userRegistration.name(sc.nextLine()));
        System.out.println("Enter the last name");
        System.out.println(userRegistration.name(sc.nextLine()));
        System.out.println("Enter the EmailId");
        System.out.println(userRegistration.emailId(sc.nextLine()));
        System.out.println( "Enter Phone number " );
        System.out.println( userRegistration.phNo( sc.nextLine() ) );
        System.out.println( "Enter Password " );
        System.out.println( userRegistration.password( sc.nextLine() ) );
    }
}