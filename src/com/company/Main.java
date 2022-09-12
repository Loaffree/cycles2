package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Задание 1");
        task1();
        System.out.println("\n" + " Задание 2");
        task2();
        System.out.println("\n" + " Задание 3_2");
        task3_2();
    }

    public static void task1() {
        int salary = 29_000;
        int total = 0;
        long totalSum = 0;
        while (totalSum < 2_459_000L)
      // for (int i = 1; i <= 12; i++)
        {
            total = total + total / 100;
            total = total + salary;
           // System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task2() {
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(" " + x);
        }
        System.out.println();
        for (x = 10; x > 0; x--) {
            System.out.print(" " + x);
        }
    }

    public static void task3_2() {
        for (int i = 1; i <= 10; i++) {
            int number = 2;
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}