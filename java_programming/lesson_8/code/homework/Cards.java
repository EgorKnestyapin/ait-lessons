package homework;

public class Cards {
    public static void main(String[] args) {
        /* Создайте массив, содержащий в себе название карточных мастей.
        Создайте массив, содержащий в себе карты от двойки до туза. Раздайте из колоды по 6 карт на 4 игрока.
         */
        String[] suitsArr = {"пики", "крести", "черви", "буби"};
        String[] cardsArr = {"двойка", "тройка", "четвёрка", "пятёрка", "шестёрка", "семёрка", "восьмёрка", "девятка",
                             "десятка", "валет", "дама", "король", "туз"};
        String[] playersCards = new String[24];
        int i = 0;
        int j = 0;
        int a = 0;
        int b = 3;
        int c = 12;
        int cardIndex = 0;
        int suitIndex = 0;
        String cardSuit;
        boolean flag = false;
        while (i < 24) {
            i = 0;
            suitIndex = (int) (Math.random()*(b - a + 1) + a);
            cardIndex = (int) (Math.random()*(c - a + 1) + a);
            cardSuit = cardsArr[cardIndex] + " " + suitsArr[suitIndex];
            while (j < i) {
                if (playersCards[j].equals(cardSuit)) {
                    flag = true;
                }
                j++;
            }
            if (flag) {
                flag = false;
                continue;
            }
            playersCards[i] = cardSuit;
            i++;
        }

        i = 0;
        int allCardsIndex = 0;
        while (i < 4) {
            j = 0;
            System.out.println("Ваши карты, игрок " + (i + 1) + ": ");
            while (j < 6) {
                System.out.print(playersCards[allCardsIndex] + " | ");
                allCardsIndex++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
