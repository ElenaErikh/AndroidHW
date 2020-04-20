package Lesson_4;


import java.util.Random;
import java.util.Scanner;

public class XOGame {
    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static int turnCount;

    public static void main(String[] args) {
        int answer;

        do {
            initMap();
            printMap();
            turnCount = 0;
            while (true) {
                humanTurn();
                printMap();
                if(checkWin(DOT_X)){
                    System.out.println("Ты Супер победитель!");
                    break;
                }

                if (turnCount == SIZE * SIZE) {
                    System.out.println("Ничья...");
                    break;
                }

                aiTurn();
                printMap();
                if(checkWin(DOT_O)){
                    System.out.println("ИИ нынче очень развито, компьютер победил!");
                    break;
                }
                if (turnCount == SIZE * SIZE) {
                    System.out.println("Ничья...");
                    break;
                }
            }
            System.out.println("Повторить игру? 1 – да");
            answer = sc.nextInt();
        } while (answer == 1);
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%s ", map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
        turnCount++;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void setRandNum() {
        int x;
        int y;

        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));

        map[y][x] = DOT_O;
    }

    public static void aiTurn() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_X || map[i][j] == DOT_O){
                    continue;
                }
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_X;
                }
                if (checkWin(DOT_X)){
                    map[i][j] = DOT_O;
                    break;
                }
                map[i][j] = DOT_EMPTY;

                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = DOT_O;
                }
                if (checkWin(DOT_O)){
                    map[i][j] = DOT_O;
                    break;
                }
                map[i][j] = DOT_EMPTY;
            }
        }
        setRandNum();
        turnCount++;
    }

    public static boolean checkWinFor3x3(char c){
        for (int i = 0; i < SIZE; i++) {
            int row = DOTS_TO_WIN;
            int colomn = DOTS_TO_WIN;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == c) {
                    row--;
                }
                if (map[j][i] == c) {
                    colomn--;
                }
                if (row == 0 || colomn == 0){
                    return true;
                }
            }
        }

        int diagonal1 = DOTS_TO_WIN;
        int diagonal2 = DOTS_TO_WIN;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == c) {
                diagonal1--;
            }
            if (map[i][SIZE - 1 - i] == c) {
                diagonal2--;
            }
            if (diagonal1 == 0 || diagonal2 == 0){
                return true;
            }
        }
        return false;
    }

    public static boolean isCorrectDot1(int x, int y){
        if (x + (DOTS_TO_WIN - 1) < 0 || y - (DOTS_TO_WIN - 1) < 0 ||
                x + (DOTS_TO_WIN - 1) >= SIZE || y - (DOTS_TO_WIN - 1) >= SIZE) {
            return false;
        }
        return true;
    }

    public static boolean isCorrectDot2(int x){
        if (x + (DOTS_TO_WIN - 1) < 0 || x + (DOTS_TO_WIN - 1) >= SIZE) {
            return false;
        }
        return true;
    }

    public static boolean isCorrectDot3(int x, int y){
        if (x + (DOTS_TO_WIN - 1) < 0 || y + (DOTS_TO_WIN - 1) < 0 ||
                x + (DOTS_TO_WIN - 1) >= SIZE || y + (DOTS_TO_WIN - 1) >= SIZE) {
            return false;
        }
        return true;
    }

    public static boolean isCorrectDot4(int y){
        if (y + (DOTS_TO_WIN - 1) < 0 || y + (DOTS_TO_WIN - 1) >= SIZE) {
            return false;
        }
        return true;
    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCorrectDot1(i, j) && map[i][j] == c && map[i+(DOTS_TO_WIN-3)][j-(DOTS_TO_WIN-3)] == c &&
                        map[i+(DOTS_TO_WIN-2)][j-(DOTS_TO_WIN-2)] == c &&
                        map[i+(DOTS_TO_WIN-1)][j-(DOTS_TO_WIN-1)] == c){
                    return true;
                }
                if (isCorrectDot2(i) && map[i][j] == c && map[i+(DOTS_TO_WIN-3)][j] == c &&
                        map[i+(DOTS_TO_WIN-2)][j] == c && map[i+(DOTS_TO_WIN-1)][j] == c){
                    return true;
                }
                if (isCorrectDot3(i, j) && map[i][j] == c && map[i+(DOTS_TO_WIN-3)][j+(DOTS_TO_WIN-3)] == c &&
                        map[i+(DOTS_TO_WIN-2)][j+(DOTS_TO_WIN-2)] == c &&
                        map[i+(DOTS_TO_WIN-1)][j+(DOTS_TO_WIN-1)] == c){
                    return true;
                }
                if (isCorrectDot4(j) && map[i][j] == c && map[i][j+(DOTS_TO_WIN-3)] == c &&
                        map[i][j+(DOTS_TO_WIN-2)] == c && map[i][j+(DOTS_TO_WIN-1)] == c){
                    return true;
                }
            }
        }
        return false;
    }
}
