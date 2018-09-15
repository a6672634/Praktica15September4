package org.itstep.qa;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        // Задача 3
        // Пользователь вводит с клавиатуры название валюты, программа выводит на экран текущий курс (курс можно просто нафантазировать)

        String b = "евро";
        String c = "доллар";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название валюты (евро или доллар)");
        String valuta;
        double a = 10;
        double d = 15;
        valuta = scanner.next();
        if (valuta == b) {
            System.out.println("Текущий Курс " + valuta + d);
        }
        if (valuta == c) {
            System.out.println("Текущий курс " + valuta + a);
        }
        System.out.println("------------------------");


        Scanner scanner1 = new Scanner(System.in);
        String str = scanner.next();
        switch (str) {
            case "евро": {
                System.out.println("15000");
                break;
            }
            case "доллар": {
                System.out.println("20000");
                break;
            }
            case "рубль": {
                System.out.println("20450");
                break;
            }
            default:{
                System.out.println("нет валюты в списке");
            }
        }
    }
}
