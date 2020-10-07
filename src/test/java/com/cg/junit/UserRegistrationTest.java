package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenMobile_whenEntered_shouldReturnTrue() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue( userRegistration.phNo( "91 2581475625" ) );
    }
}
