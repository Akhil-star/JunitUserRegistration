package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue( userRegistration.name( "Akhil" ) );
    }

    @Test
    public void givenLastName_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue( userRegistration.name( "Kumar" ) );
    }

    @Test
    public void givenMobile_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue( userRegistration.phNo( "91 2581475625" ) );
    }

    @Test
    public void givenPassword_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
            UserRegistration userRegistration=new UserRegistration();
            Assert.assertTrue( userRegistration.password( "na" ) );
        }


    @Test
    public void givenString_whenEntered_shouldReturnSad() throws InvalidDetailsException {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals( "happy", userRegistration.happySad( " " ) );
    }


    @Test
    public void givenEmail_whenEntered_shouldReturnCorrect() throws InvalidDetailsException {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertEquals( true, userRegistration.emailId( "akhilkumar@gmail.com" ) );
    }
}



