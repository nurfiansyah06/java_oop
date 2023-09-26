package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("admin", null);
        System.out.println("success");
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("tidak bisa connect database");
        }
    }
}
