package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {
    @Test
    public void givenPassword_whenMatches_ShouldReturn() {
        UserRegistration userRegistration = new UserRegistration();
        String  password1 = userRegistration.password("AkhilKuma@3");
        String  password2 = userRegistration.password("Akhilkumar@@4");
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s)[a-zA-Z0-9]*[^a-zA-Z0-9\\s]{1}[a-zA-Z0-9]*$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , password1.matches( p.pattern() ));
        Assert.assertEquals(false,password2.matches( p.pattern() ));

    }
}
