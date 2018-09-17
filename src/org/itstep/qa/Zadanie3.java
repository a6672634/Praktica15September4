package org.itstep.qa;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        // Задача 3
        // Пользователь вводит с клавиатуры название валюты, программа выводит на экран текущий курс (курс можно просто нафантазировать)


        Scanner scanner = new Scanner(System.in);
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
