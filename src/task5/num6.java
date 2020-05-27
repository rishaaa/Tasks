package task5;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите числовую строку:");
        long str = scanner.nextLong();
        System.out.println(validateCard(str));
    }

    public static boolean validateCard(long str) {
        int sum = 0;
        StringBuffer str2 = new StringBuffer(String.valueOf(str));
        str2.deleteCharAt(str2.length() - 1).reverse(); //удаляем последний символ и перевораиваем строку
        for (int i = 0; i < str2.length(); i++) {
            if (i % 2 == 0) { //если число стоит на четном месте
                int a = Integer.parseInt(String.valueOf(str2.charAt(i))) * 2; //то умножаем его на 2
                while (a > 9) { //если произведение более 1 цифры, то складываем цифры этого произведения
                    int pr = 0;
                    while (a != 0) {
                        pr = pr + (a % 10);
                        a = a / 10;
                    }
                    a = pr;
                }
                sum += a; //и когда цифра одна, записываем ее в сумму
            } else
                sum += Integer.parseInt(String.valueOf(str2.charAt(i))); //если произведение изначально было из одной цифпы, то просто записываем в сумму
        }
        return 10 - (sum % 10) == str % 10;
    }
}
