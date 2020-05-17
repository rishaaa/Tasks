package task3;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(flipEndChars(str));
    }
    public static String flipEndChars(String str) {
        char[] array = str.toCharArray(); //преобразуем строку в массив
        if (str.length() < 2)
            return ("Несовместимо");
        if (array[0] == array[array.length - 1])
            return ("Два-это пара");
        else {
            char t = array[0]; // меняеем местами символы, используя переменную t
            array[0] = array[array.length - 1];
            array[array.length - 1] = t;
            str = new String(array);
        }
        return str;

    }

}
