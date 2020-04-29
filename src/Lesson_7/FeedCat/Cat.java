package Lesson_7.FeedCat;

public class Cat {
    String name;
    boolean full = false;
    int averageAppetite;
    int randAppetite;

    public Cat(String name) {
        this(name, 10);
        this.randAppetite = (int) (Math.random() * averageAppetite + averageAppetite);
    }

    public Cat(String name, int averageAppetite) {
        this.name = name;
        this.averageAppetite = averageAppetite;
    }

    public void info(){
        if (full == true) {
            System.out.println("Кот " + name + " поел.");
        } else{
            System.out.println("Кот " + name + " остался голодным. Добавьте еду в тарелку.");
        }
    }

    public void eat(Plate plate){
        if (!plate.isEmpty(randAppetite)) {
            full = true;
            plate.decreaseFood(randAppetite);
        }
    }

}
