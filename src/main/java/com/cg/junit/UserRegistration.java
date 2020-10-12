package com.cg.junit;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in );

        Validate name = (entry -> entry.matches( "^[A-Z]{1}[a-zA-Z]{2,}$" ) ? true : false);
        Validate email = (entry -> entry.matches( "^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$" ) ? true : false);
        Validate phno = (entry -> entry.matches( "^[0-9]{2}\\s[0-9]{10}$" ) ? true : false);
        Validate password = (entry -> entry.matches( "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s)[a-zA-Z0-9]*[^a-zA-Z0-9\\s]{1}[a-zA-Z0-9]*$" ) ? true : false);

        System.out.println("validate First name");
        System.out.println(name.validateEntry(sc.nextLine()));
        System.out.println("validate Last name");
        System.out.println(name.validateEntry(sc.nextLine()));
        System.out.println("validate email");
        System.out.println(email.validateEntry(sc.nextLine()));
        System.out.println("validate phone number");
        System.out.println(phno.validateEntry(sc.nextLine()));
        System.out.println("validate password");
        System.out.println(password.validateEntry(sc.nextLine()));
    }
}
@FunctionalInterface
interface Validate{
    public boolean validateEntry(String entry);
}
