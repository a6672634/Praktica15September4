package org.itstep.qa;

import java.util.Random;
public class Zadanie5 {
    public static void main(String[] args) {
        // Задача 5
        // Найти максимальный и минимальный элементы ТРЕХ-мерного массива (заполнен случайными числами)

        Random random = new Random();
        int[][][] array = new int[3][5][6];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    array[i][j][k] = random.nextInt(101);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.print(array[i][j][k] + " ");
                    if(min > array[i][j][k])
                        min = array[i][j][k];
                    if(max < array[i][j][k])
                        max = array[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Min = " + min + "\nMax = " + max);
    }
}