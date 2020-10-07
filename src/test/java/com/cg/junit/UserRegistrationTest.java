package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenEmail_whenEntered_shouldReturnCorrect() {
        UserRegistration userRegistration=new UserRegistration();
        Assert.assertTrue( userRegistration.emailId( "akhilakki13@gmail.com" ) );
    }

}
