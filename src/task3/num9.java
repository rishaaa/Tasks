package task3;

import java.util.Scanner;

public class num9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int n = scanner.nextInt();
        System.out.println(nextPrime(n)); //выводим ответ
    }
    public static int nextPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { //проверяем делится ли n на какое либо предыдущее число
                n += 1; //если да, прибавляем 1
                i=2; //и снова начинаем с 2 делить на все числа до n
            }
        }
        return n;
    }
}
