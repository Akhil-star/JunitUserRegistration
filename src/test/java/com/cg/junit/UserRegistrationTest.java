package com.cg.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_whenMatches_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        String firstname = userRegistration.firstName("Akhil");
        String  firstname1 = userRegistration.firstName("ak");
        String regex = "^[A-Z]"+"[A-Za-z]{2,}$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , firstname.matches( p.pattern() ));
        Assert.assertEquals(false, firstname1.matches( p.pattern() ));

    }

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
    @Test
    public void givenPhno_whenMatches_ShouldReturn() {
        UserRegistration userRegistration = new UserRegistration();
        String  phoneNo1 = userRegistration.phoneNo("91 8667772345");
        String  phoneNo2 = userRegistration.phoneNo("9 9876556789");
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern p =Pattern.compile(regex);
        Assert.assertEquals(true , phoneNo1.matches( p.pattern() ));
        Assert.assertEquals(false,phoneNo2.matches( p.pattern() ));

    }
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
