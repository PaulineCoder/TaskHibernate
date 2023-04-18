package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Astrid","Tro",(byte) 24);
        userService.saveUser("Billy","Pill",(byte) 7);
        userService.saveUser("Konstantin","Riz",(byte) 31);
        userService.saveUser("Greg","Mentalist",(byte) 2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
