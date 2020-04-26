package Lesson_6;

import Lesson_6.pets.Cat;
import Lesson_6.pets.Dog;

import static Lesson_6.pets.Animal.animalCount;
import static Lesson_6.pets.Cat.catCount;
import static Lesson_6.pets.Dog.dogCount;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Котлин", 200, 0, 2);
        Cat cat2 = new Cat("Пайтон", 150, 0, 1.5);
        Cat cat3 = new Cat("Свифт", 230, 0, 2.2);
        Cat cat4 = new Cat("Бэйсик", 245, 0, 1.9);

        Dog dog1 = new Dog("Джава", 500, 10, 0.8);
        Dog dog2 = new Dog("Руби", 470, 8, 0.7);
        Dog dog3 = new Dog("Паскаль", 530, 11.5, 0.5);

        cat1.run(50);
        cat1.swim(5);
        cat2.run(140.7);
        cat2.jumpOver(6);
        cat3.run(120);
        cat4.jumpOver(1.8);

        dog1.run(400);
        dog1.jumpOver(0.5);
        dog2.run(650);
        dog2.swim(7.5);
        dog3.swim(220);
        dog3.jumpOver(0.2);

        System.out.println("Количество котов: " + catCount);
        System.out.println("Количество собак: " + dogCount);
        System.out.println("Количество всех животных: " + animalCount);

    }
}
