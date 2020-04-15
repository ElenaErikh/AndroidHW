package Lesson_2;

import java.util.Arrays;

public class HW_lesson_2 {
    public static void main(String[] args) {
        int[] array1 = {0, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        int[] array2 = new int[8];
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] array4 = new int[5][5];
        int[] array5 = {5, 81, 2, 4, 10, 118, 25, 6, 33};
        int[] array6 = {1, 2, 3, 4, 5, 6, 7};

        changeZeroOne(array1);
        fillArray(array2);
        multiplArray(array3);
        printMatrix(array4);
        findMinMax(array5);
        checkBalance(array3);
        moveElements(array6, -2);
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void changeZeroOne(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0){
                arr1[i] = 1;
            } else{
                arr1[i] = 0;
            }
        }
        printArray(arr1);
    }

//    Задать пустой целочисленный массив размером 8. С помощью цикла
//    заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void fillArray(int[] arr2){
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        printArray(arr2);
    }

//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;

    public static void multiplArray(int[] arr3){
        for (int i = 0; i <arr3.length; i++) {
            if (arr3[i] < 6){
                arr3[i] *= 2;
            }
        }
        printArray(arr3);
    }

//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void fillMatrix(int [][] arr4){
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i + j == arr4.length - 1) {
                    arr4[i][j] = 1;
                } else if (i == j){
                    arr4[i][j] = 1;
                }
            }
        }
    }

    public static void printMatrix(int[][] arr4){
        fillMatrix(arr4);
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.printf("%3d", arr4[i][j]);
            }
            System.out.println();
        }
    }

//    Задать одномерный массив и найти в нем минимальный и максимальный элементы;

    public static void findMinMax(int[] arr5){
        int min = arr5[0];
        int max = arr5[arr5.length - 1];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min){
                min = arr5[i];
            } else if (arr5[i] > max){
                max = arr5[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }

//    Написать метод, в который передается не пустой одномерный целочисленный массив,метод должен
//    вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    public static void checkBalance(int[] arr) {
        int[] sumLeft = new int[arr.length];
        int[] sumRight = new int[arr.length];
        int sum1 = arr[0];
        int sum2 = 0;
        for (int i = 1, j = arr.length - 1; i < arr.length - 1; i++, j--) {
            sum1 += arr[i];
            sum2 += arr[j];
            sumLeft[i] = sum1;
            sumRight[j] = sum2;
        }
        System.out.println(isSumEqual(sumLeft, sumRight));
    }

    public static boolean isSumEqual(int[] sumL, int[] sumR) {

        for (int i = 0; i < sumL.length; i++) {
            for (int j = 0; j < sumR.length; j++) {
                if (sumL[i] == sumR[j] && sumL[i] != 0){
                    return true;
                }
            }
        }
        return false;
    }

//    Написать метод, которому на вход подается одномерный массив и число n (может быть
//    положительным, или отрицательным), при этом метод должен сместить все элементы массива
//    на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.

    public static void moveElements(int[] arr, int n){
        int count = 0;

        while (n > 0 && count != n) {
            int value = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length-1] = value;
            count++;
        }

        while (n < 0 && count != n) {
            int value = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = value;
            count--;
        }
        printArray(arr);
    }

}
