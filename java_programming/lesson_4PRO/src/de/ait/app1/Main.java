package de.ait.app1;

import de.ait.app1.controllers.UserController;
import de.ait.app1.repositories.UserRepository;
import de.ait.app1.repositories.impl.UserRepositoryImpl;
import de.ait.app1.services.UserService;
import de.ait.app1.services.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRepository userRepository = new UserRepositoryImpl();
        UserService userService = new UserServiceImpl(userRepository);
        UserController userController = new UserController(scanner, userService);

        // userController.addUser();

        boolean isRun = true;
        while (isRun) {
            System.out.println("Input command(address): ");
            String command = scanner.nextLine();

            switch (command) {
                case "/addUser" -> userController.addUser();
                case "/users" -> userController.getAllUsers();
                case "/exit" -> isRun = false;
            }
        }
    }
}
