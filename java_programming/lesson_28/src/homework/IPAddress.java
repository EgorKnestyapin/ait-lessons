package homework;

import java.util.Arrays;

public class IPAddress {
    /* Программа получает на вход IP-адрес в одну строку: например, 192.168.23.1 (четыре числа, разделённые точками).
    Каждое число должно быть в диапазоне от 0 до 255. Программа должна вывести эти четыре числа по отдельности.
    Идеальное решение: создать Java-класс IPAddress и реализовать в нем метод валидации создаваемого объекта.
    Альтернативное решение: IP-адрес вводится с клавиатуры, используются самостоятельно разработанные методы.
    Разработать тесты.
     */
    private String address;

    public IPAddress(String address) {
        setAddress(address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (validateIPAddress(address)) {
            this.address = address;
        } else {
            System.out.println("Incorrect IP address");
        }
    }

    public boolean validateIPAddress(String address) {
        String[] addressArr = address.split("\\.");
        if (addressArr.length != 4) {
            return false;
        }
        for (int i = 0; i < addressArr.length; i++) {
            if (Integer.parseInt(addressArr[i]) < 0 || Integer.parseInt(addressArr[i]) > 255) {
                return false;
            }
        }
        return true;
    }
}

