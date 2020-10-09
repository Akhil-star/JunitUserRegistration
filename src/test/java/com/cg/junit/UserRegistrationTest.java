package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.name( "Akhil" ) );
    }

    @Test
    public void givenFirstName_whenNotProper_shouldReturnFalse() {
        Assert.assertFalse( userRegistration.name( "Ak" ) );
    }
    @Test
    public void givenLastName_whenProper_shouldReturnTrue(){
     Assert.assertTrue( userRegistration.name( "Kumar" ) );
    }

    @Test
    public void givenLastName_whenNotProper_shouldReturnFalse(){
        Assert.assertFalse( userRegistration.name( "Ku@" ) );
    }

    @Test
    public void givenMobile_whenProper_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.phNo( "91 2581475625" ) );
    }

    @Test
    public void givenMobile_whenNotProper_shouldReturnFalse() {
        Assert.assertFalse( userRegistration.phNo( "9 2581475625" ) );
    }

    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        Assert.assertTrue( userRegistration.password( "Akhilakki$2345" ) );
    }

    @Test
    public void givenPassword_whenNotProper_shouldReturnFalse() {
        Assert.assertFalse( userRegistration.password( "Akhilakki$$2345" ) );
    }

    @Test
    public void givenEmail_whenProper_shouldReturnTrue() {
        Assert.assertTrue(  userRegistration.emailId( "akhilakki@gmail.com" ) );
    }

    @Test
    public void givenEmail_whenNotProper_shouldReturnFalse() {
        Assert.assertFalse(  userRegistration.emailId( "akhilakki@gmail.com.com.com" ) );
    }
}


