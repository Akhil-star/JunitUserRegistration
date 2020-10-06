package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    
    @Test
    public void givenEmail_whenMatches_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        String  emailId1 = userRegistration.emailId("mayabrahma@gmail.com.com");
        String  emailId2 = userRegistration.emailId("akl123@gmail.a");
        String regex = "^[_a-z0-9-\\+]+(\\.[_a-z0-9-]+)*@[a-z0-9]+(\\.[a-z0-9]+)*(\\.[a-z]{2,})$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , emailId1.matches( p.pattern() ));
        Assert.assertEquals(false,emailId2.matches( p.pattern() ));

    }

}
