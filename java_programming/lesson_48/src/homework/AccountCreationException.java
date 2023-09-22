package homework;

import java.util.List;

public class AccountCreationException extends Exception {
    private List<String> exceptions;

    public AccountCreationException(List<String> exceptions) {
        this.exceptions = exceptions;
    }

    public List<String> getExceptions() {
        return exceptions;
    }

    @Override
    public String toString() {
        return "AccountCreationException{" +
                "exceptions=" + exceptions +
                '}';
    }
}
