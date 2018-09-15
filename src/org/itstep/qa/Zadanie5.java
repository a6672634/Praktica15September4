package org.itstep.qa;
import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        // Задача 5
        // Найти максимальный и минимальный элементы ТРЕХ-мерного массива (заполнен случайными числами)
        int array[][][] = new int[3][3][3];

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int zeros = 0;
        System.out.println("Enter number");
        do{
            if(scanner.hasNextInt()){
                array[counter++] = scanner.nextInt();
                if(array[counter - 1] == 0)
                    zeros++;
            }
            else{
                System.out.println("Please try again:");
                scanner.next();
            }
        }while(counter < array.length);
        System.out.println("Count of zeros = " + zeros);
    }
}

