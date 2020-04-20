package Lesson_3;

import java.util.Random;
import java.util.Scanner;

    public class GuessTheNumber {
        public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            int count = 3;
            int min = 0;
            int max = 9;
            do {
                System.out.println("Угадайте число от " + min + " до "+ max);
                int scanNum = getNumberFromScanner(min, max);
                int randNum = getRandomNumber(10);
                guessNumber(randNum, count, scanNum, min, max);
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            } while (scanner.nextInt() == 1);
            System.out.println("Конец. Спасибо за игру!");


            scanner.close();
        }

        public static int getRandomNumber(int bound){
            Random rand = new Random();
            int x = rand.nextInt(bound);
            return x;
        }

        public static int getNumberFromScanner(int min, int max){
            int x;
            do {
                x = scanner.nextInt();
            } while (x < min || x > max);
            return x;
        }

        public static void checkWin(int a, int b, int c){
            if (a > b){
                System.out.println("Вы проиграли! Загаданное число: " + c);
            }
        }

        public static void guessNumber(int numRand, int count, int numScan, int min, int max){
            int minCount;
            for (minCount = 1; minCount <= count; minCount++) {
                if (numScan == numRand){
                    System.out.println("Вы выиграли! Загаданное число: " + numRand);
                    break;
                }
                else if (numScan < numRand){
                    System.out.print("Загаданное число больше.");
                }
                else {
                    System.out.print("Загаданное число меньше.");
                }
                System.out.println(" У вас осталось " + (count - minCount) +
                        " попыток\nВведите число от " + min + " до "+ max);
                numScan = getNumberFromScanner(min, max);

            }
            checkWin(minCount, count, numRand);
        }
    }

