package lesson_5;

public class Employee {
    private String fullName;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String post, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Сотрудник:" +
                " ФИО='" + fullName + '\'' +
                ", Должность='" + post + '\'' +
                ", email='" + email + '\'' +
                ", Номер телефона='" + phoneNumber + '\'' +
                ", Зарплата=" + salary +
                ", Возраст=" + age;
    }
}
