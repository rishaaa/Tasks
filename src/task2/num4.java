package task2;

import java.util.Arrays;
import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(cumulativeSum(n))); //выводим результат
    }
    public static int[] cumulativeSum(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива:");
        int[] array = new int[n];  //создаем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();  //вводим элементы массива
        }
        System.out.println(Arrays.toString(array));  //выводим этот массив (для наглядности)
        int[] array2 = new int[n];  //создаем втрой массив
        int s=0;
        for (int i=0; i<array.length; i++){ //проходим по всему ервому массиву и каждое следующее число складываем с суммой предыдущих
            array2[i]=s+array[i];
            s=array2[i];
            }
        return array2; //возвращаем новый массив
    }

}
