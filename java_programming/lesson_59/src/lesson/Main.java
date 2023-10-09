package lesson;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // method reference - ссылка на метод
        List<Panda> pandaList = List.of(
                new Panda("Po", 60_000),
                new Panda("Bo", 65_000),
                new Panda("Small Jay", 40_000)
        );
        // Хочу изменить исходные значения - мутировать
        // Method ref: ClassName::methodName
        pandaList.forEach(Panda::eatBamboo);
        pandaList.forEach(panda -> System.out.println(panda.getWeight()));
        // Операции бывают - промежуточные и терминальные(конечные)

        // reduce - сведение к какому-то значению
        Double reduced = pandaList.stream()
                .map(Panda::getWeight)
                .reduce(0.0, Double::sum);
        // limit - возвращает количество элементов, начиная с первого
        List<String> animals = List.of("Panda", "Monkey", "Mouse", "Lion", "Monkey");
        animals.stream().limit(3).forEach(s -> System.out.println(s));
        // skip - пропускает указанное количество элементов
        animals.stream().skip(2).forEach(s -> System.out.println(s));
        // distinct - оставляет только уникальные элементы
        animals.stream().distinct().forEach(s -> System.out.println(s));
        // sorted - сортировка
        animals.stream().sorted((a, b) -> Integer.compare(a.length(), b.length())).forEach(s -> System.out.println(s));
        // findAny
        animals.stream().findAny();
        // anyMatch - проверяет, есть ли хотя бы одни элемент, удовлетворябщий условию
        boolean poExist = pandaList.stream()
                .anyMatch(panda -> panda.getTitle().equals("Po"));
        System.out.println(poExist);
        boolean allPo = pandaList.stream()
                .allMatch(panda -> panda.getTitle().equals("Po"));
        System.out.println(allPo);
    }
}
