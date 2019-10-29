/*
        Задача про коробки.

        Даны данные (высота, ширина, длина) двух коробок.
        Написать true, если одну можно засунуть в другую.
        Написать false, если они не сравнимы.
        Написать ОК - если они равны.
 */

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int box1_a, box1_b, box1_c;
        int box2_a, box2_b, box2_c;

        box1_a = scanner.nextInt();
        box1_b = scanner.nextInt();
        box1_c = scanner.nextInt();

        box2_a = scanner.nextInt();
        box2_b = scanner.nextInt();
        box2_c = scanner.nextInt();

        int x1, x2, x3;
        int y1, y2, y3;

        // Сортировка параметров первой коробки.
        x1 = box1_a;

        if (x1 > box1_b) {
            x1 = box1_b;
            x2 = box1_a;
        } else {
            x2 = box1_b;
        }

        if (x2 > box1_c) {
            x3 = x2;
            x2 = box1_c;

            if (x1 > box1_c) {
                x1 = box1_c;
                x2 = box1_a;
            }
        } else {
            x3 = box1_c;
        }

        // Сортировка параметров второй коробки.
        y1 = box2_a;

        if (y1 > box2_b) {
            y1 = box2_b;
            y2 = box2_a;
        } else {
            y2 = box2_b;
        }

        if (y2 > box2_c) {
            y2 = box2_c;
            y3 = box2_b;
            if (y1 > box2_c) {
                y1 = box2_c;
                y2 = box2_a;
            }
        } else {
            y3 = box2_c;
        }

        /*
           System.out.println(x1 + " " + x2 + " " + x3);
           System.out.println(y1 + " " + y2 + " " + y3);
        */

        // Сравнение коробок.
        if (((x3 > y3) && (x2 > y2) && (x1 > y1)) || ((y3 > x3) && (y2 > x2) && (y1 > x1))) {
            System.out.println(true);
        } else if ((x1 == y1) && (x2 == y2) && (x3 == y3)) {
            System.out.println("OK");
        } else {
            System.out.println(false);
        }
    }
}
