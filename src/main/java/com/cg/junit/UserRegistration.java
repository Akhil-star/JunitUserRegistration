package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean firstName(String fname) {
        String regex = "^[A-Z]{1}[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        return  pattern.matcher(fname).matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter First name ");
        System.out.println(userRegistration.firstName(sc.nextLine()));
    }
}
