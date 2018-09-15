package org.itstep.qa;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        //Задача 7
      //  Пользователь вводит строку текста. После этого вводит контрольное слово. Программа выводит результат -
        // содержится контрольное слово в строке или нет.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести строку");
        String a = scanner.nextLine();
        System.out.println("Ввести вторую строку");
        String b = scanner.nextLine();

        if (a.contains(b)){
            System.out.println("Содержит");

        }
        else {
            System.out.println("Не содержит");
        }

    }
}
