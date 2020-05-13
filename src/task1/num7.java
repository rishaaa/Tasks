package task1;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            System.out.println(sumTo(n)); //выводим резкльтат
        }
    public static int sumTo(int n){
        int s = n*(n+1)/2; //считаем сумму всех чисел до n
        return s;
    }

}
