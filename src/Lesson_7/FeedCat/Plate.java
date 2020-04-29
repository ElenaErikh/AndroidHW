package Lesson_7.FeedCat;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Food : "+ food);
    }

    public boolean isEmpty(int x){
        if (food >= x) {
            return false;
        }
        return food <= x;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void addFood(int amount){
        food += amount;
    }
}
