package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenMatches_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        String  firstname = userRegistration.firstName("Akhil");
        String firstname1 = userRegistration.firstName("akki");
        String regex = "^[A-Z]"+"[A-Za-z]{2,}$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , firstname.matches( p.pattern() ));
        Assert.assertEquals(false,firstname1.matches( p.pattern() ));

    }
}
