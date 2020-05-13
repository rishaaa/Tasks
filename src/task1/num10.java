package task1;

import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a:");
        int a = scanner.nextInt();
        System.out.println("b:");
        int b = scanner.nextInt();
        System.out.println("c:");
        int c = scanner.nextInt();
        System.out.println(abcmath(a,b,c));  //выводим результат
    }
    public static boolean abcmath (int a, int b, int c){
        for (int i=1; i<b; i++){  //прибавляем а к себе b раз
            a=a+a;
        }
        if (a%c==0)  //проверяем деление без остатка и возвращаем положительный или отрицательный ответ
            return true;
        else
            return false;
        }
}
