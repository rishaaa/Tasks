package task1;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many chickens:");
        int chickens = scanner.nextInt();  //Вводим колтчество куриц
        System.out.println("how many cows:");
        int cows = scanner.nextInt();  //Вводим количество коров
        System.out.println("how many pigs:");
        int pigs = scanner.nextInt();  //Вводим количество свиней
        System.out.println(legs(chickens,cows,pigs));  //Выводи количество ног
    }
    public static int legs(int chickens, int cows, int pigs){
        int a = chickens*2;  //Считаем количество ног у всех куриц
        int b = cows*4;  //Количество ног у всех коров
        int c = pigs*4;  //Количество ног у всех свиней
        int s = a+b+c;  //Общее количество ног
        return s;

    }
}
