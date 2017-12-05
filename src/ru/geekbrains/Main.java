package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here:
        while (repeatQuestion != 0) {
            System.out.println("Последовательно через Enter введите числовые координаты двух клеток шахматного поля 8х8: x1, y1, x2, y2");
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int check1 = (x1 + y1) % 2;
            int check2 = (x2 + y2) % 2;
            if (check1 == check2) System.out.println("Клетки одинакового цвета");
            else System.out.println("Клетки разного цвета");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion == 1) continue here;
            else break;
        }
    }
}
