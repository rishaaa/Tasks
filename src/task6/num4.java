package task6;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(stripUrlParams(str));
    }
    public static String stripUrlParams(String... strings) {
        String str1 = strings[0].substring(0, strings[0].indexOf("?") + 1);
        String str12 = strings[0].substring(strings[0].indexOf("?") + 1);
        String[] split = str12.split("&");
        String list = "";
        if (strings.length == 2) {
            list += strings[1];
        }
        String result = "";
        for (int i = split.length - 1; i >= 0; i--) {
            if (!list.contains(String.valueOf(split[i].charAt(0)))) {
                list += split[i].charAt(0);
                result += split[i] + "&";
            }
        }
        result = str1 + result.substring(0, result.length() - 1);
        return result;
    }
}
