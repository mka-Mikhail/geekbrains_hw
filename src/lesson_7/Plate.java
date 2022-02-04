package lesson_7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    //Добавить еду в тарелку
    public void addFood(int food) {
        this.food += food;
    }
}
