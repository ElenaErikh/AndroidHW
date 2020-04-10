public class Main {
    public static void main(String[] args) {
        byte bt = 3;
        short sh = -32165;
        int i = 120;
        long lg = 50035467L;
        double db = 68.35;
        float fl = -11.279f;
        char ch = '\uc2a7';
        boolean bool = true;

        int[] array = new int[25000];

        System.out.println(count(5, 9, 18, 7));
        System.out.println(checkSum(3, 8));
        checkNumber(-256);
        System.out.println(checkNegativeNum(-10096));
        sayHello("Фанзиль");
        getYears(array);
        leapYearFinder(array, 2020);
    }

    static int count(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    static boolean checkSum(int num1, int num2){
        if (10 <= (num1 + num2) && (num1 + num2) <= 20 ){
            return true;
        } else {
            return false;
        }
    }

    static void checkNumber(int x){
        if (x >= 0){
            System.out.println(x + " положительное число");
        } else{
            System.out.println(x + " отрицательное число");
        }
    }

    static boolean checkNegativeNum(int y){
        if (y < 0){
            return true;
        } else {
            return false;
        }
    }

    static void sayHello(String name){
        System.out.println("Здравствуйте, " + name + "!\nХорошего дня!");
    }

    static void getYears(int[] arr){
        int value = 0;
        for (int i = 0; i < 100000; i += 4) {
            arr[value] = i;
            value++;
        }
    }

    static void leapYearFinder(int[] arr, int year){
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (year == arr[mid]) {
                System.out.println(year + " високосный год");
                return;
            } else {
                if (year < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        System.out.println(year + " не високосный год");
    }
}

