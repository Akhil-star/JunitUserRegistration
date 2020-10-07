package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

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


    @Test
    public void givenEmail_whenEntered_shouldReturnCorrect() {
        Assert.assertTrue(  userRegistration.emailId( "akhilakki@gmail.com" ) );
    }
}


