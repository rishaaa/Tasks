package task3;

import java.util.Scanner;

public class num6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите длину первого массива:");
        int n1 = scanner.nextInt();
        System.out.println("введите длину второго массива:");
        int n2 = scanner.nextInt();
        System.out.println(Same(n1,n2)); //выводи результат
    }
    public static boolean Same(int n1, int n2){
        Scanner scanner = new Scanner(System.in);
        int k1=0; int k2=0;
        int[] array1 = new int[n1];  //создаем первый массив
        System.out.println("введите первый массив:");
        for (int i1=0; i1<n1;i1++) {
            array1[i1] = scanner.nextInt();  //вводим элементы первого массива
        }
        for (int i1=0; i1<n1;i1++) {
            for (int j1=i1+1; j1<n1;j1++ ){
                if (array1[i1]==array1[j1]) //сравниваем каждый элемент со следующим
                    k1+=1; break; //если совпадают записываем в кол-во повторяющих символов
            }
        }
        int[] array2 = new int[n2];  //создаем второй массив
        System.out.println("введите второй массив:");
        for (int i2=0; i2<n2; i2++) {
            array2[i2] = scanner.nextInt();  //вводим элементы второго массива
        }
        for (int i2=0; i2<n2; i2++) {
            for(int j2=i2+1; j2<n2; j2++){
                if (array2[i2]==array2[j2])  //сравниваем каждый элемент со следующим
                    k2+=1; break;
            }
        }
        if (n1-k1==n2-k2) //сравниваем количества уникальных символов
            return true;
        else
            return false;
    }
}
