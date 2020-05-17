package task3;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        System.out.println(checkPerfect(n));
    }
    public static boolean checkPerfect(int n){
        int sum=0;
        for (int i=1; i<n; i++){
            if (n%i==0) //проверяем делится ли число n на кокое либо предыдущее число
                sum+=i;  //и записываем делитель в сумму
        }
        if (sum==n)
            return true;
        else
            return false;
    }
}
