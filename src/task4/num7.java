package task4;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите строку");
        String str = scanner.nextLine();
        System.out.println(toStarShorthand(str));
    }

    public static String toStarShorthand(String str) {
        int n = 1;
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            for (int j=i+1; j<str.length(); j++){
                if (str.charAt(i)==str.charAt(j)) { //срааниваем символ с каждым следующим
                    n += 1; //если равны, то прибавляем единица в количество
                    i++; //прибавляем к i единицу, чтобы не сравнивать е символы, которые мы уже сравнили
                }
            }
            if (n==1){ //если символ в строке один, то мы его просто записываем в новую
                str2.append(str.charAt(i));
            }
            else { //если символов в строке больше одного, то в новую строку мы его записываем как символ*n
                str2.append(str.charAt(i)).append('*').append(n);
                n=1;
            }
        }
        return str2.toString();
    }
}
