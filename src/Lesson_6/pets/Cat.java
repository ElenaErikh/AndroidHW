package Lesson_6.pets;

public class Cat extends Animal {

    public static int catCount;

    public Cat(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        catCount++;
    }

    @Override
    public void swim(double obstacleLength){
        System.out.println("Коты не умеют плавать");
    }

}
