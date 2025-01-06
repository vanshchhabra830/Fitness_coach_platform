package com.fitnesscoach;

import java.util.Optional;

public class FitnessServiceImpl implements FitnessService {
    private final UserDAO userDAO;

    public FitnessServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void registerUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public Optional<User> validateUser(String email, String password) {
        return userDAO.findUserByEmailAndPassword(email, password);
    }
}
