package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenLastName_whenMatches_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        String  phoneNo1 = userRegistration.phoneNo("91 8667772345");
        String  phoneNo2 = userRegistration.phoneNo("9 9876556789");
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , phoneNo1.matches( p.pattern() ));
        Assert.assertEquals(false,phoneNo2.matches( p.pattern() ));

    }
}
