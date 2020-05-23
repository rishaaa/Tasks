package task4;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println("количество слов (n):");
        int n = scanner.nextInt();
        System.out.println("количество символов в строке (k):");
        int k=scanner.nextInt();
        essay(str,n,k);
        System.out.println();
    }
    public static void essay( String str, int n, int k){
        int d = 0;
        String[] word = str.split(" "); //разделяем слова по пробелу
        if (word.length==n){ //если количество слов равно n
            for (String str2 : word)
                if (str2.length() + d <= k){ //если длина строки меньше допустимого количества символов в строке
                System.out.print(str2 + " "); //то записываем слово в эту строку
                d= d + str2.length(); //фиксируем длину строки
            }
            else { //если длина строки становится больше допустимого количества символов в строке
                System.out.println(""); //то опускаемся на одну строчку вниз
                System.out.print(str2 + " "); //и записываем следующее слово уже в новой строке
                d=str2.length();
            }
        }
        else {
            System.out.println("Количество слов не соответствует n");
        }
    }
}
