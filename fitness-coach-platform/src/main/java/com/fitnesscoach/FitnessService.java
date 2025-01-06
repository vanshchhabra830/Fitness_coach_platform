package com.fitnesscoach;

public interface FitnessService {
    void registerUser(User user);
    Optional<User> validateUser(String email, String password);
}
