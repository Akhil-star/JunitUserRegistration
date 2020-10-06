package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenLastName_whenMatches_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        String  lastname = userRegistration.lastName("Mayabrahma");
        String  lastname1 = userRegistration.lastName("ak");
        String regex = "^[A-Z]"+"[A-Za-z]{2,}$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , lastname.matches( p.pattern() ));
        Assert.assertEquals(false,lastname1.matches( p.pattern() ));

    }
}
