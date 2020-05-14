package task2;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String s = scanner.nextLine();
        System.out.println("Число десятиченых знаков: " + getDecimalPlaces(s));  //выводим результат

    }

    public static int getDecimalPlaces(String s) {
        int n = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) { //проходимся по всей строке и если находим точку, то фиксируем ее место
            if (s.charAt(i) == '.') {
                n = i;
                for (int j = n+1; j < s.length(); j++) {  //считаем сколько знаков с места точки+1 до конца строки
                    k++;
                }
            }
        }
        return k;  //возвращаем это количество
    }
}

