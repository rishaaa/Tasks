package task4;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String str1 = scanner.nextLine();
        System.out.println("Введите строку 2:");
        String str2 = scanner.nextLine();
        System.out.println(toCamelCase(str1));
        System.out.println(toSnakeCase(str2));
    }
    public static String toCamelCase (String str1){
        while (str1.contains("_"))
            str1 = str1.substring(0, str1.indexOf("_")) + Character.toUpperCase(str1.charAt(str1.indexOf("_") + 1)) +
                    str1.substring(str1.indexOf("_") + 2);
        return str1;
    }
    public static String toSnakeCase(String str2){
        StringBuilder result= new StringBuilder();
        for (char c : str2.toCharArray())
            result.append(Character.isUpperCase(c) ? "_" + Character.toLowerCase(c) : c);
        return result.toString();
    }
}



