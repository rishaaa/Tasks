package task5;

import java.util.Scanner;

public class num9 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(correctTitle(str));

    }
    public static String correctTitle(String str){
        StringBuilder str2 = new StringBuilder();
        str = str.replace("-", " - "); //т.к дефисные слова являются отдельными словами, отделям их пробелами от дефиса
        String[] word = str.split(" "); //разделям строку на слова по пробелу
        for (String s : word){
            if ((s.equalsIgnoreCase("in"))|(s.equalsIgnoreCase("the"))|(s.equalsIgnoreCase("and"))|(s.equalsIgnoreCase("of")))
                //если слова в строке совпадают с in, the, and ,of (без учета регистра)
                str2.append(Character.toLowerCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" "); //то записываем их в новую строку с маленькой буквы
            else
                str2.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" "); //все остальные слова записываем с большой буквы
        }
        return str2.toString();
    }
}
