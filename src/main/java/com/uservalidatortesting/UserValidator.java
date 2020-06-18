package com.uservalidatortesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    private static final String FIRST_NAME_PATTERN="^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME_PATTERN="^[A-Z][a-z]{2,}$";
    private static final String EMAIL_PATTERN="^[a-zA-Z0-9]+([.+-_]?[a-zA-Z0-9]+)*" +
                                                "@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    public boolean validateFirstName(String fname) {
        Pattern pattern=Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(fname).matches();

    }

    public boolean validateLastName(String lname) {
        Pattern pattern=Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(lname).matches();

    }

    public boolean validateEmailAdress(String email2Test) {
        Pattern pattern= Pattern.compile(EMAIL_PATTERN);
        Matcher matcher=pattern.matcher(email2Test);
        return matcher.matches();
    }
}
