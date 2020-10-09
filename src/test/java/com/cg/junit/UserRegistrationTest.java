package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith( Parameterized.class )
public class UserRegistrationTest {

    private  String emailId;
    private  boolean expected;

    UserRegistration userRegistration = new UserRegistration();

    public UserRegistrationTest(String emailId, boolean expected) {
        this.emailId = emailId;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection validEmail() {
        return Arrays.asList( new Object[][]{{"abc@gmail.com", true}, {"abc-100@gmail.com", true}, {"abc.100@gmail.com", true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@gmail.com.au", true}, {"abc@1.com", true},
                {"abc@gmail.com.com", true}, {"abc+100@gmail.com", false}, {"abc+100@gmail.com", false}, {"abc", false},
                {"abc@.com.my", false}, {"abc123@gmail.a", false}, {"abc123@.com", false}, {"abc123@.com.com", false},
                {".abc@abc.com", false}, {"abc()*@abc.com", false}, {".abc@!#$.com", false}, {"abc..2002@abc.com", false},
                {"abc.@abc.com", false}, {"abc@abc@abc.com", false}, {".abc@abc.com", false}, {"abc@abc.com.1a", false},
                {"abc@abc.com.aa.au", false}} );
    }

    @Test
    public void givenEmail_whenEntered_shouldReturnEqual() {
        Assert.assertEquals( expected, userRegistration.emailId( emailId ) );
    }
}



