package task6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(longestNonrepeatingSubstring(str));
    }
     private static String longestNonrepeatingSubstring(String str){
        Map<Character, Integer> visited = new HashMap<>();
        String str2 = "";
        int start = 0;
        for (int end = 0; end < str.length(); end++) {
            char currChar = str.charAt(end);
            if (visited.containsKey(currChar)) { //каждый новый символ мы сравниваем с посещенными
                start = Math.max(visited.get(currChar)+1, start); //если символ уже является частью подстроки с неповтряющимися символами, то обновляем стартовый индекс
            }
            if (str2.length() < end - start + 1) {
                str2 = str.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return str2;
    }
}
