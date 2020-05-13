package task1;

import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(sumOfCubes(n));  //выводим результат
    }
    public static int sumOfCubes (int n){
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        int[] array = new int[n];  //создаем массив
        for (int i=0; i<array.length; i++) {
            array[i]=scanner.nextInt();  //вводим элементы массива
            sum += Math.pow(array[i], 3); //находим сумму кубов
        }
        return sum;
    }
}
