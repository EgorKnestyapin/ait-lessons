package homework;

public class RandomLetters {
    public static void main(String[] args) {
        // Реализуйте метод, который заполняет массив случайными буквами. Размер массива подается на вход методу.
        char[] lettersArr = fillRandomLetters(7);
        for (int i = 0; i < lettersArr.length; i++) {
            System.out.println(lettersArr[i]);
        }
    }

    public static char[] fillRandomLetters(int length) {
        char[] lettersArr = new char[length];
        int a = 'a';
        int z = 'z';
        for (int i = 0; i < lettersArr.length; i++) {
            lettersArr[i] = (char) (int) (Math.random() * (z - a + 1) + a);
        }
        return lettersArr;
    }
}
