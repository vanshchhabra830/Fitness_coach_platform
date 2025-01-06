package com.fitnesscoach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOImplTest {
    private UserDAO userDAO = new UserDAOImpl();

    @Test
    void testSaveAndFindAll() {
        User user = new User("test@example.com", "password123");
        userDAO.save(user);
        assertFalse(userDAO.findAll().isEmpty());
    }
}