package de.ait.app1.controllers;

import de.ait.app1.models.User;
import de.ait.app1.services.UserService;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private final Scanner scanner;
    private final UserService userService;

    public UserController(Scanner scanner, UserService userService) {
        this.scanner = scanner;
        this.userService = userService;
    }

    public void addUser() {
        // считываем с клавиатуры
        System.out.println("Input e-mail:");
        String email = scanner.nextLine();
        System.out.println("Input password:");
        String password = scanner.nextLine();
        User user = userService.addUser(email, password);
    }
    public void getAllUsers() {
        List<User> users = userService.getAllUsers();
        System.out.println(users);
    }
}
