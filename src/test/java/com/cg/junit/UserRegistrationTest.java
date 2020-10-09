package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result =userRegistration.name("Kumar");
        Assert.assertTrue(result );
    }
    @Test
    public void givenLastName_whenNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result =userRegistration.name("ku");
        Assert.assertFalse( result );
    }
    @Test
    public void givenFirstName_whenSpecialChar_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result =userRegistration.name("Kumar@");
        Assert.assertFalse(result );
    }
}