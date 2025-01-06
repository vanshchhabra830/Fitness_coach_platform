package com.fitnesscoach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    private UserDAO userDAO = new UserDAOImpl();
    private FitnessService fitnessService = new FitnessService(userDAO);

    @Test
    void testRegisterUser () {
        User user = new User("test2@example.com", "password123");
        fitnessService.registerUser (user);
        assertEquals(1 , fitnessService.getAllUsers().size());
    }
}