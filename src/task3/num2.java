package task3;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = scanner.nextLine();
        System.out.println(findZip(str)); //выводим результат
    }
    public static int findZip(String str){
        int p=0; int n=0;
        for (int i=0; i<str.length()-2; i++){ //проходим по всей строке и находим 'zip'
            if ((str.charAt(i)=='z') && (str.charAt(i+1)=='i') && (str.charAt(i+2)=='p') && (i>=p)) {
                n += 1; //считаем количество вхождение 'zip' в строку
                if (n<=2)
                    p = i; //фиксируем позицию, где 'zip' входит в строку
            }

        }
        if (n<2) //если 'zip' встречается меньше 2 раз возвращаем -1
            return -1;
        else
            return p;
    }
}
