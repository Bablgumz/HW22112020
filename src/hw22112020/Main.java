package hw22112020;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
//        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0){
//                arr[i] = 1;
//            } else {
//                arr[i] = 0;
//            }
//            System.out.println(Arrays.toString(arr));
//        }



//        2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;



        int[] arr1 = new int[8];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i * 3;
            System.out.println(Arrays.toString(arr1));
        }


//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *=2;
            }
        }
        System.out.println(Arrays.toString(arr2));



//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


    int maxFinder[][];
    int[][] arr3 = new int[10][10];
    for (int i = 0; i < arr3.length; i++) {
        for (int j = 0; j < arr3[i].length; j++) {
            System.out.println(arr3[i][j] + " ");

        }
    }
}
}

