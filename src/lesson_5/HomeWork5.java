package lesson_5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во сотрудников: ");
        int amount = scanner.nextInt();

        Employee[] array = new Employee[amount];

        System.out.println("\nВведите информацию о каждом сотруднике");

        for (int i = 0; i < amount; i++) {

            System.out.println();

            System.out.print("ФИО: ");
            scanner = new Scanner(System.in);
            String fullName = scanner.nextLine();

            System.out.print("Должность: ");
            String post = scanner.next();

            System.out.print("Email: ");
            String email = scanner.next();

            System.out.print("Телефон: ");
            scanner = new Scanner(System.in);
            String phoneNumber = scanner.nextLine();

            System.out.print("Зарплата: ");
            int salary = scanner.nextInt();

            System.out.print("Возраст: ");
            int age = scanner.nextInt();

            array[i] = new Employee(fullName, post, email, phoneNumber, salary, age);
        }

        System.out.println();

        int k = 0;  //Счётчик сотрудников
        for (Employee e :
                array) {
            if (e.getAge() > 40) {
                System.out.println(e);
                k++;
            }
        }
        if (k == 0) System.out.println("Сотрудников старше 40 лет нет");
    }
}
