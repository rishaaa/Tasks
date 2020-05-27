package task5;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку 1:");
        String str1 =scanner.nextLine();
        System.out.println("введите строку 2:");
        String str2 =scanner.nextLine();
        System.out.println(canComplete(str1, str2));
    }
    static boolean canComplete(String str1, String str2) {
        int i = 0;
        for (char c : str2.toCharArray())
            if (str1.charAt(i) == c) i++;
        return str1.length() == i;
    }
}
