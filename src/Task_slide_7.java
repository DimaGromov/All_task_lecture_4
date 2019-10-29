/*
        На вход программы подается год.
        Вывести true, если он високостный.
        Иначе false.
 */

import java.util.Scanner;

public class Task_slide_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short year = scanner.nextShort();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
