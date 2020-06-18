package com.uservalidatortesting;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Nikhil");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_WhenSpecialChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Nikh@il");
        Assert.assertEquals(true, result);
    }
}
