package lesson_6;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int amountAnimals = 10;
        //int amountDog = 4;  //Кол-во собак, которых мы можем создать
        //int amountCat = 5;  //Кол-во котов, которых мы можем создать

        Animals[] animals = new Animals[amountAnimals];

        //Dog[] arrayDog = new Dog[amountDog];
        //Cat[] arrayCat = new Cat[amountCat];

        int countAnimals = 0;  //Счётчик всех животных
        int countDog = 0;  //Счётчик собак
        int countCat = 0;  //Счётчик котов

        while (true) {

            //Выбор создания животного
            System.out.println(
                    "\nКакого животного вы хотите создать\n" +
                            "Собака - 1\n" +
                            "Кот (кошка) - 2");
            int animal = scanner.nextInt();

            switch (animal) {
                case 1:
                    countAnimals = seatCheck(animals, countAnimals, amountAnimals, 1, "СОБАКИ");  //Создание собак
                    countDog++;
                    break;
                case 2:
                    countAnimals = seatCheck(animals, countAnimals, amountAnimals, 2, "КОТА (КОШКИ)");  //Создание котов
                    countCat++;
                    break;
            }

            //Условия для выхода, либо для продолжения работы цикла while(true)
            System.out.println("\nПродолжить создание животных? (да - 1, нет - 0)");
            int answer = scanner.nextInt();
            if (answer == 1)
                continue;
            else if (answer == 0)
                break;
        }

        getInfoOfAnimals(countDog, countCat, countAnimals);

        /*for (int i = 0; i < countDog; i++) {
            System.out.println();
            arrayDog[i].run(250);
            arrayDog[i].run(501);
            arrayDog[i].swim(-1);
        }

        for (int i = 0; i < countCat; i++) {
            System.out.println();
            arrayCat[i].run(167);
            arrayCat[i].run(257);
            arrayCat[i].swim(23);
        }*/
    }

    //Вывод информации о животных
    public static void getInfoOfAnimals(int countDog, int countCat, int countAnimals) {

        System.out.println("\n*****************");
        System.out.println("Кол-во созданных животных:" +
                "\nСобак - " + countDog +
                "\nКотов и кошек - " + countCat +
                "\nВсего животных - " + countAnimals);
        System.out.println("*****************");
    }

    //Проверка на наличие мест и вызов метода создания животного
    public static int seatCheck(Object[] animals, int count, int amount, int numOfAnimal, String animal) {

        if (count < amount) {
            arrayFilling(animals, count, numOfAnimal, animal);
            count++;
        }
        else {
            System.out.println("Мест больше нет");
        }
        return count;
    }

    //Создание животного, животное определяется по номеру
    public static void arrayFilling(Object[] animals, int i, int numOfAnimal, String animal) {

        System.out.print("\nВведите имя " + animal +": ");
        String animalName = scanner.next();

        switch (numOfAnimal) {
            case 1:
                animals[i] = new Dog(animalName);
                break;
            case 2:
                animals[i] = new Cat(animalName);
                break;
        }
    }
}
