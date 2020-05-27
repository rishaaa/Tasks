package task5;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество чисел:");
        int n =scanner.nextInt();
        System.out.println(sumDigProd(n));
    }
    public static int sumDigProd(int n){
        Scanner scanner = new Scanner(System.in);
        int c=0;
        int[] array = new int[n];
        System.out.println("введите массив:");
        for (int i=0; i<n; i++){
            array[i]=scanner.nextInt(); //вводим числа
            c+=array[i]; //считаем их сумму
        }
        while (c > 9) {  //пока с не станет однозначным числом находим произведение цифр
            int pr=1;
            while (c != 0) {
                pr = pr * (c % 10);
                c = c / 10;
            }
            c=pr;
        }
        return c;
    }
}
