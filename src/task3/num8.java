package task3;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.next();
        System.out.println(longestZero(str));
    }

    public static String longestZero(String str) {
        String str1="";
        String str_max="";
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == '0') { //если символ равен 0, то записываем его в новую строку
                str1 += str.charAt(i);
                if (str1.length() > str_max.length()) //если новая строка больше максимальной, то она становится максимальной
                    str_max = str1;
            }
            if (str.charAt(i) == '1') //если  встречается 1, значит последовательность нулей прервалась и строка обнуляется
                str1 = "";
        }
        return str_max; //возвращаем максимальную строку
    }
}
