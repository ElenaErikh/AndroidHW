package Lesson_6.pets;

public class Animal {

    protected String name;
    double runLimit;
    double swimLimit;
    double jumpLimit;

    public static int animalCount;

    public Animal(String name, double runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
        animalCount++;
    }

    public void run(double obstacleLength){
        if (obstacleLength <= runLimit) {
            System.out.println(name + " пробежал  " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не смог пробежать...");
        }
    }

    public void swim(double obstacleLength){
        if (obstacleLength <= swimLimit){
            System.out.println(name + " проплыл  " + obstacleLength + " м.");
        } else {
            System.out.println(name + " не смог проплыть...");
        }
    }

    public void jumpOver(double obstacleHeight){
        if (obstacleHeight <= jumpLimit) {
            System.out.println(name + " перепрыгнул препятствие высотой  " + obstacleHeight + " м.");
        } else {
            System.out.println(name + " не смог перепрыгнуть...");
        }
    }

}
