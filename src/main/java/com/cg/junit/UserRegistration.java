package com.cg.junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean name(String name) throws InvalidDetailsException {
        try {
            String regex = "^[A-Z][a-zA-Z]{2,}$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( name );
            return m.matches();
        }catch (Exception e){
            throw new InvalidDetailsException( "Enter valid name" );

        }
    }

    public static boolean phNo(String num) throws InvalidDetailsException {
        try {
            String regex = "^[0-9]{2}\\s[0-9]{10}$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( num );
            return m.matches();
        }catch (Exception e){
            throw new InvalidDetailsException( "Enter valid number" );

        }
    }

    public static boolean emailId(String email) throws InvalidDetailsException {
       try {
           String regex = "^[A-Za-z0-9]{1}[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9]+(\\.[A-Za-z0-9]+){0,1}(\\.[A-Za-z]{2,})$";
           Pattern p = Pattern.compile( regex );
           Matcher m = p.matcher( email );
           return m.matches();
       }catch (Exception e){
           throw new InvalidDetailsException( "Enter valid email" );
       }
    }

    public static boolean password(String pass) throws InvalidDetailsException {
        try {
            String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?!.*[<>`])" + "(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)" + ".{8,}$";
            Pattern p = Pattern.compile( regex );
            Matcher m = p.matcher( pass );
            return m.matches();
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter valid password" );
        }
    }

    public String happySad(String message) throws InvalidDetailsException {
        try {
            if (message.contains( "sad" ))
                return "sad";
            else
                return "happy";
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter valid message" );
        }
    }
}
