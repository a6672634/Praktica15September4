package org.itstep.qa;
import java.util.Scanner;
public class Zadanie1 {
    public static void main(String[] args) {
        //Задача 1
        // Ввести длину ребра куба с клавиатуры. Вывести объем куба и площадь его боковой поверхности.
        Scanner scanner = new Scanner(System.in);
        double a;

        System.out.println("Введите длинну ребра куба");
        a = scanner.nextDouble();
        System.out.println("Площадь " + (a*a));
        System.out.println("Обьем " + (a*a*a));


    }
}
