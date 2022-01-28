package lesson_2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sumCheck(99, 9) + "\n");
        numCheck_void(-100);
        System.out.println(numCheck_bool(-100) + "\n");
        printString("Hello there", 8);
        System.out.println(yearCheck(324));
    }

    public static boolean sumCheck(int a, int b) {
        return a + b >= 10 & a + b <= 20;
    }

    public static void numCheck_void(int num) {
        if (num >= 0)
            System.out.println("Число положительное\n");
        else
            System.out.println("Число отрицательное\n");
    }

    public static boolean numCheck_bool(int num) {
        return !(num >= 0);  //! - инверсия
    }

    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
        System.out.println();
    }

    public static boolean yearCheck(int year) {
        return !(year % 400 != 0 & year % 100 == 0);
    }

    /*if (year % 4 == 0) {
            //false, если год не 400-й при этом 2 последние цифры нули
            if (year % 400 != 0 & year % 100 == 0)
                return false;
            return true;
        }
        else
            return false;*/
}

