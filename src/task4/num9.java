package task4;

import java.util.Scanner;

public class num9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число:");
        String num1 = scanner.nextLine();
        System.out.println("введите второе число:");
        String num2 = scanner.nextLine();
        System.out.println(trouble(num1,num2));
    }
    public static boolean trouble(String num1, String num2){
        char k=0;
        for (int i=0; i<num1.length()-2; i++) {
            if ((num1.charAt(i) == num1.charAt(i + 1)) && (num1.charAt(i) == num1.charAt(i + 2))) //проверяем наличие 3х одинаковых чисел, идущих подряд
                k = num1.charAt(i); //если они есть, то в переменную k записываем какое это число

            for (int j = 0; j < num2.length() - 1; j++) {
                if ((num2.charAt(j) == num2.charAt(j + 1)) & (num2.charAt(j) == k)) //проверяем есть ли 2 подряд идущих числа, которые равны k
                    return true;

            }
        }
        return false;
    }
}
