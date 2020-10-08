package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.name( "Akhil" ) );
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter the valid first name" );
        }
    }
    @Test
    public void givenLastName_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.name( "Kumar" ) );
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter the valid last name" );
        }
    }
    @Test
    public void givenMobile_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.phNo( "91 2581475625" ) );
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter the valid mobile number" );
        }
    }
    @Test
    public void givenPassword_whenEntered_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.password( "Akhilkumasr$434" ) );
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter the valid password" );
        }
    }
    

    @Test
    public void givenEmail_whenEntered_shouldReturnCorrect() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertEquals( true, userRegistration.emailId( "akhilkumar@gmail.com" ) );
        } catch (Exception e) {
            throw new InvalidDetailsException( "Enter valid email" );
        }
    }
}



