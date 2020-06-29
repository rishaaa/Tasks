package task6;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число:");
        int n = scanner.nextInt();
        System.out.println(bell(n));
    }
    public static int bell(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else {
            int[][] mas = new int[n][n];
            mas[1][0] = mas[0][0] = 1;
            mas[1][1] = 2;
            for (int j = 2; j < n; j++) {
                mas[j][0] = mas[j - 1][j - 1];
                for (int i = 1; i <= j; i++) mas[j][i] = mas[j][i - 1] + mas[j - 1][i - 1];
            }
            return mas[n - 1][n - 1];
        }
    }
}
