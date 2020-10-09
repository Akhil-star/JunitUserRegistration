package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean name(String name) throws InvalidDetailsException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        Pattern p = Pattern.compile( regex );
        Matcher m = p.matcher( name );
        if( m.matches()) {
            return true;
        }
        else{
            throw new InvalidDetailsException( "Enter valid Name" );
        }
    }

    public static boolean phNo(String num) throws InvalidDetailsException {
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p = Pattern.compile( regex );
        Matcher m = p.matcher( num );
        if( m.matches()) {
            return true;
        }
        else{
            throw new InvalidDetailsException( "Enter valid Mobile Number" );
        }
    }


    public static boolean emailId(String email) throws InvalidDetailsException {
        String regex = "^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$";
        Pattern p = Pattern.compile( regex );
        Matcher m = p.matcher( email );
        if( m.matches()) {
            return true;
        }
        else{
            throw new InvalidDetailsException( "Enter valid emailId" );
        }
    }

    public static boolean password(String pass) throws InvalidDetailsException {
        String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?!.*[<>`])" + "(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)" + ".{8,}$";
        Pattern p = Pattern.compile( regex );
        Matcher m = p.matcher( pass );
        if(m.matches()){
            return true;
        }else{
            throw new InvalidDetailsException( "Enter the Valid Password" );
        }
    }


    public static void main(String[] args) throws InvalidDetailsException {
        System.out.println("Welcome to User Registration");
        Scanner sc = new Scanner( System.in );
        UserRegistration userRegistration = new UserRegistration();
        System.out.println( "Enter First name " );
        System.out.println( userRegistration.name( sc.nextLine() ) );
        System.out.println( "Enter Last name " );
        System.out.println( userRegistration.name( sc.nextLine() ) );
        System.out.println( "Enter Phone number " );
        System.out.println( userRegistration.phNo( sc.nextLine() ) );
        System.out.println( "Enter the EmailId" );
        System.out.println( userRegistration.emailId( sc.nextLine() ) );
        System.out.println( "Enter Password " );
        System.out.println( userRegistration.password( sc.nextLine() ) );
    }
}
