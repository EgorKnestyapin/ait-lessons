public class Main {
    public static void main(String[] args) {
        /* Задача 1. Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
        Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Распечатайте её через println. Сколько программа отбросила в дробной части?
         */
        int num1 = 0;
        int num2 = 1;
        int num3 = 2;
        int num4 = 3;
        int num5 = 4;
        int num6 = 5;
        int num7 = 6;
        int num8 = 7;
        int num9 = 8;
        int num10 = 9;
        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        int averageNum = sum / 10;
        double averageNumDouble = (double) sum / 10;
        System.out.println(averageNum); // 4
        System.out.println(averageNumDouble); // 4.5. Программа отбросила 0,5

        /* Задача 2. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
        Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
        Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
        Отдельно выведите на экран сумму скидки от этой покупки.
         */
        int A = 1000;
        int B = 500;
        int discount = 100;
        int totalPrice = A + B - discount;
        System.out.println("Цена товара A и товара B со скидкой " + discount + " руб. равняется " + totalPrice);

        /* Задача 3. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
        Вычислите среднюю температуру за неделю и выведете ее на печать.
         */
        int monday = 21;
        int tuesday = 23;
        int wednesday = 23;
        int thursday = 29;
        int friday = 24;
        int saturday = 26;
        int sunday = 25;
        int sumTemp = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
        double averageTemp = (double) sumTemp / 7;
        System.out.printf("%.2f", averageTemp); // 24,43
        System.out.println();

        /* Задача 4. Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
        Покажите это на конкретных примерах.
         */
        int z = 5;
        System.out.println(z % 2); // 1
        System.out.println(z % 3); // 2
        z = 7;
        System.out.println(z % 2); // 1
        System.out.println(z % 3); // 1
        z = 10;
        System.out.println(z % 2); // 0
        System.out.println(z % 3); // 1

        /* Задача 5(*). int x = 3 Чему будет равно значение х после выполнения операции x += x++ ?
        Проверьте свое предположение на практике.
         */
        int x = 3;
        x += x++;
        System.out.println(x); // 6
    }
}