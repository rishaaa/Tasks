package task4;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите чило:");
        int num = scanner.nextInt();
        System.out.println(bugger(num));
    }
    static int bugger (int num){
        int k=0;
        while(num > 9) {
            int a=1;
            while(num > 0) {
                a *= num % 10;
                num /= 10;
            }
            num = a;
            k++;
        }
        return k;
    }
}
