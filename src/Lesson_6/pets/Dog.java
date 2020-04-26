package Lesson_6.pets;

public class Dog extends Animal{

    public static int dogCount;

    public Dog(String name, double runLimit, double swimLimit, double jumpLimit) {
        super(name, runLimit, swimLimit, jumpLimit);
        dogCount++;
    }

}
