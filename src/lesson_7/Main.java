package lesson_7;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[3];

        Plate plate = new Plate(20);

        cats[0] = new Cat("Барсик", false, 10);
        cats[1] = new Cat("Кузя", false, 15);
        cats[2] = new Cat("Мурзик", false, 18);

        System.out.println(plate.getFood());
        getInfoOfCats(cats);

        for (int i = 0; i < 3; i++) {
            if (plate.getFood() - cats[i].getAppetite() > 0) {
                plate.setFood(plate.getFood() - cats[i].getAppetite());
                cats[i].setSatiety(true);
            }
        }

        System.out.println(plate.getFood());
        getInfoOfCats(cats);
    }

    private static void getInfoOfCats(Cat[] cats) {
        for (Cat c :
                cats) {
            System.out.println(c);
        }
        System.out.println();
    }
}
