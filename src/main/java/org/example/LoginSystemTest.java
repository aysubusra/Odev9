package org.example;

public class LoginSystemTest {
    public static void main(String[] args) {
        // Test senaryoları
        testValidLogin();
        testInvalidUsername();
        testInvalidPassword();
    }

    // Geçerli giriş senaryosu
    public static void testValidLogin() {
        try {
            LoginSystem.login("user123", "password123");
        } catch (LoginException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    // Geçersiz kullanıcı adı senaryosu
    public static void testInvalidUsername() {
        try {
            LoginSystem.login("", "password123");
        } catch (LoginException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }

    // Geçersiz şifre senaryosu
    public static void testInvalidPassword() {
        try {
            LoginSystem.login("user123", "pwd");
        } catch (LoginException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}

