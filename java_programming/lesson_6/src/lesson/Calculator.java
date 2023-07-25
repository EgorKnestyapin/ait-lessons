package lesson;

public class Calculator {
    public static void main(String[] args) {
        // Задание 5. Реализуйте простой калькулятор с четырьмя действиями, используя switch ... case
        int num1 = 47;
        int num2 = 23;
        String action = "+";

        switch(action) {
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("No action");
        }
    }
}
