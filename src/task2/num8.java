package task2;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку 1:");
        String str1 = scanner.nextLine();
        System.out.println("введите строку 2:");
        String str2 = scanner.nextLine();
        System.out.println(isStrangePair(str1,str2));  //выводим результат


    }
    public static boolean isStrangePair(String str1, String str2){
        if ((str1.charAt(0)==str2.charAt(str2.length()-1)) && (str1.charAt(str1.length()-1)==str2.charAt(0)))//проверяем равенство символов
            return true;
        else
            return false;
    }

}
