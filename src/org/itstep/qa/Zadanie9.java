package org.itstep.qa;
import java.util.Random;
public class Zadanie9 {
    public static void main(String[] args) {
        // Задача 9
        //Имеется двумерный массив, заполненный случайными значениями. Найти максимальный элемент этого массива.
        // Вывести значение элемента, его индексы, а также значения его соседей в обоих  измерениях
        //Пример.
          //      Массив:
        //1   2   4
        //7   9   8
        //4   5   6
        //Вывод на экран должен быть вида:
        //Максимальный элемент 9
        //Индексы: i = 1; j = 1
        //Значения соседей: 2, 7, 8, 5

        Random random = new Random();
        int[][] array = new int[3][3];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(100);
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }

        int max = 0;
        int outer = 0;
        int inner = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(max < array[i][j]){
                    max = array[i][j];
                    outer = i;
                    inner = j;
                }
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индексы: i = " + outer + " j = " + inner);
        System.out.print("Значения соседей: ");
        if(outer - 1 >= 0)
            System.out.print(array[outer - 1][inner] + " ");
        if(inner - 1 >= 0)
            System.out.print(array[outer][inner - 1] + " ");
        if(inner + 1 <= array[outer].length - 1)
            System.out.println(array[outer][inner + 1] + " ");
        if(outer + 1 <= array.length - 1)
            System.out.println(array[outer + 1][inner]);
    }
}
