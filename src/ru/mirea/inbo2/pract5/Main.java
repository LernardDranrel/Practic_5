package ru.mirea.inbo2.pract5;

import java.util.Scanner;

class Task9 {
    public int function(int count_1, int count_2) {
        if (count_1 == 0 && count_2 > 0) {
            return 1;
        } else if (count_1 == 1) {
            return count_2 + 1;
        } else if (count_1 > 1 && count_2 == 0) {
            return 0;
        } else {
            return function(count_1 - 1, count_2 - 1) + function(count_1, count_2 - 1);
        }
    }
}

class Task10 {
    public int length(int number) {
        if (number < 10) {
            return 1;
        } else {
            return 1 + length(number / 10);
        }
    }

    public int reverse(int number) {
        if (number % 10 == 0 && number / 100 == 0) {
            return number / 10;
        }
        int num = number / 10 % 10;
        number /= 100;
        return (int) (num * Math.pow(10, length(number)) + (reverse(number * 10)));
    }
}

class Task11 {
    public int sequence() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number != 1) {
            if (number == 0) {
                number = scanner.nextInt();
                if (number == 1) {
                    return 1 + sequence();
                }
            }
            if (number == 0) {
                return 0;
            }
            number = scanner.nextInt();
        }
        return 1 + sequence();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task9 task9 = new Task9();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(task9.function(a, b));
        System.out.println("----------------------------------------");
        Task10 task10 = new Task10();
        int number = scanner.nextInt() * 10;
        System.out.println(task10.reverse(number));
        System.out.println("----------------------------------------");
        Task11 task11 = new Task11();
        System.out.println(task11.sequence());
    }
}