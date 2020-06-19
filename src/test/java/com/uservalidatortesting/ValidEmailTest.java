package com.uservalidatortesting;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ValidEmailTest {

    private String email2Test;
    private boolean expectedResult;

    public ValidEmailTest(String email,boolean expectedResult){
        this.email2Test=email;
        this.expectedResult=expectedResult;

    }

    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true,},
                {"abc-100@yahoo.com", true,},
                {"abc.100@yahoo.com", true,},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.net.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com",true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@g.com", false},
                {"abc@agmail.com.1a", false},
                {"abc@gmail.com.au.au", false}
        });
    }

    // Test Case for Email Address
    @Test
    public void givenEmailAsVar_ShouldReturnAsPerParametrizedResult() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validateEmailAdress(this.email2Test);
        Assert.assertEquals(this.expectedResult,result);
    }
}
