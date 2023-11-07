package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PasswordValidationTest {
    @Test
    void ifLengh_more_than_seven_return_true(){
        String pw = "Passwort123";
        boolean actual = PasswordValidation.lenghTest(pw);

        assertEquals(true, actual);
    }

    @Test
    void if_Contains_Nubers_return_True(){
        String pw = "Passwort123";
        boolean actual = PasswordValidation.numberTest(pw);

        assertEquals(true, actual);
    }

    @Test
    void If_Contains_Upper_and_Lowercase_return_True(){
        String pw = "Passwort123";
        boolean actual = PasswordValidation.UpperLowercaseTest(pw);

        assertEquals(true, actual);
    }

    @Test
    void If_One_of_given_Password_return_false(){
        String pw = "Password123";
        boolean actual = PasswordValidation.givenPwTest(pw);

        assertEquals(true, actual);

    }
    @Test
    void If_Contains_Special_Characters_return_true(){
        String pw = "Password123";
        boolean actual = PasswordValidation.specialCharTest(pw);

        assertEquals(false, actual);
    }

}