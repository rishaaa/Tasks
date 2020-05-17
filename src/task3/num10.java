package task3;

import java.util.Scanner;
import static java.lang.Math.pow;

public class num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();
        System.out.println("z:");
        int z = scanner.nextInt();
        if ((pow(x,2) == pow(y,2) + pow(z,2)) | (pow(y,2)== pow(x,2) + pow(z,2)) | (pow(z,2) == pow(x,2) + pow(y,2))) //теорема Пифагора
            System.out.println("true");
        else
            System.out.println("false");
    }
}
