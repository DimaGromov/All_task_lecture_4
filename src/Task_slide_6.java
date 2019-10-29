/*
        На вход программы подается три числа.
        Вывести true, если сумма любых из них равна 20.
        Иначе вывести false.
 */

import java.util.Scanner;

public class Task_slide_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, num3;

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if ((num1 + num2 == 20) || (num1 + num3 == 20) || (num2 + num3 == 20)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
