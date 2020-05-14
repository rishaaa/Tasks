package task2;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n:");
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }
    public static int Fibonacci (int n){
        if (n>=2)
            return Fibonacci(n-1)+Fibonacci(n-2);
        else
            return 1;
        }

}

