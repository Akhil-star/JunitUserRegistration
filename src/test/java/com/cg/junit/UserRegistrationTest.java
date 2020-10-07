package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

public class UserRegistrationTest {

    private final String email;
    private boolean expected_result;

    UserRegistration userRegistration = new UserRegistration();

    public UserRegistrationTest(String email, boolean expected_result) {
        this.email = email;
        this.expected_result = expected_result;
    }

    @Test
    public void givenFirstName_whenEntered_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.name( "Akhil" ) );
    }

    @Test
    public void givenLastName_whenEntered_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.name( "Kumar" ) );
    }

    @Test
    public void givenMobile_whenEntered_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.phNo( "91 2581475625" ) );
    }

    @Test
    public void givenPassword_whenEntered_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.password( "Akhilakki@2345" ) );
    }

    @Test
    public void givenString_whenEntered_shouldReturnSad() {
        Assert.assertEquals( "happy", userRegistration.happySad( "happy" ) );
    }

    @Parameterized.Parameters
    public static Collection validEmail() {
        return Arrays.asList( new Object[][]{{"abc@gmail.com", true}, {"abc-100@gmail.com", true}, {"abc.100@gmail.com", true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@gmail.com.au", true}, {"abc@1.com", true},
                {"abc@gmail.com.com", true}, {"abc+100@gmail.com", false}, {"abc+100@gmail.com", false}, {"abc", false},
                {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                {".abc@abc.com", false}, {"abc()*@abc.com", false}, {".abc@!#$.com", false}, {"abc..2002@abc.com", false},
                {"abc.@abc.com", false}, {"abc@abc@abc.com", false}, {".abc@abc.com", false}, {"abc@abc.com.1a", false},
                {"abc@abc.com.aa.au", false}} );
    }

    @Test
    public void givenEmail_whenEntered_shouldReturnCorrect() {
        System.out.println( "Parameterized email : " + email );
        Assert.assertEquals( expected_result, userRegistration.emailId( email ) );
    }
}



