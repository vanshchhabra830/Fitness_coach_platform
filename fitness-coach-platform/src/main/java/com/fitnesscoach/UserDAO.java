package com.fitnesscoach;

import java.util.List;
import java.util.Optional;

public interface UserDAO {
    
    /**
     * Saves a new user to the database.
     * 
     * @param user The user to be saved.
     */
    void save(User user);

    /**
     * Finds all users in the database.
     * 
     * @return A list of all users.
     */
    List<User> findAll();

    /**
     * Finds a user by their ID.
     * 
     * @param id The ID of the user to find.
     * @return An Optional containing the user if found, or empty if not.
     */
    Optional<User> findById(Long id);

    /**
     * Updates an existing user's information.
     * 
     * @param user The user with updated information.
     */
    void update(User user);

    /**
     * Deletes a user from the database.
     * 
     * @param id The ID of the user to delete.
     */
    void delete(Long id);

    /**
     * Validates user credentials for login.
     * 
     * @param email The email of the user.
     * @param password The password of the user.
     * @return An Optional containing the user if credentials are valid, or empty if not.
     */
    Optional<User> validateUser (String email, String password);
}