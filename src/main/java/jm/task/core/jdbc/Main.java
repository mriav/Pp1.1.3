package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Андрей", "Иванов", (byte) 18);
        userService.saveUser("Борис", "Ловкин", (byte) 60);
        userService.saveUser("Ирина", "Ямова", (byte) 20);
        userService.saveUser("Ольга", "Казлова", (byte) 29);
        List<User> userList = userService.getAllUsers();
        userList.forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
