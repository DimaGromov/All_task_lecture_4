/*
        Напишите программу, которая петачает среднее арифметическое чисел
        между двумя введёнными.
 */

import java.util.Scanner;

public class Task_slide_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        int sum=0;


        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        // Если првое число больше, то поменяем их местами для удобства.
        if(num1 > num2){
            int val = num1;
            num1 = num2;
            num2=val;
        }

        for (int i = num1; i <= num2 ; i++) {
            sum+=i;
         }

        System.out.println(((double)sum/((num2-num1)+1)));
    }
}
