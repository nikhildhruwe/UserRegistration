package com.uservalidatortesting;

import com.uservalidatortesting.UserValidator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class ValidPasswordTest {
    private String passwordTest;
    private boolean expectedResult;

    public ValidPasswordTest(String password,boolean expectedResult){
        this.passwordTest=password;
        this.expectedResult=expectedResult;

    }
    
    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"acv1Q#32r", true,},
                {"AbfS2@pot", true,},
                {"abcd@A123", true,},
                {"acdeefgh", false},
                {"abc123@", false},
                {"123a",  false},
                {"abcdefA@", false},
        });
    }

    @Test
    public void getPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result=validator.validatePassword(this.passwordTest);
        Assert.assertEquals(this.expectedResult,result);
    }
}
