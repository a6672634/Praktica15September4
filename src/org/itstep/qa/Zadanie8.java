package org.itstep.qa;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        // Задача 8
        // Пользователь вводит строку. Программа выводит количество символов самого длинного слова.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[]words = line.split(" ");
        int maxLength = 0;
        for(int i = 0; i< words.length;i++){
            if(maxLength < words[i].length())
                maxLength =words[i].length();
        }
        System.out.println("Max lengh = " + maxLength);


    }
}
