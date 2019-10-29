/*
        На вход программы подается рост мальчиков (их три), стоящих рядом друг с другом.
        Вывести true, если они стоят в порядке возрастания.
        Иначе false.
 */

import java.util.Scanner;

public class Task_slide_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height_boy1, height_boy2, height_boy3;

        System.out.print("Введите рост первого парнишки: ");
        height_boy1 = scanner.nextInt();

        System.out.print("Введите рост второго парнишки: ");
        height_boy2 = scanner.nextInt();

        System.out.print("Введите рост третьего парнишки: ");
        height_boy3 = scanner.nextInt();

        if ((height_boy1 < height_boy2) && (height_boy2 < height_boy3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
