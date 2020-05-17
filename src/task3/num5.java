package task3;

import java.util.Scanner;

public class num5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(isValidHexCode(str));
    }
    public static boolean isValidHexCode(String str) {
        if (str.length() == 7) { //проверяем условие, что код имеет ровно 6 знаков и #
            for (int i = 0; i < str.length(); i++) {
                if ((str.charAt(0) == '#') | (str.charAt(i) == 'A') | (str.charAt(i) == 'B') | (str.charAt(i) == 'C') | (str.charAt(i) == 'D') |
                        (str.charAt(i) == 'E') | (str.charAt(i) == 'F') | (str.charAt(i) == 'a') | (str.charAt(i) == 'b') | (str.charAt(i) == 'c') |
                        (str.charAt(i) == 'd') | (str.charAt(i) == 'e') | (str.charAt(i) == 'f') | (str.charAt(i) == '0') | (str.charAt(i) == '1') |
                        (str.charAt(i) == '2') | (str.charAt(i) == '3') | (str.charAt(i) == '4') | (str.charAt(i) == '5') | (str.charAt(i) == '6') |
                        (str.charAt(i) == '7') | (str.charAt(i) == '8') | (str.charAt(i) == '9'));
                //проверяем что пеовый символ #, а все остальные A-F или a-f или 0-9
                else
                    return false;
            }
            return true;
        }
        return false;
    }

}
