package com.uservalidatortesting;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    // Test Cases for First Name
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
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveFirstName_WhenLessThanThreeChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Ni");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveFirstName_WhenStartingCharIsSmall_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("nikhil");
        Assert.assertEquals(false, result);
    }

    // Test Cases for Last Name
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Dhruwe");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveLastName_WhenLessThanThreeChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Dh");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveLastName_WhenNumericProvided_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Dhruwe123");
        Assert.assertEquals(false, result);
    }

    //Test Cases for Phone Number
    @Test
    public void givePhoneNumber_WhenProperWithCode_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("90 9876543210");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givePhoneNumber_WhenProperWithDashSymbolAfterCode_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("90-9876543210");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givePhoneNumber_When10DigitsNotProivded_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber( "98765432");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givePhoneNumber_WhenAlphabet_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("a987654321");
        Assert.assertEquals(false, result);
    }
}
