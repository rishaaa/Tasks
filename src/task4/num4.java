package task4;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args){
        System.out.println("$"+String.format("%.2f",overTime()));
    }
    public static double overTime() {
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        float[] array = new float[4];
        System.out.println("введите массив:");
        for (int i=0; i<4; i++) {
            array[i] = scanner.nextFloat();
        }
        if (array[1] <= 17)
            sum = sum + (array[1] - array[0]) * array[2];
        if (array[1] > 17)
            sum = sum + (array[1] - 17) * array[2] * array[3] + (17 - array[0]) * array[2];
        return sum;
    }
}
