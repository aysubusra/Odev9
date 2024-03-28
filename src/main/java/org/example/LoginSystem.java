package org.example;

public class LoginSystem {
    public static void login(String username, String password) throws LoginException {
        // Kullanıcı adı ve şifrenin geçerliliğini kontrol et
        if (!isValidUsername(username)) {
            throw new InvalidUsernameException("Geçersiz kullanıcı adı");
        }

        if (!isValidPassword(password)) {
            throw new InvalidPasswordException("Geçersiz şifre");
        }

        // Başarılı giriş
        System.out.println("Giriş başarıyla gerçekleştirildi. Hoş geldiniz, " + username + "!");
    }

    // Kullanıcı adının geçerliliğini kontrol et
    private static boolean isValidUsername(String username) {
        // boş kullanıcı adı
        return !username.isEmpty();
    }

    // Şifrenin geçerliliğini kontrol eden metod
    private static boolean isValidPassword(String password) {
        // şifrenin uzunluğunun en az 6 karakter olması gerektiğini kontrol et
        return password.length() >= 6;
    }
}

// Özel hata türleri
class LoginException extends Exception {
    public LoginException(String message) {
        super(message);
    }
}

class InvalidUsernameException extends LoginException {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends LoginException {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
