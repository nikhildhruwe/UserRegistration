package com.uservalidatortesting;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result= validator.validateFirstName("Nikhil");
        Assert.assertEquals(true,result);
    }
}
