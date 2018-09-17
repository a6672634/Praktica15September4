package org.itstep.qa;

public class Zadanie6 {
    public static void main(String[] args) {
        // Задача 6
       // Заданы моменты начала и конца некоторого промежутка времени в часах, минутах и секундах (в пределах одних суток).
        // Найти продолжительность этого промежутка в тех же единицах измерения.
         //       Пример вывода:
        //Начало  10:30:45
        //Конец    13:20:15
        //Продолжительность     2:49:30
        String begin = "10:30:45";
        String end = "13:20:15";

        String[] str = begin.split(":");
        int hour = Integer.valueOf(str[0]);
        int min = Integer.valueOf(str[1]);
        int sec = Integer.valueOf(str[2]);
        int start = hour * (60 * 60) + (min * 60) + sec;
        str = end.split(":");
        hour = Integer.valueOf(str[0]);
        min = Integer.valueOf(str[1]);
        sec = Integer.valueOf(str[2]);
        int finish = hour * (60 * 60) + (min * 60) + sec;
        int result = finish - start;
        hour = result / 60 / 60;
        min = result / 60 % 60;
        sec = result % 60;
        System.out.println(hour + ":" + min + ":" + sec);
    }
}
