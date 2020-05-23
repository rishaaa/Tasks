package task4;

import java.util.Scanner;

public class num2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку:");
        String str = scanner.nextLine();
        System.out.println(split(str));
    }
    public static String split(String str){
        int k_left=0; //количество скобок слева
        int k_right=0; //количество скобок справа
        StringBuilder str2 = new StringBuilder();
        str2.append('[');
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='(') { //если встречаем в строке левую скобку
                str2.append(str.charAt(i)); //добавляем ее в новую строку
                k_left += 1; //и прибаляеи 1 к количеству
            }
            else { //если встречаем правую скобку, то добавляем ее в новую строку и +1 в количество
                str2.append(')');
                k_right+=1;
            }
            if (k_left==k_right) { //если количество левых и правых скобок уравновесилось
                k_left = 0;
                k_right=0;
                str2.append(','); //то ставим запятую
            }
        }
        str2.deleteCharAt(str2.length()-1); //удаляем лишнюю запятую
        str2.append(']');
        return str2.toString();
    }
}
