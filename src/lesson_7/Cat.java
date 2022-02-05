package lesson_7;

public class Cat {

    private String name;
    private boolean satiety;
    private int appetite;

    public Cat(String name, boolean satiety, int appetite) {
        this.name = name;
        this.satiety = satiety;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
