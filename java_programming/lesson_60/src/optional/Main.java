package optional;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("orange", "apple", "banana", "mango", "kiwi");
        // как получить первый элемент, удовлетворяющий описанию?
        // findFirst
        Optional<String> kiwiOptional = fruits.stream()
                .filter(s -> s.length() < 5)
                .findFirst();
//        if (kiwiOptional.isPresent()) {
//            System.out.println(kiwiOptional.get());
//        }
        kiwiOptional.ifPresent(System.out::println);
        // Добавить значение по умолчанию. Будет подставляться, если optional равен нулю
        kiwiOptional.orElseGet(() -> "passion fruit");

        // Если есть значение - мы его получим. Если нет - выбросим ошибку
        kiwiOptional.orElseThrow(IllegalArgumentException::new);
    }
}
