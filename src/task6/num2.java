package task6;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(translateWord(str));
    }

    private static String translateWord(String str) {
        String str1 = "";
        String str2 = "";
        int n = 0;
        if (str.charAt(0) != 'e' || str.charAt(0) != 'y' || str.charAt(0) != 'u' || str.charAt(0) != 'i' || str.charAt(0) != 'o' || str.charAt(0) != 'a') {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'w' || str.charAt(i) == 'r' || str.charAt(i) == 't' || str.charAt(i) == 'p' || str.charAt(i) == 's' || str.charAt(i) == 'd' || str.charAt(i) == 'f' || str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l' || str.charAt(i) == 'z' || str.charAt(i) == 'x' || str.charAt(i) == 'c' || str.charAt(i) == 'v' || str.charAt(i) == 'b' || str.charAt(i) == 'n' || str.charAt(i) == 'm') {
                    str1 = str1 + str.charAt(i);
                    n++;
                } else break;
            }
            for (int j = n; j < str.length(); j++) {
                str2 = str2 + str.charAt(j);
            }
            return str2 + str1 + "ay";
        } else {
            return str + "yay";
        }
    }

    private static void translateSentence(String str) {
        String str3 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                str3 = str3 + str.charAt(i);
            } else {
                System.out.print(translateWord(str3) + " ");
                str3 = "";
            }
        }
        System.out.print(translateWord(str3));

    }
}


