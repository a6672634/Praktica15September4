package org.itstep.qa;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        // Задача 4
        // Пользователь вводит целое трёхзначное число. Найти сумму цифр этого числа.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<3; i++){
            sum += number %10;
            number /=10;
        }
        System.out.println(sum);
    }
}
