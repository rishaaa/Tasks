package task5;

import java.util.Arrays;
import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println("введите количествосимволов в массиве:");
        int n = scanner.nextInt();
        int [] array = new int[n];
        System.out.println("введите массив:");
        for (int i=0; i<n; i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("encrypt: " + encrypt(str));
        System.out.println("decrypt: " +decrypt(array));
    }
    public static String encrypt(String str){
        int[] str2 = new int[str.length()];
        str2[0]= str.charAt(0); //первый символ в новый строке равен коду ascii первого символа данной строки
        for (int i=1; i<str.length(); i++){ //все последующие символы в новой строке коду ascii символа минус все предыдущие коды ascii
            str2[i]=str.charAt(i)-str.charAt(i-1);
        }
        return Arrays.toString(str2); //возвращаем строку2 в виде массива
    }
    public static String decrypt (int[] array){
        String str3="";// создаем новую постую строку
        str3+=(char) array[0]; //првый символ новой строки равен коду ascii первого символа из массива
        for (int i=1; i<array.length; i++){ //каждый следующий символ в новой строке равен коду ascii символа+все предыдущие
            str3+= (char) (array[i]+str3.charAt(i-1));
        }
        return str3;

    }
}
