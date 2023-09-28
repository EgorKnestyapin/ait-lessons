package homework;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        sortIntoTwoFiles(calculateSameNames("buf2.txt"));
    }

    /* Задача 1
    Дан файл с текстом вида:
    jack:2000
    john:2900
    greta:3100
    john:1300
    nick:1200
    greta:500
    ...
    т.е. имя и сумма оплаты. Ваша задача прочитать файл, и сформировать два файла: part1 cо списком тех, кому
    перечисленно в сумме менее 2000 и part2 cо списком тех, кому перечисленно в сумме более 2000.
    Обратите внимание, если в исходном фпйле john фигурирует дважды (как в нашем примере), это означает что один и
    тот же человек и ему выплачивали дважды. Таким образом, в итоговом файле для jhon-а должна быть запись
    john:4200 и эта строка должна быть в файле part2
     */
    public static Map<String, Integer> calculateSameNames(String fileName) {
        Map<String, Integer> res = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] namePayment = line.split(":");
                String name = namePayment[0];
                int payment = Integer.parseInt(namePayment[1]);
                res.put(name, res.getOrDefault(name, 0) + payment);
            }
            return res;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sortIntoTwoFiles(Map<String, Integer> map) {
        try (BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("part1.txt"));
             BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("part2.txt"))) {
            Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
            for (Map.Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() < 2000) {
                    bufferedWriter1.write(entry.getKey() + ":" + entry.getValue());
                    bufferedWriter1.newLine();
                } else if (entry.getValue() > 2000) {
                    bufferedWriter2.write(entry.getKey() + ":" + entry.getValue());
                    bufferedWriter2.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
