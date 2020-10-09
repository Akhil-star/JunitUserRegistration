package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_whenNotProper_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.name( " " ) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_whenNotProper_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.name( null ) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobile_whenNotProper_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.phNo( "91 25814756" ) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_whenNotProper_shouldReturnTrue() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertTrue( userRegistration.password( "akhil" ) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_whenNotProper_shouldReturnCorrect() throws InvalidDetailsException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            Assert.assertEquals( true, userRegistration.emailId( "akhilkumar@.com" ) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
