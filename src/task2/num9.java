package task2;

import javax.swing.*;
import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку 1:");
        String str1 = scanner.nextLine();
        System.out.println("введите prefix:");
        String pr = scanner.nextLine();
        System.out.println("введите строку 2:");
        String str2=scanner.nextLine();
        System.out.println("введите строку suffix:");
        String suf = scanner.nextLine();
        System.out.println("Prefix:" + isPrefix(str1,pr));
        System.out.println("Suffix:" + isSuffix(str2,suf));

    }
    public static boolean isPrefix(String str1, String pr){
        int prefix = pr.length()-1; //длина префикса без тире
        for (int i=0; i<prefix; i++) {
            if (str1.charAt(i) == pr.charAt(i)) //сравниваем символы с 0 до предпоследнего
                return true;
        }
        return false;
    }
    public static boolean isSuffix(String str2, String suf){
        int suffix = suf.length()-1; //длина суффикса без тире
        for (int i=1; i<=suffix; i++) {
            if (str2.charAt(str2.length()-i) == suf.charAt(suf.length()-i)) //сравнивам символы с последнего до 1
                return true;
        }
        return false;

    }

}
