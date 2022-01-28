package lesson_1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple\n");
    }

    static void checkSumSign() {
        int a = 12;
        int b = -10;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }

    static void printColor() {
        int value = 0;

        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый\n");
        } else {
            System.out.println("Зелёный\n");
        }
    }

    static void compareNumbers() {
        int a = 45, b = 67;

        if (a >= b) {
            System.out.println("a >= b\n");
        } else {
            System.out.println("a < b\n");
        }
    }
}
