package com.mycompany.tp_mod12_1302213026;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserDataTest {
    
    @Test
    void testSuccessfulLogin() {
        UserData user = new UserData(1234, 8766);
        user.login();
        assertTrue(user.isLoggedIn());
    }

    @Test
    void testUnsuccessfulLogin() {
        UserData user = new UserData(1234, 1234);
        user.login();
        assertFalse(user.isLoggedIn());
    }

    @Test
    void testAssertions() {
        UserData user = new UserData(9999, 1);
        Exception exception = assertThrows(AssertionError.class, user::login);
        assertEquals("Password harus 4 digit", exception.getMessage());
    }

    @Test
    void testLoginFailedException() {
        UserData user = new UserData(1234, 1234);
        try {
            user.login();
        } catch (Exception e) {
            assertTrue(e instanceof LoginFailedException);
            LoginFailedException ex = (LoginFailedException) e;
            assertEquals(1234, ex.getUserid());
        }
    }
}
