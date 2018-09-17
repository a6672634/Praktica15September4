package org.itstep.qa;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
// Задача 2
   // Составить программу, которая проверяет знание таблицы умножения и сообщает пользователю результат (верно или нет).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Чему равно 5*5");
        int a = scanner.nextInt();
        if (a == 25) {
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println("Чему равно 5*3");
        a = scanner.nextInt();
        if (a == 15) {
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println("Чему равно 7*3");
        a = scanner.nextInt();
        if (a == 21) {
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println("Чему равно 5*8");
        a = scanner.nextInt();
        if (a == 40) {
            System.out.println("Верно");
        }else {
            System.out.println("Неверно");
        }
        System.out.println("---------------------");

        Scanner sc = new Scanner(System.in);
        int res = 0;
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.println(i + "*" + j + "= ");
                res = sc.nextInt();
                if(res == i * j)
                    System.out.println("True");
                else
                    System.out.println("Flase");
            }
        }
    }
}
