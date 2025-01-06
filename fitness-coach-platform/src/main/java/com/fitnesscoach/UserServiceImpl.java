package com.fitnesscoach;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void registerUser (User user) {
        // You can add additional validation logic here if needed
        userDAO.save(user);
    }

    @Override
    public Optional<User> validateUser (String email, String password) {
        // Validate user credentials
        return userDAO.validateUser (email, password);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public Optional<User> getUser; ById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public void updateUser (User user) {
        userDAO.update(user);
    }

    @Override
    public void deleteUser (Long id) {
        userDAO.delete(id);
    }
}