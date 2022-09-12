package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Задание 1_1");
        task1_1();
        System.out.println("\n" + " Задание 1_2");
        task1_2();
        System.out.println("\n" + " Задание 1_3");
        task1_3();
        System.out.println("\n" + " Задание 2_1");
        task2_1();
        System.out.println("\n" + " Задание 2_2");
        task2_2();
        System.out.println("\n" + " Задание 2_3");
        task2_3();
        System.out.println("\n" + " Задание 2_4");
        task2_4();
        System.out.println("\n" + " Задание 3_1");
        task3_1();
        System.out.println("\n" + " Задание 3_2");
        task3_2();

    }

    public static void task1_1() {
        int mounth = 1;
        int salary = 29_000;

        while (salary <= 2_459_000) {
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + salary + " рублей");
            salary = salary + (29_000 + (salary / 100));
            mounth++;
        }
    }

    public static void task1_2() {
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

    public static void task1_3() {
        double fertility = (double) 17 / 1000;
        double mortality = (double) 8 / 1000;
        int population = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            population = population + (int) (population * fertility - population * mortality);
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }
    }

    public static void task2_1() {

    }

    public static void task2_2() {

    }

    public static void task2_3() {

    }

    public static void task2_4() {
        int friday = 3;
        for (int i = friday; i <= 31; i += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday += 7;
        }
    }

    public static void task3_1() {
        int currentYear = 2022;
        int startOfPeriod = currentYear - 200;
        int finishOfPeriod = currentYear + 79;
        for (int year = 0; year <= finishOfPeriod; year += 79) {
            if (year > startOfPeriod) {
                System.out.println(year);
            }
        }
    }

    public static void task3_2() {
        for (int i = 1; i <= 10; i++) {
            int number = 2;
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}