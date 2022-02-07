package lesson_7;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];

        Plate plate = new Plate(5);

        cats[0] = new Cat("Барсик", false,  10);
        cats[1] = new Cat("Кузя",   false,  15);
        cats[2] = new Cat("Мурзик", false,  18);

        getInfoOfCats(cats);

        int countCats = 0;

        while (true) {

            if (cats[countCats].eat(plate.getFood()) >= 0) {

                plate.setFood(cats[countCats].eat(plate.getFood()));
                cats[countCats].setSatiety(true);
                System.out.println("\n" + cats[countCats].getName() + " поел");
                countCats++;
            }
            else {

                System.out.println("\nЕды не хватает\n" +
                        "Кол-во еды в тарелке " + plate.getFood());
                System.out.println("Кормить " + cats[countCats].getName() + "? (1 - да, 0 - нет)");
                int choose = scanner.nextInt();

                switch (choose) {

                    case 1:
                        System.out.println("Сколько добавить еды в тарелку?");
                        int addFood = scanner.nextInt();
                        plate.addFood(addFood);
                        System.out.println("В тарелку добавили " + addFood + " еды");
                        break;

                    case 0:
                        countCats++;  //Переходим к следуюущему коту
                        break;
                }
            }

            if (countCats == 3) break;
        }

        getInfoOfCats(cats);
    }

    public static void getInfoOfCats(Cat[] cats) {

        System.out.println();
        for (Cat c :
                cats) {
            System.out.println(c);
        }
        System.out.println();
    }
}

