package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private String email = "john@gmail.com";
    private String password = "Qwerty123!";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    /*
    =========================================
    CHECK EMAIL
     */
    @Test
    void testValidEmail() {
        String validEmail = "john@gmx.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testEmailWithoutAt() {
        String invalidEmail = "john.gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDoubleAt() {
        String invalidEmail = "jo@hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDotAfterAt() {
        String invalidEmail = "john@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailLastDot() {
        String invalidEmail = "john@gmxde.";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
        invalidEmail = "john@gmxd.e";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailIncorrectSymbol() {
        String invalidEmail = "jo!hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    /*
    ==============================================
    CHECK PASSWORD
     */
    @Test
    void testValidPassword() {
        String validPassword = "Qwerty123!";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }
    @Test
    void testPasswordMinQuantitySymbols() {
        String invalidPassword = "Qwe123!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMinOneUppercaseSymbol() {
        String invalidPassword = "qwerty123!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMinOneLowercaseSymbol() {
        String invalidPassword = "QWERTY123!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMinOneDigitSymbol() {
        String invalidPassword = "Qwertyyy!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMinOneSpecialSymbol() {
        String invalidPassword = "Qwerty123";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }
}