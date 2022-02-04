package lesson_6;

public class Dog extends Animals {

    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500 && distance >= 0)
            System.out.println(animalName + " пробежал(-а) " + distance + " м");
        else if (distance < 0)
            System.out.println(animalName + " не умеет так бегать");
        else
            System.out.println(animalName + " устал(-а) бежать");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10 && distance >= 0)
            System.out.println(animalName + " проплыл(-а) " + distance + " м");
        else if (distance < 0)
            System.out.println(animalName + " не умеет так плавать");
        else
            System.out.println(animalName + " устал(-а) плыть");
    }
}
