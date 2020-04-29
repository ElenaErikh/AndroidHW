package Lesson_7.FeedCatHW;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(70);

        Cat[] cats = new Cat[]{
            new Cat("Котлин"),
            new Cat("Пайтон"),
            new Cat("Свифт"),
            new Cat("Бейсик"),
            new Cat("Паскаль"),
            new Cat("Руби"),
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(20);
    }
}
