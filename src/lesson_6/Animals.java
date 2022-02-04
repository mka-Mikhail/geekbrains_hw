package lesson_6;

abstract public class Animals {

    protected String animalName;

    public Animals(String animalName) {
        this.animalName = animalName;
    }

    abstract public void run(int distance);

    abstract public void swim(int distance);
}
