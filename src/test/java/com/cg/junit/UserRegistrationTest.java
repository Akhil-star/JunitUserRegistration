package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

        UserRegistration userRegistration = new UserRegistration();
        @Test
        public void givenEmail_whenEntered_shouldReturnCorrect() {
            Assert.assertTrue( userRegistration.emailId( "akhilakki@2345" ) );
        }
}
