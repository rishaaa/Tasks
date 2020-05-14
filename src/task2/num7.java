package task2;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите почтовый индекс:");
        String str = scanner.next();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        if (str.length() == 5) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0' || str.charAt(i) == '1' || str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4' || str.charAt(i) == '5' || str.charAt(i) == '6' || str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9');
                //проверяем, что каждый символ равен 0-9
                else
                    return false;
            }

        }
        return true;
    }

}
