package lesson_6;

public class Cat extends Animals {

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance >= 0)
            System.out.println(animalName + " пробежал(-а) " + distance + " м");
        else if (distance < 0)
            System.out.println(animalName + " не умеет так бегать");
        else
            System.out.println(animalName + " устал(-а) бежать");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты и кошки не плавают, у них лапки");
    }
}
