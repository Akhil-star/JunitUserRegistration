package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenLastName_whenEntered_shouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue( userRegistration.name( "Kumar" ) );
    }
}