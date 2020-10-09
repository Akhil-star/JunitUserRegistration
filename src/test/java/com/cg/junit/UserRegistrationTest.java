package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result =userRegistration.firstName("Akhil");
        Assert.assertTrue(result );
    }
    @Test
    public void givenFirstName_whenNotProper_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result =userRegistration.firstName("Ak");
        Assert.assertFalse( result );
    }
    @Test
    public void givenFirstName_whenSpecialChar_shouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result =userRegistration.firstName("Akhil@");
        Assert.assertFalse(result );
    }


}
