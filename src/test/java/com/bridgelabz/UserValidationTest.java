package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void firstName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.firstName("Sangeeta");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void lastName_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.lastName("Kumar");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void email_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.email("math003@gmail.com");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void phoneNumber_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.phoneNumber("+919876567898");
        Assert.assertTrue(actualResult);
    }

    @Test
    public void password_Validation() {
        UserValidation validation = new UserValidation();
        boolean actualResult = validation.password("Sang@123");
        Assert.assertTrue(actualResult);
    }
}
