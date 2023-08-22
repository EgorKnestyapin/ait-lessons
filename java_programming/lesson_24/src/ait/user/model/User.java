package ait.user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        } else {
            System.out.println(email + " is not valid");
        }
    }

    /*
    1) '@' exist and only one
    2) '.' min one dot after @
    3) min two symbols after last dot
    4) alphabetic, digits, '@', '.', '_', '-'
     */
    private boolean isEmailValid(String email) {
        int at = email.indexOf('@');
        if (at == -1 || email.lastIndexOf('@') != at) {
            return false;
        }
        if (email.indexOf('.', at + 1) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') > email.length() - 3) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '@' || c == '.' || c == '_' || c == '-')) {
                return false;
            }
        }
        return true;
    }

    public String getPassword() {
        return password;
    }

    /*
    1) Min 8 symbols
    2) Min one symbol in uppercase
    3) Min one symbol in lowercase
    4) Min one symbol is digit
    5) Min one symbol is a special symbol (!%@*&)
     */
    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        } else {
            System.out.println(password + " is not valid");
        }
    }

    private boolean isPasswordValid(String password) {
        if (password.length() < 8) return false;
        boolean isMinOneSymbolUppercase = false;
        boolean isMinOneSymbolLowercase = false;
        boolean isMinOneSymbolDigit = false;
        boolean isMinOneSymbolSpecial = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c == '!' || c == '%' || c == '@' || c == '*' || c == '&') isMinOneSymbolSpecial = true;
            else if (Character.isDigit(c)) isMinOneSymbolDigit = true;
            else if (c == Character.toUpperCase(c)) isMinOneSymbolUppercase = true;
            else if (c == Character.toLowerCase(c)) isMinOneSymbolLowercase = true;
            if (isMinOneSymbolUppercase && isMinOneSymbolLowercase && isMinOneSymbolDigit && isMinOneSymbolSpecial) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
