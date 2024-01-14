package de.ait.app1.services;

import de.ait.app1.models.User;

import java.util.List;

public interface UserService {
    // метод для добавления пользователя
    User addUser(String email, String password);
    List<User> getAllUsers();
}
