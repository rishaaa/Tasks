package task4;

import java.util.Scanner;

public class num8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первую строку:");
        String str1 = scanner.nextLine();
        System.out.println("введите вторую строку:");
        String str2 = scanner.nextLine();
        System.out.println(doesRhyme(str1,str2));
    }
    public static boolean doesRhyme(String str1, String str2) {
        int max1 = 0;
        int max2 = 0;
        String str3 = "";
        String str4="";
        for (int i1 = 0; i1 < str1.length(); i1++) {
            if ((str1.charAt(i1) == ' ') & (i1 > max1)) //находим пробел в перовой строке и фиксируем его место
                max1 = i1;
        }
        for (int j1 = max1; j1 < str1.length(); j1++) { //с последнего пробела и до конца строки(последнее слово) ищем гласные
            if ((str1.charAt(j1) == 'a') | (str1.charAt(j1) == 'e') | (str1.charAt(j1) == 'i') | (str1.charAt(j1) == 'o') | (str1.charAt(j1) == 'u') | (str1.charAt(j1) == 'y')|
                    (str1.charAt(j1) == 'A') | (str1.charAt(j1) == 'E') | (str1.charAt(j1) == 'I') | (str1.charAt(j1) == 'O') | (str1.charAt(j1) == 'U') | (str1.charAt(j1) == 'Y'))
                str3 += str1.charAt(j1);//если находим, то записываем их в новую строку
        }
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if ((str2.charAt(i2) == ' ') & (i2 > max2)) //находим пробел во второй строке и фиксируем его место
                max2 = i2;
        }
        for (int j2 = max2; j2 < str2.length(); j2++) { // ищем гласные в последнем слове
            if ((str2.charAt(j2) == 'a') | (str2.charAt(j2) == 'e') | (str2.charAt(j2) == 'i') | (str2.charAt(j2) == 'o') | (str2.charAt(j2) == 'u') | (str2.charAt(j2) == 'y')|
                    (str2.charAt(j2) == 'A') | (str2.charAt(j2) == 'E') | (str2.charAt(j2) == 'I') | (str2.charAt(j2) == 'O') | (str2.charAt(j2) == 'U') | (str2.charAt(j2) == 'Y'))
                str4 += str2.charAt(j2); //если находим, что записываем их в новую строку
        }
        if (str3.equalsIgnoreCase(str4)) //сравниваем две новые строки без учета регистра
            return true;
        else
            return false;
    }
}
