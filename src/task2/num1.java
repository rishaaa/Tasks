package task2;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(repeat(n, str));  //выводим ответ

    }
    public static String repeat(int n, String str){
        String str2 ="";  //создаем пустую строку
        for (int i=0; i<str.length(); i++){  //цикл от 1 до последней буквы
            char ch = str.charAt(i);
            for (int j=1; j<=n; j++){  //цикл, повторяющий каждый символ n раз
                str2=str2+ch;
            }
        }
        return str2;  //возвращаем новую строку
    }
}
