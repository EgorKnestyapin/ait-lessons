package homework;

public class Account {
    private String number;

    public Account(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                '}';
    }
}
